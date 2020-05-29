package com.skuldmoon.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.StandardEnvironment;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerApp {

    private static Logger logger = LoggerFactory.getLogger(ConfigServerApp.class);

    public static void main(String[] args) {
        StandardEnvironment standardEnvironment = new StandardEnvironment();
        String defaultProfile = standardEnvironment.getProperty("spring.profiles.active");
        if (defaultProfile == null) {
            defaultProfile = "native";
        }
        String user = standardEnvironment.getProperty("user.name");
        SpringApplication app = new SpringApplication(ConfigServerApp.class);
        app.setAdditionalProfiles("default", defaultProfile, user);
        ConfigurableApplicationContext configurableApplicationContext = app.run(args);
        String[] activeProfiles = configurableApplicationContext.getEnvironment().getActiveProfiles();
        logger.debug("There are " + activeProfiles.length + " profiles.");
        if (activeProfiles.length > 0) {
            for (String activeProfile : activeProfiles) {
                logger.debug("Profile will be applied : " + activeProfile);
            }
        }
        logger.info("Application started.");
    }
}
