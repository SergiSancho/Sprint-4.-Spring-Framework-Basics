# Nivell 1 Exercici CRUD amb H2

## Descripción

Este proyecto es una aplicación Spring Boot que implementa un CRUD (Create, Read, Update, Delete) utilizando una base de datos H2 en memoria. La aplicación gestiona una entidad llamada "Fruita" con las siguientes propiedades:

- `id`: Identificador único de la fruta (int)
- `nom`: Nombre de la fruta (String)
- `quantitatQuilos`: Cantidad en kilogramos (int)

## Requisitos

- **Java**: Versión mínima 11
- **Spring Boot**: Última versión estable
- **Dependencias**:
  - Spring Boot DevTools
  - Spring Web
  - Spring Data JPA
  - H2 Database

## Estructura del Proyecto

La estructura de paquetes del proyecto es la siguiente:

- `cat.itacademy.s04.t02.n01.controllers`: Contiene los controladores de la aplicación.
- `cat.itacademy.s04.t02.n01.model`: Contiene las entidades JPA.
- `cat.itacademy.s04.t02.n01.services`: Contiene la lógica de negocio y servicios.
- `cat.itacademy.s04.t02.n01.repository`: Contiene los repositorios para la interacción con la base de datos.

## Endpoints de la API

La aplicación expone los siguientes endpoints para gestionar la entidad "Fruita":

- **Añadir una fruta**
  - **URL**: `http://localhost:8080/fruita/add`
  - **Método**: POST
  - **Cuerpo**: JSON con las propiedades de la fruta

- **Actualizar una fruta**
  - **URL**: `http://localhost:8080/fruita/update`
  - **Método**: PUT
  - **Cuerpo**: JSON con las propiedades actualizadas de la fruta

- **Eliminar una fruta**
  - **URL**: `http://localhost:8080/fruita/delete/{id}`
  - **Método**: DELETE
  - **Parámetro**: `id` (Identificador de la fruta)

- **Obtener una fruta por ID**
  - **URL**: `http://localhost:8080/fruita/getOne/{id}`
  - **Método**: GET
  - **Parámetro**: `id` (Identificador de la fruta)

- **Obtener todas las frutas**
  - **URL**: `http://localhost:8080/fruita/getAll`
  - **Método**: GET

## Recursos

Para más información sobre la implementación de CRUD con Spring Boot y JPA, consulta los siguientes recursos:

- [CRUD Spring API REST + JPA + PostgreSQL](https://www.bezkoder.com/spring-boot-jpa-crud-rest-api/)
- [CRUD Spring API REST + JPA + H2](https://www.bezkoder.com/spring-boot-jpa-h2-example/)
- [CRUD Spring API REST + JPA + MySQL](https://amoelcodigo.com/crud-java-sprig-mysql/)
- [CRUD REST con Spring Boot y JPA](https://javadesde0.com/crud-rest-con-spring-boot-y-jpa/)

