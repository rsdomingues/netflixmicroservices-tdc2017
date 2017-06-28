FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/foo-app-0.0.1.jar /app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8761
ENV JAVA_OPTS="-Xms64m -Xmx64m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]