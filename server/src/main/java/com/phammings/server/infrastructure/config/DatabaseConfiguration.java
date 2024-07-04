package com.phammings.server.infrastructure.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories({"com.phammings.server.user.repository",
        "com.phammings.server.listing.repository",
        "com.phammings.server.booking.repository"})
@EnableTransactionManagement
@EnableJpaAuditing
public class DatabaseConfiguration {
}
