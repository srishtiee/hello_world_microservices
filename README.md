# hello_world_microservices

**Links to docker images**

srishti4299/hello - https://hub.docker.com/repository/docker/srishti4299/hello/general

srishti4299/world - https://hub.docker.com/repository/docker/srishti4299/world/general

This is a **Spring Boot** Application that demonstrates the use of microservices.<br />  There are three services in total:<br /> 
**hello** service returns - _Hello_,<br /> 
**world** service returns - _World_,<br /> 
and the service **hello-world** combines response from both the services to give the complete string _Hello World_.

To run the microservices individually, pull run the respective docker images from the given docker-hub links with the following commands:
Pull the images-
```js
docker pull srishti4299/hello  
docker pull srishti4299/world
```
Run them using the following commands:
```js
docker run -p 8081:8081 srishti4299/hello
docker run -p 8082:8082 srishti4299/world
```
