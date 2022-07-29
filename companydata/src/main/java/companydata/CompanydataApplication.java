package companydata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CompanydataApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompanydataApplication.class, args);
	}

}
