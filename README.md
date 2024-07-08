# Airbnb Clone
<a name="readme-top"></a>
<!-- PROJECT LOGO -->
<br />
<div align="center">

<h3 align="center">Full Stack Airbnb Clone</h3>

  <p align="center">
    A full stack Airbnb clone application using Angular for the frontend, Spring Boot Java for the backend, PostgreSQL as the database, and Auth0 for authentication and authorization. The application includes booking management for travelers, reservation management for landlords, and comprehensive search functionalities.
  </p>
</div>


<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#instructions">Instructions</a></li>
    <li><a href="#screencaps">Screencaps</a></li>
  </ol>
</details>


<!-- ABOUT THE PROJECT -->
## About The Project


The project focuses on creating a full stack Airbnb clone application. The backend is built with Spring Boot Java, interfacing with a PostgreSQL database. The frontend is developed with Angular, providing a dynamic and responsive user interface. The application includes full user authentication and authorization with Auth0, supporting role management. It features booking management for travelers, reservation management for landlords, and search functionalities by various criteria like location, date, and number of guests.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Built With

* [![Java][Java.java]][Java-url]
* [![SpringBoot][SpringBoot]][Spring-url]
* [![Maven][Maven]][Maven-url]
* [![PostgreSQL][PostgreSQL]][PostgreSQL-url]
* [![Angular][Angular]][Angular-url]
* [![Docker][Docker]][Docker-url]
* [![Auth0][Auth0]][Auth0-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- ROADMAP -->
## Roadmap

- ✔️ Implement user authentication and authorization with Auth0
- ✔️ Develop a dynamic frontend using Angular
- ✔️ Build a robust backend with Spring Boot and PostgreSQL
- ✔️ Implement booking management for travelers
- ✔️ Implement reservation management for landlords
- ✔️ Develop search functionalities by location, date, guests, and other criteria
- ✔️ Utilize Docker for containerized deployment and easy setup across different environments

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- INSTRUCTIONS -->
## Instructions

#### 1) Setup .env file from .env.example

```js
AUTH0_CLIENT_ID=
AUTH0_CLIENT_SECRET=
```

<br/>

#### 2a) Docker installtion
- Ensure Docker is installed and running on your system
    - See https://docs.docker.com/ for installation instructions
1) Build the Docker image and ensure no previous cache is used:
    - ```docker-compose build --no-cache```
2) Compose the Docker image:
    - ```docker-compose up```

    <br/>
    <br/>


#### 2b) Setup .env file from .env.example
- Manual Installation:
    - Client frontend:
        1) ```npm install```
        2) ```ng serve```
    - Server backend:
        1) ```maven clean install```
        2) ```mvn spring-boot:run```


- In the case that liquibase cannot find the airbnb_clone database:
  - In ```server/src/main/resources/application.yml``` comment out 
    - ```default_schema: airbnb_clone```
  - Run the application
    - ```mvn spring-boot:run```
  - Remove the comment for ```default_schema: airbnb_clone``` and rerun the application

<p align="right">(<a href="#readme-top">back to top</a>)</p>

<!-- SCREENCAPS -->
## Screencaps

![Image](screencaps/Home.png)
![Image](screencaps/Search.png)
![Image](screencaps/Listing.png)
![Image](screencaps/Landlord.png)

<p align="right">(<a href="#readme-top">back to top</a>)</p>


[Java.java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/en/
[Maven]: https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white
[Maven-url]: https://maven.apache.org/
[SpringBoot]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[Spring-url]: https://spring.io/projects/spring-boot
[PostgreSQL]: https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white
[PostgreSQL-url]: https://www.postgresql.org/
[Angular]: https://img.shields.io/badge/angular-%23DD0031.svg?style=for-the-badge&logo=angular&logoColor=white
[Angular-url]: https://angular.io/
[Docker]: https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white
[Docker-url]: https://www.docker.com/
[Auth0]: https://img.shields.io/badge/Auth0-%230A0A0A.svg?style=for-the-badge&logo=Auth0&logoColor=white
[Auth0-url]: https://auth0.com/