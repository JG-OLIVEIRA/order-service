<h1 align="center">Order Microservice</h1>
Este microservice é responsável pelo gerenciamento de pedidos do Shopping Online. Ele permite a criação de um pedido de um produto incluindo código, quantidade e preço, bem como a atualização de informações existentes.

O microservice foi implementado seguindo o padrão RESTful e utiliza o protocolo HTTP para comunicação. Ele pode ser acessado pelo endpoint que responde ao verbo HTTP PUT, para realizar as operações de inserção nos pedidos.

Para usar o microservice, basta enviar requisições HTTP para o endpoints correspondente, passando os parâmetros necessários, conforme descrito na documentação da API. Com isso, é possível inserir informações de umn pedido de forma simples e eficiente.

## Endpoints Disponíveis

`PUT /order`: cadastra as informações de um pedido

## Tecnologias Utilizadas
O microservice de produtos foi implementado utilizando as seguintes tecnologias:

<ul>
<li>Java</li>
<li>MySQL</li>
<li>Spring Framework</li>
<li>Spring Boot</li>
<li>RESTful API</li>
<li>Protocolo HTTP</li>
</ul>

## Como Executar
Para executar o microservice de pedidos, é necessário ter o Java 17 e gerenciador de pacotes Maven instalados na máquina. Em seguida, basta clonar o repositório, abrir o projeto em uma IDE de sua escolha e executar os seguintes comandos para iniciar o serviço:

```bash
mvn package
```
```bash
mvn spring-boot:run
```

## Documentação da API
Para mais informações sobre como usar o microservice e seus endpoints disponíveis, consulte a documentação da API, que pode ser acessada em [openapi.yaml](openapi.yaml) após a inicialização do serviço.