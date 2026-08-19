# Owner Service

Microservice responsible for managing pet owner records in the Pet Clinic system. Handles owner registration, profile management, and owner data retrieval for the Pet Clinic Management System.

## Student Information
- **Student Name:** Isuri Gamage
- **Student Number:** 241722008
- **Slack Handle:** 
- **GCP Project ID:** 

## Project Description
The `owner-service` is one of three core microservices in the Pet Clinic system. It manages CRUD operations for pet owners, including their contact details and address information. This service is registered with Eureka Service Registry and retrieves centralized configuration from the Config Server. It is accessed by external clients through the API Gateway.

## Technology Stack
- **Language:** Java 25
- **Framework:** Spring Boot, Spring Cloud, Spring Data JPA
- **Database:** MySQL (Relational Database)
- **Service Discovery:** Netflix Eureka Client
- **Configuration:** Spring Cloud Config Client
- **Build Tool:** Maven
- **Cloud Platform:** Google Cloud Platform (GCP) — deployed as IaaS on Compute Engine VM Instance Groups
- **Process Management:** PM2

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/owners` | Get all owners |
| GET | `/api/owners/{id}` | Get owner by ID |
| POST | `/api/owners` | Create a new owner |
| PUT | `/api/owners/{id}` | Update an existing owner |
| DELETE | `/api/owners/{id}` | Delete an owner |

## Setup / Getting Started

### Prerequisites
- Java 25 (JDK)
- Maven
- MySQL Server running locally
- Eureka Server and Config Server running

### Steps
1. Clone the repository:
   ```bash
   git clone https://github.com/Isuri15/owner-service.git
   cd owner-service
   ```
2. Configure your MySQL credentials in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   ```
3. Ensure `eureka-server` (port 8761) and `config-server` (port 8888) are running.
4. Build and run the service:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```
5. The service will start on port `8081` and auto-register with Eureka.

## Cloud Deployment
This service is deployed on Google Cloud Platform using:
- Compute Engine VM Instance Groups (auto-scaling, multi-zone)
- Cloud SQL (MySQL) as the managed database
- PM2 for process management and automatic restart on the VM

## Related Repositories
This service is part of the Pet Clinic microservices system. See the parent repository:
- [backend-services](https://github.com/Isuri15/backend-services)
