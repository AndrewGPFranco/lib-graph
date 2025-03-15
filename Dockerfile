FROM maven:3.9.9-amazoncorretto-23-alpine AS build

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:23-jdk-slim

WORKDIR /app

COPY --from=build /app/target/*.jar app.jar

ENTRYPOINT ["java", "-Xms2048m", "-Xmx6000m", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=0.0.0.0:5005", "-jar", "app.jar"]

EXPOSE 8080

EXPOSE 5005