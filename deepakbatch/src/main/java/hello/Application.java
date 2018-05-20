package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	// Main application
    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}