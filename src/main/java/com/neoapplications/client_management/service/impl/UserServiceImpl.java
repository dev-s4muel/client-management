package com.neoapplications.client_management.service.impl;

import com.neoapplications.client_management.dto.user.UserDto;
import com.neoapplications.client_management.exceptions.CpfAlreadyRegisteredException;
import com.neoapplications.client_management.exceptions.EmailAlreadyRegisteredException;
import com.neoapplications.client_management.model.auth.User;
import com.neoapplications.client_management.repository.UserRepository;
import com.neoapplications.client_management.service.UserService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Slf4j
@AllArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;


    @Override
    public void registerUser(UserDto userDTO) {
        log.info("Iniciando o registro do usuário com e-mail: {}", userDTO.getEmail());

        // Verifica se o e-mail já está cadastrado
        if (userRepository.findByEmail(userDTO.getEmail()).isPresent()) {
            log.warn("Tentativa de registro com e-mail já cadastrado: {}", userDTO.getEmail());
            throw new EmailAlreadyRegisteredException();
        }

        // Verifica se o CPF já está cadastrado
        if (userRepository.findByCpf(userDTO.getCpf()).isPresent()) {
            log.warn("Tentativa de registro com CPF já cadastrado: {}", userDTO.getCpf());
            throw new CpfAlreadyRegisteredException();
        }

        User user = new User(
                userDTO.getName(),
                userDTO.getEmail(),
                passwordEncoder.encode(userDTO.getPassword()), // Criptografa a senha
                userDTO.getCpf(),
                userDTO.getCellPhone(),
                userDTO.getBirthDate()
        );

        userRepository.save(user);
        log.info("Usuário com e-mail {} registrado com sucesso!", user.getEmail());
    }
}
