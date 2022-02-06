package com.kodilla.spacestation.repository;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class RepositoryConfiguration {

    @Bean
    TelescopeResponseRepo responseRepo() {
        return new InMemoryTelescopeResponseRepository();
    }
}
