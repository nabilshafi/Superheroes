FROM openjdk:8-jdk-alpine
COPY target/Superheroes-0.0.1-SNAPSHOT.jar superheroes-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","superheroes-0.0.1-SNAPSHOT.jar"]