# hello_world_microservices

**Links to docker images**

srishti4299/hello - https://hub.docker.com/repository/docker/srishti4299/hello/general</br>
srishti4299/world - https://hub.docker.com/repository/docker/srishti4299/world/general

This is a **Spring Boot** Application that demonstrates the use of microservices.<br />  There are three services in total:<br /> 
**hello** service returns - _Hello_,<br /> 
**world** service returns - _World_,<br /> 
The **hello-world** service combines response from both the services to give the complete string _Hello World_.

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
**Kubernetes**</br>
The services are deployed on kubernetes cluster using **minkube**. The configuration files (.yaml) can be found in **hello_world_microservices/k8s**.
To run the application, apply the config using:
```js
kubectl apply -f hello-deployment.yaml
kubectl apply -f hello-service.yaml
kubectl apply -f world-deployment.yaml
kubectl apply -f world-service.yaml
```
Verify that the pods and services are running:
```js
kubectl get pods
```
```js
kubectl get services
```
<img width="642" alt="Screenshot 2024-09-04 at 10 18 02 AM" src="https://github.com/user-attachments/assets/f9bf7db5-84ab-4dae-8dab-08cf40c5263a">
</br>And the application is ready to be used. Head over to the browser to see the microservices application in action.
