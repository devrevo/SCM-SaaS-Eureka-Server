package com.scm_saas_eureka.scm_saas_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer

public class ScmSaasEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScmSaasEurekaApplication.class, args);
	}

}
