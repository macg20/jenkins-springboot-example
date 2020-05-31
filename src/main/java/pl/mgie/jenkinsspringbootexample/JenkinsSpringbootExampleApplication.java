package pl.mgie.jenkinsspringbootexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsSpringbootExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsSpringbootExampleApplication.class, args);
    }

    @GetMapping
    public String get() {
        return "test";
    }
}
