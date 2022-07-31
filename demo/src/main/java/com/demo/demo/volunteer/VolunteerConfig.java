package com.demo.demo.volunteer;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class VolunteerConfig {

    @Bean
    CommandLineRunner commandLineRunner(VolunteerRepository repository) {
        return args -> {
            Volunteer raj = new Volunteer("Raj", 22, "Krishna Nagar", 12345668L, "A+");
            Volunteer dev = new Volunteer("Dev", 23, "Holigate", 123456569L, "AB+");

            repository.saveAll(List.of(raj, dev));
        };
    }
}
