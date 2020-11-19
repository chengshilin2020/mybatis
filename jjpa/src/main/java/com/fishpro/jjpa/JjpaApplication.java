package com.fishpro.jjpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactoryBean;
import org.springframework.data.repository.query.QueryLookupStrategy;

@EnableJpaRepositories(
            basePackages = "com.fishpro.jjpa")
@SpringBootApplication
public class JjpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JjpaApplication.class, args);
    }

}
