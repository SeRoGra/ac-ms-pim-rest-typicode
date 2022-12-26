package co.com.accenture.acmspimresttypicode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ AcMsPimRestTypicodeApplication.MAIN_PACKAGE })
@EnableFeignClients(basePackages = { "co.com.accenture.acmspimresttypicode.client" })
public class AcMsPimRestTypicodeApplication {

	public static final String MAIN_PACKAGE = "co.com.accenture.acmspimresttypicode";

	public static void main(String[] args) {
		SpringApplication.run(AcMsPimRestTypicodeApplication.class, args);
	}

}