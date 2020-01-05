package com.pomato.springpomato;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringpomatoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringpomatoApplication.class, args);
		
		/*PomatoResource resource = context.getBean(PomatoResource.class);*/
	}

}
