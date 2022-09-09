FROM openjdk:11

ADD target/com.santander-0.0.1-SNAPSHOT.jar com.santander.jar

EXPOSE 8084

ENTRYPOINT ["java", "-jar", "/com.santander-0.0.1-SNAPSHOT.jar"]
