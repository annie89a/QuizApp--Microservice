# QuizApp Microservice Architecture

The existing QuizApp has been transformed into a microservice architecture, with the following services:

1. Question Service

- Teachers can perform CRUD operations on questions.
- After a student has taken a quiz, the result will be calculated and passed to the Quiz Service.
- Teachers can:
  - Get all questions.
  - Get all questions by category.
  - Get questions by ID.

2. Quiz Service

- Teachers can create quizzes by informing the Question Service to generate a quiz.
- Teachers can get questions based on quiz ID.
- Requests to the Question Service will be sent to calculate the result.

Inter-Service Communication

For interaction between these two services, an Eureka server is used:

- All microservices are registered with the Eureka server.
- Microservices can search for one another from the Eureka server using the Eureka client.
