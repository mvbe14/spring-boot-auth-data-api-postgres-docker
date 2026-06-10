# Spring Boot Auth Data API with PostgreSQL and Docker

This project contains two small Spring Boot services that run together with PostgreSQL using Docker Compose.

The main goal of this project is to practice Spring Boot, Spring Security, Spring Data JPA, PostgreSQL, JWT authentication, and communication between services.

## Project structure

```text
spring-boot-auth-data-api-postgres-docker/
│
├── auth-api/
│   └── Spring Boot service for registration, login, JWT and database access
│
├── data-api/
│   └── Spring Boot service for text processing
│
├── docker-compose.yml
├── .env.example
└── README.md
```

## Services

### auth-api

The `auth-api` service is responsible for:

* user registration
* user login
* password hashing with BCrypt
* JWT token generation
* connection to PostgreSQL
* saving users and processing logs

### data-api

The `data-api` service is responsible for:

* receiving text from `auth-api`
* processing the text
* returning the processed result

### PostgreSQL

PostgreSQL is used as the database for storing users and processing logs.

## Environment variables

Create a local `.env` file in the root of the project.

Example:

```env
POSTGRES_DB=app_db
POSTGRES_USER=postgres
POSTGRES_PASSWORD=postgres

JWT_SECRET=dev-jwt-secret-key-for-learning-project-please-change-later-123456
INTERNAL_TOKEN=dev-internal-token
```

The `.env` file is not committed to GitHub.
Use `.env.example` as a template.

## Run the project

Make sure Docker Desktop is running.

Then run:

```powershell
docker compose up --build
```

To stop the containers:

```powershell
docker compose down
```

To remove containers and database volume:

```powershell
docker compose down -v
```

## API examples

### Register

```powershell
Invoke-WebRequest -UseBasicParsing -Uri "http://localhost:8080/api/auth/register" -Method POST -ContentType "application/json" -Body '{"email":"test@example.com","password":"password123"}'
```

Expected result:

```text
201 Created
```

### Login

```powershell
Invoke-RestMethod -Uri "http://localhost:8080/api/auth/login" -Method POST -ContentType "application/json" -Body '{"email":"test@example.com","password":"password123"}'
```

Expected result:

```json
{
  "token": "jwt_token_here"
}
```

## Current status

Implemented:

* Docker Compose setup
* PostgreSQL container
* auth-api container
* data-api container
* User entity
* ProcessingLog entity
* JPA repositories
* user registration
* BCrypt password hashing
* login endpoint
* JWT token generation

Next steps:

* JWT validation
* protected `/api/process` endpoint
* communication between `auth-api` and `data-api`
* saving processing logs
