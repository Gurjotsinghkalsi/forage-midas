package com.jpmc.midascore.component;

import com.jpmc.midascore.foundation.Transaction;

import org.springframework.kafka.annotation.KafkaListener;

import org.springframework.messaging.handler.annotation.Payload;

import org.springframework.stereotype.Component;

@Component

public class TransactionListener {

    @KafkaListener(topics = "${general.kafka-topic}")

    public void listen(@Payload Transaction transaction) {

        System.out.println(transaction.getAmount());

    }

}