# Welcome to Pet Management System

### Introduction
Pet Management System enables user to add, edit and delete pets from a database.

To run the Spring application, press the start button.

The database will be automatically created and populated, then a browser window with Swagger UI will open.

To test the functionality with a client, open the following Angular project:
* [front_petmanagement](https://github.com/AOrgla/front_petmanagement)

Start the Angular project front_petmanagement together with back_petmanagement. Open the Angular
project in browser (default address [localhost:4200](http://localhost:4200)).
To log in, use:
* username: John
* password: 123

John has three pets in his pets list.

Other users are:
* username: Mihkel
* password: 123

* username: Janis
* password: 123

These users have empty lists.

### Features

* User registration with input field validation
* User login
* User can add pets
* User can edit pets (every property except Pet code)
* User can delete pets

The application was created using:
* Spring Boot 3.0.1
* Java 19
* Spring Web
* Lombok
* Spring Data JPA
* H2 Database
* Liquibase Migration
* Mapstruct
