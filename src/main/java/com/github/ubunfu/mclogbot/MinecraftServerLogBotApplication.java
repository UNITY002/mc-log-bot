package com.github.ubunfu.mclogbot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class MinecraftServerLogBotApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinecraftServerLogBotApplication.class, args);
	}

}