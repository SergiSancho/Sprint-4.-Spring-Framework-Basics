# Nivell 1 Exercici Spring i Maven

Aquest exercici és un primer contacte amb Spring i Maven. Segueix els següents passos per completar l'exercici:

## Creació del Projecte

1. Accedeix a la pàgina [Spring Initializr](https://start.spring.io/) i genera un projecte Spring Boot amb les següents característiques:

    - **PROJECT (gestor de dependències):** Maven
    - **LANGUAGE:** Java
    - **SPRING BOOT:** La darrera versió estable
    - **PROJECT METADATA:**
        - **Group:** cat.itacademy.s04.t01.n01
        - **Artifact:** S04T01N01
        - **Name:** S04T01N01
        - **Description:** S04T01N01
        - **Package name:** cat.itacademy.s04.t01.n01
    - **PACKAGING:** Jar
    - **JAVA:** Mínim versió 11
    - **Dependències:**
        - Spring Boot DevTools
        - Spring Web

2. Importa el projecte a IntelliJ IDEA amb l’opció `File > Open` i selecciona el directori del projecte generat.

## Configuració de l'Aplicació

1. A l'arxiu `application.properties`, configura la variable `server.port` amb el valor `9000`.

2. Convertirem aquesta aplicació en una API REST:
    - Crea un subpackage anomenat `controller` dins del package principal.
    - Afegeix la classe `HelloWorldController` dins del subpackage `controller`.

3. La classe `HelloWorldController` haurà de tenir dos mètodes:
    - **String saluda**
    - **String saluda2**

   Aquests dos mètodes rebran un paràmetre `String` anomenat `nom`, i retornaran la frase:

   ```java
   "Hola, " + nom + ". Estàs executant un projecte Maven"



## Recursos

- **Server port:** [Canviar el port del servidor en Spring Boot](https://www.baeldung.com/spring-boot-change-port)
- **Curs Spring Boot MitoCode:** [Vídeo tutorial a YouTube](https://www.youtube.com/watch?v=ltA-mIYyxhY)
