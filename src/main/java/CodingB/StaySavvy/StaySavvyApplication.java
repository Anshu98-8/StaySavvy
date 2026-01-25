package CodingB.StaySavvy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class StaySavvyApplication {

	public static void main(String[] args) {
		SpringApplication.run(StaySavvyApplication.class, args);
	}

}
