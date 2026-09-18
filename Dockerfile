FROM maven:3.9-eclipse-temurin-17 AS build

WORKDIR /app

COPY pom.xml /app
RUN mvn dependency:go-offline

COPY src/ /app/src
RUN mvn package -DskipTests

FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY --from=build /app/target/hello-world-0.0.1-SNAPSHOT.jar /app/app.jar

EXPOSE 9090

CMD [ "java", "-jar", "app.jar" ]

