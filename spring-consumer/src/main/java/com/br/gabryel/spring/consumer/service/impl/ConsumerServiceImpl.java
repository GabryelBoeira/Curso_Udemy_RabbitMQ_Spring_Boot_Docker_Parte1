package com.br.gabryel.spring.consumer.service.impl;

import com.br.gabryel.spring.consumer.model.Message;
import com.br.gabryel.spring.consumer.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(Message message) {
        System.out.println(message.getText());
    }
}
