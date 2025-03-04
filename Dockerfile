FROM maven:3.9.7-amazoncorretto-21 AS build
COPY . .
RUN mvn clean package

# Etapa de ejecución
FROM amazoncorretto:21.0.6-alpine
EXPOSE 8080
COPY --from=build /target/ms-movies-0.0.1-SNAPSHOT.jar ms-movies-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/ms-movies-0.0.1-SNAPSHOT.jar"]