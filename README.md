# NeoApp - Desafio Técnico (Estágio TI)

## Objetivo
Construir um **MVP de uma REST API** para cadastro de clientes pessoa física, com as seguintes funcionalidades:
- Inclusão de novos clientes
- Atualização de clientes existentes
- Exclusão de clientes existentes
- Listagem de clientes de forma **paginada**
- Busca por atributos cadastrais do cliente
- Cada elemento retornado deve conter a **idade calculada** a partir da data de nascimento

---

## Requisitos técnicos
- Utilizar **Spring Boot**
- Utilizar **Swagger** para documentação/especificação da API
- Utilizar **Spring Security + JWT** para segurança da aplicação
- Utilizar **Spring Data JPA** para abstração da camada de acesso a dados
- Pode ser usado qualquer mecanismo para armazenamento dos dados

---

## Critérios de avaliação
- Utilização de **boas práticas de código**
- Utilização de **padrões de projeto**
- **Cobertura de testes** (unitários, integrados e/ou de comportamento)
- **Design REST** da API

---

## Bônus
- Empacotar a aplicação com **Docker**
- Hospedar em algum provedor **cloud** e fornecer a URL para acesso

---

# 🚀 Implementação
- Criação dos endpoints de CRUD para clientes, incluindo paginação e cálculo automático da idade. 
- Configuração de Spring Security com JWT para autenticação e autorização. 
- Estruturação do projeto em camadas (Controller, Service, Repository, DTOs). 
- Documentação dos endpoints com Swagger. 
- Empacotamento do projeto em containers Docker, incluindo Postgres e aplicação Spring Boot. 
- Implementação de testes unitários para serviços e utilitários de segurança (JWT).

## 🐳 Execução com Docker
- Clone o repositório 
- Configure as variáveis no arquivo .env (já fornecido e com aviso de uso apenas para este desafio técnico)
- Suba os containers:
  - `docker compose up --build` 
- A API estará disponível em: http://localhost:8080

## 📖 Documentação via Swagger
Acesse: http://localhost:8080/swagger-ui.html  
Todos os endpoints estão documentados, com exemplos de entrada e saída.

## 🧪 Testes
- Framework: **JUnit 5** + **Mockito** 
- Cobertura medida com JaCoCo 
- Testes implementados para:
  - Regras de negócio em UserService 
  - Geração e validação de JWT (JwtUtil)
- Classes auxiliares (DTOs e ClientManagementApplication) foram excluídas da cobertura para manter o relatório justo