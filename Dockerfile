FROM openjdk:11
VOLUME /tmp
EXPOSE 4003
ARG JAR_FILE=target/registrocliente-microservice-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]