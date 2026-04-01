FROM eclipse-temurin:17-jre-alpine [cite: 376]
WORKDIR /app [cite: 377]
COPY --from=builder /app/target/vehicle-registration-system-1.0.0.jar app.jar [cite: 378]

# Install python3 to run our dummy server
RUN apk add --no-cache python3

EXPOSE 10000

# Run the Java app, then start the dummy server on Render's assigned port
CMD java -jar app.jar && \
    echo "--- Java execution finished. Starting dummy server to keep Render happy ---" && \
    python3 -m http.server ${PORT:-10000}
