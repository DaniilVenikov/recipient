package com.venikovdi.recipient.infra.transport.in;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.venikovdi.recipient.infra.transport.data.NoticeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class NoticeConsumer {
    private final ObjectMapper objectMapper;
    private final IncomeMessageManager messageManager;

    @KafkaListener(topics = "${application.kafka.notifierTopic}")
    public void consumeMessage(String message) throws JsonProcessingException {
        log.info("message consumed {}", message);

        NoticeMessage noticeMessage = objectMapper.readValue(message, NoticeMessage.class);
        messageManager.processNotice(noticeMessage);
    }
}
