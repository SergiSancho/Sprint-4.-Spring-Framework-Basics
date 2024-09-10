# Nivell 2 - Exercici Spring i Gradle

Aquest projecte és una aplicació Spring Boot que utilitza Gradle com a gestor de dependències. És un exercici pràctic per construir una API REST senzilla amb dos mètodes que reben paràmetres i retornen un missatge de benvinguda.

## 1. Configuració del projecte

### Característiques del projecte:

- **PROJECT (gestor de dependències):** Gradle
- **LANGUAGE:** Java
- **SPRING BOOT:** Última versió estable
- **Group:** `cat.itacademy.s04.t01.n02`
- **Artifact:** `S04T01N02`
- **Name:** `S04T01N02`
- **Description:** `S04T01N02`
- **Package name:** `cat.itacademy.s04.t01.n02`
- **Packaging:** Jar
- **Java version:** 11 o superior

### Dependències:

- **Spring Boot DevTools**
- **Spring Web**

## 2. Importació del projecte

Importa el projecte a Eclipse utilitzant l'opció `File > Import > Existing Gradle Project`.

## 3. Configuració del port

A l'arxiu `src/main/resources/application.properties`, configura la variable `server.port` amb el valor 9001:

```properties
server.port=9001
```

## 4. Recursos
RequestParam:

->https://www.baeldung.com/spring-request-param

PathVariable:

->https://www.baeldung.com/spring-optional-path-variables

Diferències RequestParam i PathVariable:

->https://www.baeldung.com/spring-requestparam-vs-pathvariable
