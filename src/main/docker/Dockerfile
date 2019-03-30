FROM fabric8/java-alpine-openjdk8-jdk

ENV GATEWAY_VERSION=1.0.0-SNAPSHOT
VOLUME /tmp
ADD phecloud-gateway-$GATEWAY_VERSION.jar gateway.jar
RUN sh -c 'touch /gateway.jar'
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/gateway.jar"]
