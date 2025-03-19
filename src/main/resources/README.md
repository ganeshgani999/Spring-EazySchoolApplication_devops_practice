Spring is a powerful, lightweight, and open-source Java framework used for building enterprise applications. It provides dependency injection, aspect-oriented programming, and an ecosystem of modules (like Spring Boot, Spring Security, and Spring Cloud) to simplify application development.

Java EE to Jakarta EE: Why Migrate Your Project?
Java EE has evolved into Jakarta EE after being transferred from Oracle to the Eclipse Foundation. Many organizations and developers prefer migrating from Java EE to Jakarta EE to take advantage of modern updates, better support, and cloud-native development.

Spring Core concepts
Spring Boot	:Simplifies Spring development by providing auto-configuration and an embedded server.
Spring MVC	:Helps in building web applications with a Model-View-Controller (MVC) architecture.
Spring Data	:Simplifies database access using JPA, Hibernate, and NoSQL databases.
Spring Security	:Provides authentication and authorization for web applications.
Spring Cloud	:Supports cloud-native development, including microservices, service discovery, and resilience.

Spring Core concepts:
Spring Core contains following important components,
loC (Inversion of Control)
DI (Dependency Injection)
Beans
Context
SpEL (Spring Expression Language)
loC Container

Bean Creation Approaches
XML Configuration: Define beans in an XML file.
Annotation-Based Configuration: Use @Component, @Service, etc.
Java-Based Configuration: Use @Configuration and @Bean.

Bean Scopes
Singleton: Single instance per Spring container.
Prototype: New instance every time.
Request: Single instance per HTTP request.
Session: Single instance per HTTP session.

Using Beans :
Vehicle class
Base class of all beans-projectConfig.class

Lombok Library and Annotations
Lombok reduces boilerplate code by automatically generating getters, setters, constructors, and more. Common annotations:
@Data: Generates getters, setters, toString, etc.
@AllArgsConstructor: Generates a constructor with all fields.
@NoArgsConstructor: Generates a no-argument constructor.

SpringBootApplication:
knowing features about like actuaaters,devtools,autoconfiguration,springbootstarter.
Introduction to mvc pattern
spring mvc architecture 
thymeleaf

Spring validations in the model contact class
Spring security -authorization and authentication,csrf and cors 
CSRF: Protects against cross-site request forgery (Disable for APIs).
CORS: Allows cross-origin requests from frontend apps.
Authentication: Verifies user identity (Basic Auth, JWT, Database).
Authorization: Controls access based on roles (Role-Based Access).

Deep dive on Spring Boot Auto-configuration
In the spring Boot auto Configuration we ar giving some permissions to user and some to the aadmin
which page  permits all and deny all these custom security features .
after all these we diasable the csrf due to secure .

H2database-after all creation frontend pages for contact we want to store data in one context so that we can create table 
or schema and data in the schema.sql.and data.sql

Database Operations with Spring JDBC:
jdbc-it is between apps to communticate with database -repositories
Using jdbc template we can create insert delete update data into table.

spring data
topics hibernate,spring data jpa,repositories-crud,paging and sorting,listpagingand sorting,listcrud

Derived Query Methods in JPA
Spring Data JPA allows query methods to be derived from method names, such as findByFirstName(String name).

Hibernate Mappings
OneToOne: One entity maps to one other entity.
OneToMany: One entity maps to many other entities.
ManyToOne: Many entities map to one entity.
ManyToMany: Many entities map to many other entities.

Sorting, Pagination, JPQL inside Spring Data JPA
Sorting allows fetching sorted results based on one or more fields.
Pagination helps in fetching large data efficiently by retrieving a subset of records at a time.
JPQL works with Java entity objects, while SQL works directly with tables.

REST services-restcontroller-cors-consume services--openfeign,rest template,web client

spring data rest-hal explorer

logging - debug,info,trace,warn,error.
configurations
profiles-prod,uat
springboot actuator and springbootadmin

deploy spring boot application to aws elastic beanstalk











