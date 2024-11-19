# Control Games
[![NPM](https://img.shields.io/npm/l/react)](https://github.com/devsuperior/sds1-wmazoni/blob/master/LICENSE)

# Sobre o projeto

https://dslist-production-f09e.up.railway.app/

Control Games é uma aplicação back-end construída durante o curso intensivo Java Spring, evento organizado pela [DevSuperior](https://devsuperior.com "Site da DevSuperior").

A aplicação consiste na exposição de uma API REST, 
que possibilita inclusão, pesquisa e controle de preferência de games.
Onde os dados são coletados inicialmente pela própria API.

## Modelo de domínio DSList

<img src="src/main/resources/img/dslist-domain-model.png" alt="Modelo Conceitual">

# Tecnologias utilizadas
## Back end
- Java
- Spring Boot
- JPA / Hibernate
- Maven
- H2
- Postgresql

## Implantação em produção
- Back end: Railway
- Banco de dados: Postgresql

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone https://github.com/ricardoguntzell/dslist

# entrar na pasta do projeto raiz

# executar o projeto
./mvnw spring-boot:run
```

# Autor

Ricardo Guntzell

www.linkedin.com/in/ricardoguntzelljr
