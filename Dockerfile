FROM openjdk:17.0.1-slim-buster

ENV zmienna="1234"
RUN echo $zmienna

COPY build/libs/DockerDemo-0.0.1-SNAPSHOT.jar /app.jar

ENTRYPOINT java -jar /app.jar