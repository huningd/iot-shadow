FROM mysql
ENV MYSQL_ROOT_PASSWORD=root
ENV MYSQL_USER=developer
ENV MYSQL_PASSWORD=0Elope.Leila.2per
ADD /init.sql /docker-entrypoint-initdb.d/
ADD /my.cnf /etc/mysql/my.cnf
