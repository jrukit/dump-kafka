package com.example.kafka;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@ExtendWith(MockitoExtension.class)
class TransactionConsumerTest {
    @InjectMocks
    private TransactionConsumer transactionConsumer;

    @Test
    void test() {
        Transaction transaction = new Transaction();
        transaction.setTransactionId("mocked-id");
        transaction.setAmount(new BigDecimal("10.00"));
        transaction.setAccountId("mocked-acc-id");
        transaction.setTimestamp(LocalDateTime.now());
        transactionConsumer.consume(transaction);
    }
}