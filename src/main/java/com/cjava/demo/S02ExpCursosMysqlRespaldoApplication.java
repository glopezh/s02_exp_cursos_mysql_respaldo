package com.cjava.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient // Para que se registre en el servidor Eureka
@SpringBootApplication
public class S02ExpCursosMysqlRespaldoApplication {

    public static void main(String[] args) {
        SpringApplication.run(S02ExpCursosMysqlRespaldoApplication.class, args);
    }

}
