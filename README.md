# desafio-crud-backend
API REST de criptio moedas feita em Java Spring Boot com utilização do banco de dados MySQL.

Para execução desta aplicação, serão necessários as seguintes instalações:
- Instalação do MySQL Community Server v8.0.29.
- Instalação da JDK 17.
- Instalação da IDE de preferência para abrir o projeto.
- (opcional) Instalação de uma API Client para testes da API.

Após a instalação e configuração de todos os itens listados anteriormente, o próximo passo será a criação do database:
- Abrir o Command Line do MySQL.
- Entrar com o password escolhido na configuração de instalação do MySQL.
- Executar o seguinte script: 
  CREATE DATABASE crypto_currencies_db;.
- Para verificar o sucesso da criação do database, executar o seguinte script: 
  SHOW databases;.

Após a criação do database, abrir o projeto na IDE escolhida, configurar a opção de run da aplicação com a seleção da JDK 17, e rodar a aplicação.

Adendos:
- Para mudar as configurações de conexão com a database, entrar no arquivo application.properties seguindo o seguinte path: 
  desafio-crud/src/main/resources/application.properties
  
  Script que determina a porta de conexão do database com a API.
  spring.datasource.url=jdbc:mysql://${MYSQL_HOST:localhost}:3306/crypto_currencies_db?useTimezone=true&serverTimezone=UTC
  
  Script que determina o usuário do database.
  spring.datasource.username=root
  
  Script que determina a senha do database.
  spring.datasource.password=123456
  
  Script que possibilita a criação e alteração do database.
  spring.jpa.hibernate.ddl-auto=update
  
 Com a instalação opcional da API Cliente, segue a listagem dos endpoints da API para testes dos mesmos:
 -GET
  localhost:8080/cryptocurrencies
  
 -POST
  localhost:8080/cryptocurrencies
 
 -PUT
  localhost:8080/cryptocurrencies
  
 -DELETE
  localhost:8080/cryptocurrencies/{id}
  
 -SEARCH
  localhost:8080/cryptocurrencies/search/?keyword={keyword}
