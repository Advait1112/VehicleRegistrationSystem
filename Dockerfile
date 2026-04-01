# Stage 1: Build the JAR using Maven
FROM maven:3.9-eclipse-temurin-17-alpine AS builder
WORKDIR /app
COPY pom.xml .
RUN mvn dependency:go-offline -B
COPY src ./src
RUN mvn clean package -DskipTests

# Stage 2: Run the JAR and start the dummy server for Render
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=builder /app/target/VehicleRegistrationSystem-1.0-SNAPSHOT.jar app.jar

# Install python3 to run our dummy server
RUN apk add --no-cache python3

EXPOSE 10000

# Run the Java app, then start the dummy server on Render's assigned port
# Run the Java app, then start the dummy server on Render's assigned port
CMD java -cp app.jar com.system.vehicleregistration.Main && \
    echo "--- Java execution finished. Starting dummy server to keep Render happy ---" && \
    python3 -m http.server ${PORT:-10000}
