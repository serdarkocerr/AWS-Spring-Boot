package com.serdar.aws;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Bean;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.utility.DockerImageName;

@TestConfiguration(proxyBeanMethods = false)
class TestContainersConfiguration {

	@Bean
	@ServiceConnection
	// AWS ECR den docker image'ler çekilir.
	PostgreSQLContainer<?> postgresContainer() {
		var dockerImage =
				DockerImageName.parse("public.ecr.aws/docker/library/postgres:latest").asCompatibleSubstituteFor("postgres");
		return new PostgreSQLContainer<>(dockerImage)
				.withDatabaseName("movie")
				.withInitScript("init-db.sql");
	}

}
