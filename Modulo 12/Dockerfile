FROM openjdk:11
VOLUME /tmp
COPY target/star-wars-api.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app.jar"]