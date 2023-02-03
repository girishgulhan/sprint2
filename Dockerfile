FROM openjdk:13-jdk-alpine
ADD target/university-docker.jar university-docker.jar
ENTRYPOINT ["java","-jar","university-docker.jar"]