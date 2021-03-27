FROM openjdk:8
EXPOSE 8081
ADD target/spring-docker-integaration.jar spring-docker-integaration.jar
ENTRYPOINT ["java","-jar","/spring-docker-integaration.jar"]