package project.bioinformatics;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@RequiredArgsConstructor
@EnableAsync
public class BioinformaticsApplication {
    public static void main(String[] args) {
        SpringApplication.run(BioinformaticsApplication.class, args);

    }

}
