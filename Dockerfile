FROM openjdk:17-jdk-alpine 
VOLUME /tmp
ADD target/fibo_chmurki-0.0.1-SNAPSHOT.jar app.jar
CMD [ "java", "-jar", "/app.jar" ] 