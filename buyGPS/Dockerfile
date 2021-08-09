FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8080
VOLUME /tmp
ADD target/buyGPS-0.0.1-SNAPSHOT.jar buyGPS-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/buyGPS-0.0.1-SNAPSHOT.jar"]
