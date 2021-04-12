<h1 align="center">Curso para utilização do RabbitMQ com Spring Framework </h1>

### Pré-requisito Docker

Para executar este projeto, você precisará do docker instalado.

* [Windows](https://docs.docker.com/windows/started)
* [OS X](https://docs.docker.com/mac/started/)
* [Linux](https://docs.docker.com/linux/started/)

### Criação da imagem Docker do RabbitMQ

- Por padrão a porta para acesso grafico é a 15672 e do acesso ao serviço pelo spring é a 5672.
- Portas alteradas neste projeto pois tenho outra aplicação do RabbitMQ em ambiente local.

```shell
    docker run -d -p 15600:15672 -p 5600:5672 --name rabbitmq rabbitmq:3-management
```

- Configurar a execução do Dead-Letter do RabbitMQ
  
```shell
    1- $ docker exec -it rabbitmq bash
    2- $ rabbitmq-plugins enable rabbitmq_shovel rabbitmq_shovel_management
```
------------------

- Projeto dividio em producer e consumer 
- Producer: Responsavel por receber a menssagem e adiconar a fila no RabbitMQ
- Consumer Responser por ler/capturar o item criado no RabbitMQ e processar a informação

------------------