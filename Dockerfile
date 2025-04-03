FROM tomcat:10.0.2
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/SchoolApp-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
EXPOSE 8080
CMD ["catalina.sh", "run"]