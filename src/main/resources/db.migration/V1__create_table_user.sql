-- Ativar extensão para geração de UUID (caso ainda não esteja ativa)
CREATE EXTENSION IF NOT EXISTS "pgcrypto";

CREATE TABLE tb_user (
    id UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    role VARCHAR(50) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    name VARCHAR(50) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    cpf CHAR(11) NOT NULL,
    cell_phone VARCHAR(11) NOT NULL,
    birth_date DATE NOT NULL,
    active BOOLEAN NOT NULL DEFAULT TRUE
);
