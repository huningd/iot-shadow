FROM openjdk:8-jdk-alpine
ENV PROFILES=docker
ENV SERVICE_PORT 18081
ENV JAVA_OPTS ""
VOLUME /tmp
ARG JAR_FILE
ADD ${JAR_FILE} app.jar
EXPOSE $SERVICE_PORT
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Dserver.port=$SERVICE_PORT -Dspring.profiles.active=$PROFILES -Djava.security.egd=file:/dev/./urandom -jar app.jar"]
