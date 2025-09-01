package com.neoapplications.client_management.repository;

import com.neoapplications.client_management.model.auth.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface UserRepository extends JpaRepository<User, UUID> {

    Optional<User> findByEmail(String email);

    Optional<User> findByCpf(String cpf);

    Optional<User> findByIdAndIsActiveTrue(UUID id);
}
