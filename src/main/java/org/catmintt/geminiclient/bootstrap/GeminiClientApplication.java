package org.catmintt.geminiclient.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.catmintt.geminiclient")
@SpringBootApplication
public class GeminiClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(GeminiClientApplication.class, args);
	}

}
