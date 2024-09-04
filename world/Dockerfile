FROM openjdk:17-jdk
ARG JAR_FILLE=target/*.jar
COPY ./target/world-0.0.1-SNAPSHOT.jar world.jar
ENTRYPOINT ["java", "-jar", "/world.jar"]
