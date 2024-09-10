# Nivell 3

## Exercici CRUD amb MongoDB

Accedeix a la pàgina [Spring Initializr](https://start.spring.io/) i genera un projecte Spring Boot amb les següents característiques:

### PROJECT (gestor de dependències)

- **Maven** o **Gradle**

### LANGUAGE

- **Java**

### SPRING BOOT

- La darrera versió estable

### PROJECT METADATA

- **Group**: `cat.itacademy.s04.t02.n03`
- **Artifact**: `S04T02N03`
- **Name**: `S04T02N03`
- **Description**: `S04T02N03`
- **Package name**: `cat.itacademy.s04.t02.n03`
- **Packaging**: `Jar`
- **Java**: Mínim versió 11

### Dependències

- Spring Boot DevTools
- Spring Web
- Spring Data MongoDB

### Configuració de MongoDB

Configura la connexió a MongoDB al fitxer `application.properties`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/fruteria
