package cloud_eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApplicationEur {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationEur.class, args);
	}
	
}
