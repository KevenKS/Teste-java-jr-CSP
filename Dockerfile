FROM openjdk

WORKDIR /teste

COPY target/testeJavaJr-0.0.1-SNAPSHOT.jar /teste/testeJavaJr.jar

ENTRYPOINT ["java", "-jar", "testeJavaJr.jar"]
