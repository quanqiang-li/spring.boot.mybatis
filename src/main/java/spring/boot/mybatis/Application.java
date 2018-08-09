package spring.boot.mybatis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		try {
			Thread.currentThread().sleep(1000 * 100);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
