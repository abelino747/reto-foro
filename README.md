##Foro Java Spring Boot

Este es un foro creado con Java utilizando el framework Spring Boot 3, Spring Security, MySQL como base de datos, JPA para el mapeo objeto-relacional y Maven como gestor de dependencias. El patrón de diseño utilizado es el Repository.

##Requisitos

- Java 17 o superior
- Spring , SpringBoot 3.x o superior
- Maven 
- MySQL 

## Configuraciones
 tener en cuenta las configuraciones en el application.properties y la base de datos para que el programa no de error :

- spring.datasource.url=${DB_DATASOURCEFORUM}//${DB_HOSTFORUM}/${DB_FORUM}
- spring.datasource.username=${DB_USERFORUM}
- spring.datasource.password=${DB_PASSWORDFORUM}
- spring.jpa.show-sql=true
- spring.jpa.properties.hibernate.format_sql=true
- server.error.include-stacktrace=never
- api.security.secret=${JWT_SECRET}


## Patrón Utilizado

El patrón Repository se utiliza para separar la lógica de acceso a datos de la lógica de negocio. En este proyecto, se ha creado una interfaz TemaRepository que extiende de JpaRepository y que se encarga de realizar las operaciones CRUD (crear, leer, actualizar y eliminar) sobre los temas del foro. De esta forma, se simplifica el código y se facilita el mantenimiento de la aplicación.

## Uso
- Ejecutar el comando mvn spring-boot:run para iniciar la aplicación.
- La aplicación se ejecuta en el puerto 8080 por defecto.
- Para acceder al foro, abrir un navegador web y visitar la siguiente URL: http://localhost:8080/.
- Recordar las credenciales .
- se puede usar postman o insomnia para testear .

## funcionalidades:

- las correspondiente a un CRUD y autenticacion mediante Spring Security
- la documentacion se realizo mediante Swagger la cual se puede verificar en:  http://localhost:8080/swagger-ui.html .