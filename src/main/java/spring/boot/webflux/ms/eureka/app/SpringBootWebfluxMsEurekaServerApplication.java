package spring.boot.webflux.ms.eureka.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringBootWebfluxMsEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWebfluxMsEurekaServerApplication.class, args);
	}

}
