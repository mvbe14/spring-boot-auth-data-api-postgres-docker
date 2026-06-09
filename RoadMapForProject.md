## Roadmap

### Stage 1 — Project structure
- [x] Create GitHub repository
- [x] Add auth-api
- [x] Add data-api
- [x] Add docker-compose.yml
- [x] Add User entity
- [x] Add ProcessingLog entity
- [x] Add UserRepository
- [x] Add ProcessingLogRepository
- [x] Run auth-api with PostgreSQL using Docker

### Stage 2 — Registration
- [x] Create DTOs for register request
- [x] Create AuthService
- [x] Hash password with BCrypt
- [x] Save user to database
- [x] Add POST /api/auth/register
- [x] Test registration with curl/Postman

### Stage 3 — Login and JWT
- [x] Create login DTO
- [x] Validate email and password
- [x] Generate JWT token
- [x] Return token to client
- [x] Test login

### Stage 4 — Security
- [ ] Configure Spring Security need to know what is it
- [ ] Add JWT filter
- [ ] Protect /api/process
- [ ] Leave /api/auth/register and /api/auth/login public

### Stage 5 — data-api
- [ ] Add transform request/response DTO
- [ ] Add internal token validation
- [ ] Add POST /api/transform
- [ ] Return transformed text
- [ ] Test invalid token returns 403

### Stage 6 — process endpoint
- [ ] Add ProcessController in auth-api
- [ ] Call data-api from auth-api
- [ ] Save ProcessingLog
- [ ] Return result to client

### Stage 7 — Docker finalization
- [ ] Add Dockerfile for auth-api
- [ ] Add Dockerfile for data-api
- [ ] Configure docker-compose networking
- [ ] Test full flow with docker compose

### Stage 8 — Documentation
- [ ] Write README
- [ ] Add run commands
- [ ] Add curl examples
- [ ] Add architecture explanation