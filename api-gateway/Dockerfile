FROM openjdk:8-jdk-alpine
ARG SERVICE_NAME
ARG JAR_FILE

MAINTAINER Rohit Yewale <rcy.yewale@gmail.com>

VOLUME /tmp

COPY ${JAR_FILE} app.jar
LABEL APP=${SERVICE_NAME}

ENTRYPOINT ["java", "-jar", "/app.jar"]