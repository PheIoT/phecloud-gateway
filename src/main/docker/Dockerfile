FROM fabric8/java-alpine-openjdk8-jdk
VOLUME /tmp
ADD phecloud-gateway-1.0.0-SNAPSHOT.jar gateway.jar
RUN bash -c 'touch /gateway.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/gateway.jar"]
