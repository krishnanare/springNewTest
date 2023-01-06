#define base docker image 
FROM openjdk:17
LABEL maintainer="test.app"
ADD target/springNew-0.0.1-SNAPSHOT.jar springNew.jar
ENTRYPOINT ["java","-jar","/springNew.jar"]
EXPOSE 8080
