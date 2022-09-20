package br.com.feignwebflux.webfluxreactivefeignstarwars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import reactivefeign.spring.config.EnableReactiveFeignClients;

@SpringBootApplication
@EnableReactiveFeignClients
public class WebfluxReactiveFeignStarwarsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebfluxReactiveFeignStarwarsApplication.class, args);
    }

}
