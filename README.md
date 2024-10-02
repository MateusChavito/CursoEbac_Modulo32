# 📚 Sistema de Gestão de Cursos e Matrículas

Este repositório contém uma aplicação de exemplo para gerenciamento de cursos e matrículas utilizando JPA com Hibernate e PostgreSQL. A aplicação permite realizar operações CRUD em entidades como **Curso**, **Matricula** e **Produto**.

## 📦 Estrutura do Projeto

- **`Domain`**: Contém as entidades representadas no banco de dados.
- **`dao`**: Classes responsáveis pela interação com o banco de dados.
- **`tests`**: Testes unitários para validar o comportamento das entidades.

## 🚀 Funcionalidades

- **Cursos**: Cadastro, consulta, atualização e remoção de cursos.
- **Matrículas**: Gerenciamento de matrículas com status, datas e valores.
- **Produtos**: Cadastro de produtos com preço e nome.

## 🛠️ Tecnologias Utilizadas

- **Java 17**
- **JPA com Hibernate**
- **PostgreSQL**
- **JUnit** para testes

## 📥 Configuração

- Certifique-se de que o PostgreSQL esteja instalado e em execução.
- Atualize o arquivo `persistence.xml` com as credenciais do seu banco de dados.
