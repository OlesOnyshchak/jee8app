FROM websphere-liberty:javaee8

COPY /target/jee8-app.war /opt/ibm/wlp/usr/servers/defaultServer/dropins

COPY /development/server/server.xml /opt/ibm/wlp/usr/servers/defaultServer/

ENV LICENSE accept

