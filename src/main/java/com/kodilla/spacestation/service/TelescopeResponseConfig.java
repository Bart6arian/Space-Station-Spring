package com.kodilla.spacestation.service;

import com.kodilla.spacestation.repository.TelescopeResponseRepo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class TelescopeResponseConfig {

    @Bean
    TelescopeResponseService responseService(TelescopeResponseRepo responseRepo) {
        return new TelescopeResponseImplementation(responseRepo);
    }
}
