FROM adoptopenjdk/openjdk11-openj9:x86_64-alpine-jdk-11.0.5_10_openj9-0.17.0-slim

ENV LANG C.UTF-8

COPY target/hackathon-bff.jar /app/app.jar

CMD java -jar /app/app.jar $APP_OPTIONS