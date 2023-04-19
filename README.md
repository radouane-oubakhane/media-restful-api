# Social Media RESTful API

This is a RESTful API for a social media application built with Spring Boot. 
## Technologies Used

* Java  
* Spring Boot 
* MySQL 
* Maven

## Getting Started
1. Clone the repository to your local machine:


    git clone https://github.com/radouane-oubakhane/social-media-restful-api.git


2. Set up the MySQL database by running the following SQL script:


    create database database-name


3. Edit the application.properties file to configure your database connection:

    
    spring.datasource.url=jdbc:mysql://localhost:3306/database-name
    spring.datasource.username=your-username
    spring.datasource.password=your-password


4. Build and run the application with Maven:


    mvn spring-boot:run


## Endpoints

The following endpoints are available in the API:

#### Users

* GET /users - Get a list of all users.
* GET /users/{id} - Get a specific user by ID.
* POST /users - Create a new user.
* DELETE /users/{id} - Delete a user by ID.
* POST /users/{id}/posts - Create a new post.
* GET /users/{id}/posts - Get a list of posts by a specific user.
* GET /users/{userId}/posts/{postId} - Get a specific post by a specific user.

