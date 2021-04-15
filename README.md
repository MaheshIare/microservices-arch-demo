# microservices-arch-demo

This is a multi-module maven project, demonstrating a typical cloud native micro-service based architechture. 

## Tech stack/Components used for building the architecture
```bash
1. Spring boot 				- Framework used for developing the applications
2. Spring cloud config		- Spring cloud config server for externalizing the configurations
3. Netflix Eureka server	- To hold the information about all client-service applications 
4. Zuul API Gateway			- A gateway application that handles all the requests and does the dynamic routing of microservice applications.
5. Student Microservice	- A simple micro-service for exposing REST API's pertaining to Student datastore
6. Course Microservice		- A simple micro-service for exposing REST API's pertaining to Course datastore
7. Zipkin & Sleuth			- A Java-based distributed tracing system to collect and look up data from distributed systems.
8. H2 Database				- An in-memory database for storing data pertaining to students and courses

```

## Prerequisites
**This application requires Zipkin setup as we are using distributed tracing.**
According to zipkin community, it doesn't support custom zipkin servers anymore. We will have to use community provided OSS zipkin distribution for starting up the zipkin server. We can download the latest version of it here: **[Zipkin](https://search.maven.org/remote_content?g=io.zipkin&a=zipkin-server&v=LATEST&c=exec)**.
Once downloaded, run it using the below command:

```bash
java -jar <path-to-zipkin-jar>
```
Once the zipkin server is up and running, you can access this [link](http://localhost:9411/zipkin) for zipkin UI. 

To enable tracing and exporting, add below dependencies to your client applications

```java
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-sleuth</artifactId>
		</dependency>
		
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-zipkin</artifactId>
		</dependency>
```
Also add below configuration into your application.properties file of your client applications

```bash
### Zipkin & Sleuth config ###
spring.sleuth.sampler.percentage=1.0
spring.sleuth.web.skipPattern=(^cleanup.*|.+favicon.*)

```

## More information
This project contains below modules.

1. **[cloud-config-repo](https://github.com/MaheshIare/cloud-config-repo)** : Git repo for storing the configurations of services

2. **[cloud-config-server](https://github.com/MaheshIare/microservices-arch-demo/cloud-config-server)** : Custom spring boot based config server, implemented using [Spring cloud config server](https://cloud.spring.io/spring-cloud-config/reference/html/#_spring_cloud_config_server) for retrieving the application configuration

3. **[service-discovery-server](https://github.com/MaheshIare/microservices-arch-demo/service-discovery-server)** : Custom spring boot based service registry server, implemented using [Netflix Eureka server](https://cloud.spring.io/spring-cloud-netflix/reference/html/)

4. **[zuul-api-gateway](https://github.com/MaheshIare/microservices-arch-demo/zuul-api-gateway)** : Custom spring boot based zuul api gateway, implemented using [Netflix Zuul](https://github.com/Netflix/zuul) for routing the requests to respective micro-service based on the path

5. **[student-api-service](https://github.com/MaheshIare/microservices-arch-demo/student-api-service)** : A simple micro-service for exposing REST API's pertaining to Student datastore

6. **[course-api-service](https://github.com/MaheshIare/microservices-arch-demo/course-api-service)** : A simple micro-service for exposing REST API's pertaining to Course datastore

## Note
For demo purpose, i have bundled all the modules together and created a multi module project. But you have the flexibility of decoupling them and create CI-CD for each module independently. And as each module is independent of each other, we can simply get the artifact and deploy it onto any cloud env.

## Build instructions
```java
mvn clean install
```
Once all the modules are build successfully, just run the applications in the below order:

```java
java -jar zipkin.jar

java -jar cloud-config-server-0.0.1.jar

java -jar service-discovery-server-0.0.1.jar

java -jar zuul-api-gateway-0.0.1.jar

java -jar student-api-service-0.0.1.jar

java -jar course-api-service-0.0.1.jar
```

Once the applications are up and running, you can simple access the below API's using Rest Client or Postman

```java
student-api-service exposes below API's
	GET - /api/v1/student - Fetch all the students info
	GET - /api/v1/student/{studentId} - Fetch the student info associated with student id
	GET - /api/v1/student/course/{courseCode} - Fetch all the students info associated with particular coursecode

course-api-service exposes below API's
	GET - /api/v1/course - Fetch all the courses info
	GET - /api/v1/course/{courseId} - Fetch the course info associated with course id
	GET - /api/v1/course/student/{courseCode} - Fetch all the students info associated with particular coursecode
```

## Important Info
**All the above api's can be accessed using zuul gateway which will run on port: 8080. Based on the API path you will be accessing, the request will be routed to particular micro-service. For demo purpose, we just used the routing feature of zuul gateway.**

## Questions
If you have project related questions please create a ticket with your question here [Create Issue](https://github.com/MaheshIare/microservices-arch-demo/issues)

## Author

**Mahesh Kumar Gutam**

* [Github](https://github.com/MaheshIare)

## Feedback
Please feel free to send me some feedback or questions!