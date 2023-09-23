FROM eclipse-temurin:17
COPY target/dockweb.jar dockweb.jar
CMD [ "java","-jar","dockweb.jar" ]