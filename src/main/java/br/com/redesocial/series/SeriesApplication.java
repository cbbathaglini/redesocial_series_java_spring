package br.com.redesocial.series;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SeriesApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeriesApplication.class, args);
	}

}
