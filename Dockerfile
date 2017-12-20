FROM anapsix/alpine-java

ADD @project.build.finalName@.@project.packaging@ app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
EXPOSE 8001