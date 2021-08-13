package com.evilbas.metrics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class ServiceDiscovery {
    @Value("${context.root:}")
    private String contextRoot;

    private static final Logger log = LoggerFactory.getLogger(ServiceDiscovery.class);

    @EventListener(ApplicationReadyEvent.class)
    public void startupPrep() {
        log.info("oof Starting application");
        if (contextRoot != null && !contextRoot.equals("")) {
            log.info("Context root found: {}", contextRoot);
        }

    }

}
