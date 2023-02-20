FROM adoptopenjdk:16-jre
COPY demo*.jar   /app.jar
CMD java -jar /app.jar