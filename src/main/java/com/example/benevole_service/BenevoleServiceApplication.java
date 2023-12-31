package com.example.benevole_service;

import com.example.benevole_service.Entite.Benevole;
import com.example.benevole_service.Repository.BenevoleRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
public class BenevoleServiceApplication {
    private BenevoleRepository benevoleRepository;
    public BenevoleServiceApplication(BenevoleRepository benevoleRepository) {
        this.benevoleRepository = benevoleRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(BenevoleServiceApplication.class, args);
    }
    @Bean
    public CommandLineRunner start(BenevoleRepository benevoleRepository,
                                     RepositoryRestConfiguration restConfiguration){
        return  args ->{
            restConfiguration.exposeIdsFor(Benevole.class);
            Benevole benevole = new Benevole("leila", "khira", 22, "0669884978", "118 route De Narbonne ", new Date());
            benevoleRepository.save(benevole);
            benevoleRepository.save(benevole);
        };
    }

}
