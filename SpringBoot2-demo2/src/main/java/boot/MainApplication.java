package boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MainApplication {

    public static void main(String[] args) {
        //IOC容器
        ConfigurableApplicationContext context = SpringApplication.run(MainApplication.class, args);

    }
}
