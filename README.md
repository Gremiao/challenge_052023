# challenge_052023

## Pré-requisitos
Para executar este projeto SpringBoot, é necessário antes, executar o script sql de criação do database e usuário: 
challenge_052023\src\main\webapp\WEB-INF\DBO\Script_for_create_database_and_user.sql
E baixar as dependencias do Maven.

## Tecnologias utilizadas
Java 17.0.6
SpringBoot 3.0.6
SpringBoot Data JPA 3.0.6
Lombok 1.18.26
Maven
SqlServer 2019
IntelliJ 2022.3.2

## Uso
Após iniciar a aplicação SpringBoot, será possível chamar as servlets:
Get > http://localhost:8445/company
Get > http://localhost:8445/supplier
Post > http://localhost:8445/company, passando o objeto JSON no body.

## Status do Projeto
Back-end (Em andamento)
Front-end (Não iniciado)
