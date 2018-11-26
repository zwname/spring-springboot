package zw.itman.config;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;


import java.util.Arrays;
import java.util.stream.Collectors;

@Configuration
public class Config {

    @Bean
    public ApplicationRunner runner(){
        return args -> {
            System.out.println("aoolication runner");
            for (String opp:args.getOptionNames()){
                System.out.println(opp);
                System.out.println("->");
                System.out.println(args.getOptionValues(opp).stream().collect(Collectors.joining()));
            }
        };
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx){
        return args->{

            System.out.println("bean的个数"+ctx.getBeanDefinitionCount());
            String [] names=ctx.getBeanDefinitionNames();
            Arrays.sort(names);
            for(String name:names){
                System.err.println(name);
            }
        };

    }
    @Bean
    public CommandLineRunner testA(){
        CommandLineRunner commandLineRunner=new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                System.out.println("the testA runner start init...");
            }
        };
        return commandLineRunner;
    }
}
