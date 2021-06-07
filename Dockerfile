FROM openjdk:8-alpine

COPY target/uberjar/materialui-design.jar /materialui-design/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/materialui-design/app.jar"]
