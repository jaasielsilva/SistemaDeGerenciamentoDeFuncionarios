# SistemaDeGerenciamentoDeFuncionarios

## Visão Geral

Este projeto é um sistema simples de gerenciamento de funcionários desenvolvido em Java com interface gráfica usando Swing (JFrame) e conectado a um banco de dados MySQL. O sistema permite realizar operações básicas de CRUD (Create, Read, Update, Delete) para funcionários, incluindo adicionar novos funcionários, listar todos os funcionários, atualizar informações e excluir funcionários existentes.

### Descrição das Pastas e Arquivos

- **src/model**: Contém as classes relacionadas ao modelo de dados, como `Funcionario.java` que representa um funcionário e `DatabaseConnection.java` para gerenciar a conexão com o banco de dados.
  
- **src/view**: Inclui a interface gráfica (`FuncionarioView.java`) onde os usuários interagem com o sistema para adicionar, listar, atualizar e excluir funcionários.

- **src/controller**: Contém o controlador (`FuncionarioController.java`) que coordena as interações entre a view e o modelo, implementando a lógica de negócios.

- **src/main**: O ponto de entrada do aplicativo (`Main.java`) que inicializa o sistema e configura o ambiente inicial.

- **lib**: Pasta onde você deve incluir o arquivo `mysql-connector-java.jar` necessário para conectar o Java ao MySQL.

## Requisitos

Certifique-se de ter os seguintes requisitos instalados em sua máquina:

- Java JDK 8 ou superior
- MySQL Server
- MySQL Connector Java

## Configuração do Banco de Dados

Para configurar o banco de dados necessário para o funcionamento do sistema, siga os passos abaixo:

1. Crie um banco de dados no MySQL:

```sql
CREATE DATABASE funcionario_db;
USE funcionario_db;


## Requisitos

- Java JDK 8 ou superior
- MySQL Server
- MySQL Connector Java

## Configuração do Banco de Dados

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

