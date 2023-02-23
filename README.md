Angular-SpringBoot-Template
This is a template project for an Angular frontend and Spring Boot backend, using Maven as the build tool.

Prerequisites
Node.js and npm (Node Package Manager)
Angular CLI
Java 11 or higher
Maven
Running the Application
Clone the repository:

```bash
Copy code
git clone https://github.com/your-username/your-project.git
cd your-project
Build the Angular frontend:
```

bash
Copy code
cd frontend
npm install
ng build
Build the Spring Boot backend:

bash
Copy code
cd ../backend
mvn clean package
Start the application:
mvn spring-boot:run


bash
Copy code
java -jar target/backend-0.0.1-SNAPSHOT.jar
The application will be running at http://localhost:8080.

Configuration
The application can be configured through the following environment variables:

DATABASE_URL: The URL of the database to connect to. Default: jdbc:h2:mem:db.
DATABASE_USERNAME: The username for the database connection. Default: sa.
DATABASE_PASSWORD: The password for the database connection. Default: empty.
These variables can be set when starting the application, for example:

License
This project is licensed under the MIT License. See the LICENSE file for details.