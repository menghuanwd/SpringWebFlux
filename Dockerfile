FROM openjdk:18

WORKDIR /app

COPY build/libs/demo-1.0.1.jar demo.jar

EXPOSE 5002

RUN ln -sf /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
RUN echo 'Asia/Shanghai' >/etc/timezone

ENTRYPOINT ["java","-jar","demo.jar","-Xms","512m","-Xmx","512m"]