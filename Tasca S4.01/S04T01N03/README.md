# Nivell 3 - Exercici Postman

Aquest exercici consisteix en provar els projectes anteriors (Maven i Gradle) fent servir Postman. A continuació es descriuen els passos i recursos necessaris.

## Creació d'Entorns a Postman

### 1. Projecte Maven
- **Servidor**: `http://localhost`
- **Port**: `9000`

### 2. Projecte Gradle
- **Servidor**: `http://localhost`
- **Port**: `9001`

## Pasos per Configurar els Entorns a Postman
1. **Obre Postman** i crea els dos entorns següents:
   - Projecte Maven
   - Projecte Gradle

2. Cada entorn ha de tenir dues variables:
   - **Servidor**: Valor = `http://localhost`
   - **Port**: Valor per al projecte Maven = `9000`, per al projecte Gradle = `9001`.

3. Després, prova les següents URL utilitzant els entorns:
   - **Maven**: `http://localhost:9000/HelloWorld/elmeunom`
   - **Gradle**: `http://localhost:9001/HelloWorld/elmeunom`

Recorda que per executar les peticions, els projectes Maven i Gradle han d'estar en execució.

## Comandes per executar els projectes:
- **Maven**: 
    ```bash
    mvn spring-boot:run
    ```
- **Gradle**: 
    ```bash
    gradle bootRun
    ```

## Recursos Utilitzats

### Diferències entre Maven i Gradle:
- [Gradle vs Maven - Chakray](https://www.chakray.com/es/gradle-vs-maven-definiciones-diferencias/)
- [Diferències entre Gradle i Maven - ProgrammerClick](https://programmerclick.com/article/47131530173/)

### Postman:
- [Postman Tutorial - YouTube](https://www.youtube.com/watch?v=9I9U5-WUrDo)

