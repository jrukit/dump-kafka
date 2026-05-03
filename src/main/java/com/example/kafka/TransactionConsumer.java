package com.example.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class TransactionConsumer {
    @KafkaListener(
            topics = "test-topic",
            properties = {
                    "spring.json.value.default.type=com.example.kafka.Transaction"
            }
    )
    public void consume(Transaction transaction) {
        System.out.println("transactionId: " + transaction.getTransactionId());
        System.out.println("accountId: " + transaction.getAccountId());
        System.out.println("amount: " + transaction.getAmount());
        System.out.println("timestamp: " + transaction.getTimestamp());
    }
}
