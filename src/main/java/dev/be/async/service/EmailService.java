package dev.be.async.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class EmailService {

    @Async("defaultTaskExecutor")
    public void sendMail() {
      log.info("[sendMail] :: {}",Thread.currentThread().getName());
    }

    @Async("messagingTaskExecutor")
    public void sendMailWithCustomTreadPool() {
        log.info("[sendMailWithCustomTreadPool] :: {}",Thread.currentThread().getName());
    }


}
