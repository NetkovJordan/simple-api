# Use the official OpenJDK image as a base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at the specified working directory
COPY target/web-service-0.0.1-SNAPSHOT.jar /app/

# Expose the port that your Spring Boot application will run on
EXPOSE 9091

# Command to run your application
CMD ["java", "-jar", "web-service-0.0.1-SNAPSHOT.jar"]
