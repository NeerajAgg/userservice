FROM java:8-jdk-alpine

VOLUME /tmp

# The application's jar file (when packaged)
ARG JAR_FILE=target/userservice-0.0.1-SNAPSHOT.jar

# Add the application's jar to the container
ADD ${JAR_FILE} userservice-0.0.1-SNAPSHOT.jar

# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/userservice-0.0.1-SNAPSHOT.jar"]

EXPOSE 8001