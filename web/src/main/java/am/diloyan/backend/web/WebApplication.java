package am.diloyan.backend.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "am.diloyan.backend.common.repository")
@EntityScan(basePackages = "am.diloyan.backend.common.model")
@ComponentScan(basePackages = {"am.diloyan.backend.web.*",
        "am.diloyan.backend.common.*"})
public class WebApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }

}
