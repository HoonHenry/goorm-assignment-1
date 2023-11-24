FROM gradle:jdk11-alpine as builder

COPY --chown=gradle:gradle . /home/gradle
RUN gradle build


FROM openjdk:11.0.11-jre

WORKDIR /usr/local/tomcat/webapps/
COPY --from=builder /home/gradle/build/libs/*SNAPSHOT.jar /usr/local/tomcat/webapps/webapp.jar
EXPOSE 8080
USER root
CMD ["java", "-jar", "/usr/local/tomcat/webapps/webapp.jar"]
