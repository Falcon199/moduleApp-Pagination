package am.diloyan.backend.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "am.diloyan.backend.common.repository")
@EntityScan(basePackages = "am.diloyan.backend.common.model")
@ComponentScan(basePackages = {"am.diloyan.backend.*",
        "am.diloyan.backend.common.*"})
public class ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiApplication.class, args);
    }

}
