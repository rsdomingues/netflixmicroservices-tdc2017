FROM frolvlad/alpine-oraclejdk8:slim
VOLUME /tmp
ADD target/zuul-server-1.0.0.BUILD-SNAPSHOT.jar /app.jar
RUN sh -c 'touch /app.jar'
EXPOSE 8761
ENV JAVA_OPTS="-Xms128m -Xmx128m"
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]