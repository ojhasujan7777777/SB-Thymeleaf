FROM openjdk:11
COPY target/04-SB-Register_Form_Thymeleaf-0.0.1-SNAPSHOT.jar/usr/app/
WORKDIR /usr/app/
ENTRYPOINT ["java","-jar","04-SB-Register_Form_Thymeleaf-0.0.1-SNAPSHOT.jar"]
