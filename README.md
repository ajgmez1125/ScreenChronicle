# Your Application Name

## Description
This is a template for a Java application using Spring Boot and Maven.

##### Note: 
* This is not a perfect Hexagonal Architecture implementation.
* Perfect Hexagonal Architecture would have following modules:
  * Domain - Business Logic
  * Application - Sandwich between Domain and Infrastructure (Ports and Adapters)
  * Infrastructure - Database, File System, Network, etc.

## Project setup
```
mvn clean install
```

### Run
```
java -jar Infrastructure/target/Infrastructure-0.0.1-SNAPSHOT.jar
```

### Run Swagger
```
http://localhost:8080/swagger-ui.html
```
