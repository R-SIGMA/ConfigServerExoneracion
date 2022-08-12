package com.idat.configserverexoneracion;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class ConfigserverexoneracionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverexoneracionApplication.class, args);
	}

}
