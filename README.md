<h1 align="center">Curso para utilização do RabbitMQ com Spring Framework </h1>

### Criação da imagem Docker do RabbitMQ

- Necessário configurar o docker no ambiente antes.

```docker
    docker run -d -p 15600:15672 -p 5600:5672 --name rabbitmq rabbitmq:3-management
```
------------------