##Installing all dependencies

```mvn clean install```
##Deploying frontend in local environnement

```mvn spring-boot:run -DskipTests -pl :ficovie-web```

##Local frontend development

Here are not pushed files relatives to front-end development. But we are able to start another server (a node one created from package http-server) and call the backend API (that's why CORS configuration are necessary in Java). Moreover, we are able to launch any tasks related to front-end development as Karma tests or anything else.
This folder architecture is the one recommanded by Spring-Boot for creating a webapp

##Folders architecture

```
ficovie-web
│   README.md
│   pom.xml
|   mvnw
|   mvnw.cmd
|   .gitignore
│
└───src
│   │
│   └───main
|       │
|       └───java
|         │
|         └───com
|           │
|           └───axa
|             │
|             └───ficovie
|               | ...
|       │
|       └───resources
|         │
|         └───public
|           │
|           └───bower_components --- only useful files, not every version exposed by bower
|             |   ...
|           │
|           └───css --- my own css
|             |   ...
│           │
|           └───js
│             │
|             └───controller --- each controller (and its module declaration)
|               |   ...
│             │
|             └───service --- each service
|               |   ...
|             |   app.js --- js configuration of the angular app, declaration of modules etc.
│           │
|           └───components --- html templates or angular directives
|             |   ...
|           |   index.html --- index file of the app
│   │
│   └───test
|       │
|       └───java
|         │
|         └───com
|           │
|           └───axa
|             │
|             └───ficovie
|                 |   FicovieWebApplicationTests.java
│   
└───target
│   │
│   └───...

```
