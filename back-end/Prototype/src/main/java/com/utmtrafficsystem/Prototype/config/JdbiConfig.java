package com.utmtrafficsystem.Prototype.config;

import com.example.demo.repository.PhotoRepository;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class JdbiConfig {
        @Bean
        public Jdbi jdbi(DataSource dataSource) {
            return Jdbi.create(dataSource)
                    .installPlugin(new SqlObjectPlugin()); // This is crucial!
        }

        @Bean
        public PhotoRepository photoRepository(Jdbi jdbi) {
            return jdbi.onDemand(PhotoRepository.class);
        }
}

