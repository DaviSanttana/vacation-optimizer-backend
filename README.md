# Vacation Optimizer

API REST desenvolvida em Java com Spring Boot que calcula as melhores datas para tirar férias, considerando feriados nacionais e fins de semana.

##  Demo

- **Frontend:** https://vacation-optimizer-frontend.vercel.app
- **API Docs (Swagger):** https://vacation-optimizer-backend-production.up.railway.app/swagger-ui/index.html

##  Tecnologias

### Back-end
- Java 21
- Spring Boot 3
- Spring Web (API REST)
- Spring Security
- Spring Data JPA
- H2 Database
- Lombok
- Springdoc OpenAPI (Swagger)

### Front-end
- React 18
- Vite
- CSS Variables (Dark/Light mode)

### Deploy
- Railway (Back-end)
- Vercel (Front-end)

##  Como funciona

1. O usuário informa quantos dias de férias tem disponíveis, o mês e o ano desejado
2. A API busca os feriados nacionais do ano na **BrasilAPI**
3. O algoritmo testa todas as possíveis datas de início no mês escolhido
4. Para cada data, calcula quantos dias extras o usuário ganha ao emendar com fins de semana e feriados
5. Retorna uma lista ordenada das melhores opções

## Endpoints

### POST `/api/vacations`

**Request:**
```json
{
  "vacationDays": 10,
  "month": "NOVEMBER",
  "year": 2026
}
```

**Response:**
```json
[
  {
    "startDate": "2026-11-03",
    "endDate": "2026-11-12",
    "extraDaysGained": 3,
    "totalDaysOff": 13
  }
]
```

##  Como rodar localmente

### Pré-requisitos
- Java 21
- Maven

### Back-end
```bash
git clone https://github.com/DaviSanttana/vacation-optimizer-backend.git
cd vacation-optimizer-backend
./mvnw spring-boot:run
```

Acesse: `http://localhost:8080`

### Front-end
```bash
git clone https://github.com/DaviSanttana/vacation-optimizer-frontend.git
cd vacation-optimizer-frontend
npm install
npm run dev
```

Acesse: `http://localhost:5173`

## 👨‍💻 Autor

**Davi Santtana**
- GitHub: [@DaviSanttana](https://github.com/DaviSanttana)