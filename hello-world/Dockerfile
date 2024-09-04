FROM openjdk:17-jdk
ARG JAR_FILLE=target/*.jar
COPY ./target/hello-world-0.0.1-SNAPSHOT.jar hello-world.jar
ENTRYPOINT ["java", "-jar", "/hello-world.jar"]

#FROM ubuntu:latest
#LABEL authors="srishtibankar"
#
#ENTRYPOINT ["top", "-b"]