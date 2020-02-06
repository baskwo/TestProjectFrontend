FROM open-liberty:kernel-java11
COPY --chown=1001:0  target/MicroProfileJakarta.war /config/dropins/
COPY --chown=1001:0  server.xml /config