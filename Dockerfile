FROM maven:latest

WORKDIR /usr/src/app

COPY . /usr/src/app

ENV PORT 5000
EXPOSE $PORT
CMD [ "java", "src/main/java/com/unitins/projeto_amigo10/ProjetoAmigo10Application.java" ]
