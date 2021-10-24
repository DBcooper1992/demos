package com.nicksui.wiki;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

@ComponentScan("com.nicksui")
@SpringBootApplication
public class WikiApplication {

    private static final Logger logger= LoggerFactory.getLogger(WikiApplication.class);

    public static void main(String[] args) {
        //SpringApplication.run(WikiApplication.class, args);
        SpringApplication app=new SpringApplication(WikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        String port=env.getProperty("server.port");
        logger.info("Application run successfully,server port:{}",port);
    }

}
