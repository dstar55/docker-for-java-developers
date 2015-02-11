###Hello World sample shows how to deploy [SpringBoot](http://projects.spring.io/spring-boot/) application with [Docker](https://www.docker.com/)

####Prerequisite

Installed: Docker, Java 1.7, Maven 3.x

####Steps

######Clone source code from git
```
$ git clone https://github.com/dstar55/docker-for-java-developers
```

######Build project with Maven
```
$ mvn clean install
```

######Build Docker image
```
$ docker build -t="hello-world-java" .
```

Note:if you run this command for first time it will take time to download base image from Docker Hub

######Run Docker image
```
$ docker run -it --rm hello-world-java
```

#####Test application
find ContainerId of the running Docker image
```
$ docker ps
```

then IP address of the running Docker image
```
$ docker inspect --format '{{ .NetworkSettings.IPAddress }}' [ContainerId]
```

now test application
```
$ curl [IPAddress]:8080
```

