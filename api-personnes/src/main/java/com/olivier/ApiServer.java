package com.olivier;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = { "com.olivier", "com.olivier.api" })
public class ApiServer {

    //TODO prise en compte de application.properties pour changer le port
	public static void main(String[] args) throws Exception {
        new SpringApplication(ApiServer.class).run(args);
    }

}