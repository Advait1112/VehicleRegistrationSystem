# Use a standard Java environment
FROM eclipse-temurin:17-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file built by Maven into the container
COPY target/VehicleRegistrationSystem-1.0-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]