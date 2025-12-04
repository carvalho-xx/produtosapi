# Products API with Spring Boot, H2 and JPA

## 🚀 Features

* CRUD Operations
* Personalized Search
* In-Memory Database (H2)

## 🛠 Technologies Used

* **Java 21**
* **Spring Boot 3.2.5**
* **JPA / Hibernate**
* **H2 Database**
* **Maven**
* **Lombok**
* **Postman**

## 📌 Getting Started

### ▶️ How to Run the Project

1. Clone the repository:

   ```bash
   git clone "http"
   ```
2. Install dependencies:

   ```bash
   mvn clean install
   ```
3. Execute the main class to start the API.

### 📬 How to Use the API (via Postman)

Base URL:

```
http://localhost:8080
```

### ➕ Create a Product

* **POST** → `{{baseURL}}/produtos`
* Body (JSON): send product information *without* `id` (auto-generated).

### 🔍 Search by Name

* **GET** → `{{baseURL}}/produtos?nome={name}`

### 🔄 Update a Product

* **PUT** → `{{baseURL}}/produtos/{id}`
* Send the ID in the path and updated data in the request body.

### 📖 Read by ID

* **GET** → `{{baseURL}}/produtos/{id}`

### ❌ Delete by ID

* **DELETE** → `{{baseURL}}/produtos/{id}`

## 📚 API Endpoints

| Operação   | Método | Endpoint           | Descrição                            |
| ---------- | ------ | ------------------ | ------------------------------------ |
| Create     | POST   | `/produtos`        | Cadastra um produto                  |
| Search     | GET    | `/produtos?nome=x` | Busca por nome                       |
| Read       | GET    | `/produtos/{id}`   | Busca por ID                         |
| Update     | PUT    | `/produtos/{id}`   | Atualiza produto por ID              |
| Delete     | DELETE | `/produtos/{id}`   | Remove produto por ID                |
| H2 Console | GET    | `/h2-console`      | Acessa o console do banco em memória |

## 👤 Author

**João Pedro Carvalho de Mesquita**

🔗 LinkedIn: [https://www.linkedin.com/in/jpcarvalho42/](https://www.linkedin.com/in/jpcarvalho42/)
