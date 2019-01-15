FROM ubuntu
RUN apt-get update
RUN apt-get install -y openjdk-8-jre-headless
RUN apt-get -y install curl
RUN curl -O https://www-eu.apache.org/dist/tomcat/tomcat-9/v9.0.14/bin/apache-tomcat-9.0.14.tar.gz
RUN ls
RUN tar xzvf /apache-tomcat-9.0.14.tar.gz
COPY target/*.war /apache-tomcat-9.0.14/webapps/
RUN chmod +x /apache-tomcat-9.0.14/bin/catalina.sh
CMD /apache-tomcat-9.0.14/bin/catalina.sh run

#docker build D:\eclipse-workspace\IITMScApp
#docker run -it -p 8080:8080 5f37e3c68135
#http://localhost:8080/IITMScApp/api/transactions/addTransaction
#docker images
#docker tag 5f37e3c68135 shanwije/zzz:latest
#docker push shanwije/zzz:latest
# ubuntu@ec2-3-16-214-51.us-east-2.compute.amazonaws.com