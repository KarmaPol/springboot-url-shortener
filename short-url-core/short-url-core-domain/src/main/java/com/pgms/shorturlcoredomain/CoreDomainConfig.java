package com.pgms.shorturlcoredomain;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@EntityScan("com.pgms.shorturlcoredomain")
@EnableJpaRepositories("com.pgms.shorturlcoredomain")
public class CoreDomainConfig {
}
