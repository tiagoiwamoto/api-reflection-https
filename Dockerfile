FROM ubuntu
RUN apt-get update && apt-get upgrade
RUN apt-get install build-essential libz-dev zlib1g-dev -y
RUN mkdir app
#RUN wget https://github.com/graalvm/graalvm-ce-builds/releases/download/vm-22.3.1/graalvm-ce-java19-linux-amd64-22.3.1.tar.gz
#RUN wget https://dlcdn.apache.org/maven/maven-3/3.9.1/binaries/apache-maven-3.9.1-bin.tar.gz
COPY . app/
RUN tar -xzf /app/graalvm-ce-java19-linux-amd64-22.3.1.tar.gz
RUN tar -xzf /app/apache-maven-3.9.1-bin.tar.gz
#CMD ["/bin/bash", "-c", "export PATH=/graalvm-ce-java19-22.3.1/bin:$PATH;export PATH=/apache-maven-3.9.1/bin:$PATH;export JAVA_HOME=/graalvm-ce-java19-22.3.1"]
ENV PATH=/graalvm-ce-java19-22.3.1/bin:$PATH
ENV PATH=/apache-maven-3.9.1/bin:$PATH
ENV JAVA_HOME=/graalvm-ce-java19-22.3.1
ENV GRAALVM_HOME=/graalvm-ce-java19-22.3.1
VOLUME data
#CMD ["/bin/bash", "-c", "cd /app;mvn -Pnative native:compile -Dmaven.test.skip=true;cp /app/target/springboot-poc /data/springboot-poc"]
#CMD ["/bin/bash", "-c", "cp /app/target/springboot-poc /data/springboot-poc"]
#CMD ["/bin/bash", "-c", "cd /;cp /app/target/springboot-poc /springboot-poc;chmod +x springboot-poc;./springboot-poc >> /data/logs.txt"]
#RUN rm -Rf /app


#CMD ["/bin/bash", "-c", "cd /app;chmod +x app;./app >> /data/logs.txt"]
EXPOSE 8080