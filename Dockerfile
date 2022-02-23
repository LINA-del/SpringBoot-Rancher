FROM adoptopenjdk/openjdk11:alpine-jre
#FROM openjdk:8-jdk-alpine
#Create a working directory
WORKDIR /opt/app

#Copy the war file in  /app
COPY target/SpringBootHelloWorld-0.0.1-SNAPSHOT.war springbootapp.war

# java -jar /app/springbootapp.war
ENTRYPOINT ["java","-jar","springbootapp.war"]
