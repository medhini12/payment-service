#start with base image containing java runtime
FROM openjdk:8-jdk-alpine

#make port 9098 available to the wrld outside

EXPOSE 9095
COPY target/Payments-service-1.0-SNAPSHOT.jar Payments-service-1.0-SNAPSHOT.jar

#Run jar file

ENTRYPOINT ["java", "-jar", "Payments-service-1.0-SNAPSHOT.jar"]