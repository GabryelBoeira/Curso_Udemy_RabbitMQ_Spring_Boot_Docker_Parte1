<h1 align="center">Curso para utilização do RabbitMQ com Spring Framework </h1>

### Criação da imagem Docker do RabbitMQ

- Necessário configurar o docker no ambiente antes.

```docker
    docker run -d -p 15672:15672 -p 5672:5672 --name rabbitmq rabbitmq:3-management
```
------------------