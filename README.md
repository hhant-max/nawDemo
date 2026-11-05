# nawDemo

A small Spring Boot demo application.

## Run locally

```zsh
cd "/Users/sofia/Documents/myProjects/nawDemo"
./mvnw spring-boot:run
```

## Small API

- `GET /api/hello`
- Optional query parameter: `name`

Examples:

- `http://localhost:8080/api/hello`
- `http://localhost:8080/api/hello?name=Sofia`

Example response:

```json
{
  "message": "Hello, Sofia!",
  "timestamp": "2026-11-05T14:25:00Z"
}
```

## Build roadmap (phased)

### Phase 1 - API basics (1-2 days)

1. Define API contract (1-2 hours)
   - Endpoints, request/response JSON, status codes.
2. Build controller endpoints without database (2-4 hours)
   - Start with simple GET and POST flows.
3. Add DTOs and request validation (1-2 hours)
   - Use `@NotBlank`, `@Size`, etc.

### Phase 2 - Business and data layer (2-3 days)

4. Add a service layer (2-4 hours)
   - Keep controllers thin and move logic to services.
5. Add persistence with H2 (3-5 hours)
   - Create `@Entity` and `Repository`.
6. Add CRUD endpoints (3-5 hours)
   - `POST`, `GET`, `PUT/PATCH`, `DELETE`.

### Phase 3 - Quality and production readiness (2-3 days)

7. Add tests by layer (4-8 hours)
   - `@WebMvcTest`, unit tests, integration tests.
8. Add error handling (2-3 hours)
   - Standardize API error response format.
9. Add pagination/filtering (2-4 hours)
   - Improve list endpoints for real usage.
10. Prepare for production (3-5 hours)
   - Actuator health checks, profiles, Postgres config.

## Suggested pace

- Week 1: Complete Phase 1 + start Phase 2.
- Week 2: Finish Phase 2 + complete Phase 3.
