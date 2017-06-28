FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/bar-app-0.0.1.jar /app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS="-Xms64m -Xmx64m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]