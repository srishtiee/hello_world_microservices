FROM openjdk:17-jdk
ARG JAR_FILLE=target/*.jar
COPY ./target/hello-0.0.1-SNAPSHOT.jar hello.jar
ENTRYPOINT ["java", "-jar", "/hello.jar"]

#FROM ubuntu:latest
#LABEL authors="srishtibankar"
#
#ENTRYPOINT ["top", "-b"]
