package zw.itman.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(1)
public class Runner1 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("runner1 start tp init ");
    }
}
