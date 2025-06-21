#  Photo Opp - Backend (Spring Boot)

Este é o backend do projeto **Photo Opp**, desenvolvido como parte do desafio técnico Full Stack.

---

##  Tecnologias utilizadas

- Java 17  
- Spring Boot 2.7  
- Spring Web (REST APIs)  
- Spring Data JPA  
- Banco de Dados H2 (em memória)  
- Maven  
- CORS Configuration para integração com o frontend  

---

##  Estrutura de Pastas

```
src/main/java/com/photoopp
├── config/                 # Configuração de CORS
├── controller/             # Endpoints REST (Photo e LogParticipacao)
├── dto/                    # DTOs para resposta de relatórios
├── model/                  # Entidades JPA (Photo, LogParticipacao)
├── repository/             # JPA Repositories
├── service/                # Camada de regras de negócio
└── PhotoOppApplication.java # Classe principal
```

---

##  Como rodar o backend localmente

1. **Pré-requisitos:**  
- Java 17  
- Maven  

2. **Rodar o projeto:**  

```bash
mvn spring-boot:run
```

O backend será executado na porta padrão **8080**:  
[http://localhost:8080](http://localhost:8080)

---

##  Endpoints Disponíveis

###  Salvar uma foto

- **POST** `/photos`
- **Body (JSON):**

```json
{
  "imageUrl": "base64-ou-url-da-foto",
  "createdAt": "2025-06-20T22:54:47"
}
```

---

###  Listar todas as fotos

- **GET** `/photos`

Exemplo de retorno:

```json
[
  {
    "id": 1,
    "imageUrl": "string_base64_ou_url",
    "createdAt": "2025-06-20T22:54:47"
  }
]
```

---

###  Quantidade de participações por dia

- **GET** `/photos/participacoes-por-dia`

Exemplo de resposta:

```json
[
  {
    "dia": "2025-06-20",
    "total": 3
  },
  {
    "dia": "2025-06-19",
    "total": 2
  }
]
```

>  Importante: só conta fotos com campo `createdAt` preenchido.

---

##  Link do Repositório Frontend

[https://github.com/FerRufato/Desafio-Photo-opp-frontend](https://github.com/FerRufato/Desafio-Photo-opp-frontend)

---

##  Link da aplicação frontend em produção (Vercel)

[https://desafio-photo-opp-frontend.vercel.app/](https://desafio-photo-opp-frontend.vercel.app/)

---

##  Observação Importante:

O layout **não segue fielmente o design do Figma**, pois o objetivo principal foi focar na **implementação técnica, APIs e integração funcional entre backend e frontend**.
