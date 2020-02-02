### Workshop Quarkus-Framework 


Nesse Workshop desenvolvemos uma aplicação que permite super heróis lutarem contra vilões.

## Software Requirements

	- JDK 8
	- Maven 3.6.x
	- Docker
	- Postman (Ou qualquer HTTP Client)
	- Node Js

## Conceitos abordados:


	- Microserviços
	- REST API
	- Postgres
	- Angular
	- Kakfa
	- Prometheus
	- WebSocket
	- Send to Statistics asynchronously.
	- Docker
	- Docker-compose
	- Test
	- TestContainers
	- Quarkus
	- Swagger


## Repositórios


	- Super Hero UI. Aplicação angular.
	- Hero REST API. Operações com heróis.
	- Villain REST API: Operações com vilões.
	- Fight REST API: Microsserviço que se comunica com o Hero REST API e o Villain REST API onde
	cada luta é armazenada e tem suas métricas atualizadas.
	- Statistics: Microsserviço responsável por receber as estatísticas via Kafka e utilizando HTML
	e JQuery para mostra-las. 
	- Prometheus: Recebe as métricas de todas as APIs e gera gráficos para visualização.
	- Infrastructure: Pasta com toda a infra necessária.
	- LoadSuperHeroes: Aplicação Java para fazer requisições de forma automática para os microsserviços
	
	
![Application Image](./assets/application.png)
