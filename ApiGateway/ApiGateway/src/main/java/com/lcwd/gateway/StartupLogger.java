package com.lcwd.gateway;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class StartupLogger {
    private static final Logger logger = LoggerFactory.getLogger(StartupLogger.class);

    @PostConstruct
    public void logSomething() {
        logger.debug("API Gateway started and logging is working!");
    }
}

