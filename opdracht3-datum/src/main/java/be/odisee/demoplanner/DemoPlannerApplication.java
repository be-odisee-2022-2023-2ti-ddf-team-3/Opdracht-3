package be.odisee.demoplanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

//@EntityScan("be.odisee.demoplanner.domain")
@SpringBootApplication

public class DemoPlannerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoPlannerApplication.class, args);
    }

}
