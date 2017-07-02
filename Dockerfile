FROM frolvlad/alpine-oraclejdk8:slim

EXPOSE 8080
ADD build/libs/crud-apis-1.0.jar app.jar
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=production","/app.jar"]