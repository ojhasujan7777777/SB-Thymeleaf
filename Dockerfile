FROM openjdk:15
COPY target/04-SB-Register_Form_Thymeleaf /usr/app
WORKDIR /usr/app/
ENTRYPOINT ["java',"-jar","04-SB-Register_Form_Thymeleaf.jar"]