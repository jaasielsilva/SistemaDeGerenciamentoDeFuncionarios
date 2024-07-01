# Sistema de Gerenciamento de Funcionários

## Visão Geral

Este projeto é um sistema simples de gerenciamento de funcionários desenvolvido em Java com interface gráfica usando Swing (JFrame) e conectado a um banco de dados MySQL. O sistema permite realizar operações básicas de CRUD (Create, Read, Update, Delete) para funcionários.

## Estrutura do Projeto

- **src/model**: Contém as classes relacionadas ao modelo de dados (`Funcionario.java` e `DatabaseConnection.java`).
  
- **src/view**: Inclui a interface gráfica (`FuncionarioView.java`).

- **src/controller**: Contém o controlador (`FuncionarioController.java`).

- **src/main**: Ponto de entrada do aplicativo (`Main.java`).

- **lib**: Pasta para o arquivo `mysql-connector-java.jar`.

## Requisitos

- Java JDK 8 ou superior
- MySQL Server
- MySQL Connector Java

## Configuração do Banco de Dados

Para configurar o banco de dados necessário para o funcionamento do sistema, siga os passos abaixo:

1. Crie um banco de dados no MySQL:

```sql
CREATE DATABASE funcionario_db;
USE funcionario_db;

CREATE TABLE funcionarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    senha VARCHAR(255) NOT NULL,
    cargo ENUM('Administrador', 'Gerente', 'Funcionário') NOT NULL
);
