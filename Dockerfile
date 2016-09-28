FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/workshop-site.jar /workshop-site/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/workshop-site/app.jar"]
