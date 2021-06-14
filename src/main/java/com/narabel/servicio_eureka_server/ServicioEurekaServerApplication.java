package com.narabel.servicio_eureka_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.metrics.export.ConditionalOnEnabledMetricsExport;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnabledEurekaServer
@SpringBootApplication
public class ServicioEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioEurekaServerApplication.class, args);
	}

}
