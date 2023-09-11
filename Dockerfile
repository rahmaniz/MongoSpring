FROM openjdk:20
ENV MONGO_DN_USERNAME=admin \
    MONGO_DB_PASSWORD=123456
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/MongoSpring-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} MongoSpring-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/MongoSpring-0.0.1-SNAPSHOT.jar"]