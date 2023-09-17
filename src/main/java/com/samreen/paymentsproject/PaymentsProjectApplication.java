package com.samreen.paymentsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@SpringBootApplication(scanBasePackages = { "com.cpt.payments" })
@EnableAsync
@EnableScheduling
public class PaymentsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentsProjectApplication.class, args);
		System.out.println("application started....Welcome to the payment gateway.");
	}

}
