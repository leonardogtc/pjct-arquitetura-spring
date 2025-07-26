package br.com.leonardogtc.arquiteturaspring;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        // SpringApplication.run(Application.class, args);

        SpringApplicationBuilder builder = new SpringApplicationBuilder(Application.class); // Cria um construtor de aplicação Spring Boot

        builder.bannerMode(Banner.Mode.OFF); // Desativa o banner do Spring Boot
        builder.profiles("producao"); // Define o perfil de produção
        builder.run(args); // Inicia a aplicação Spring Boot

        ConfigurableApplicationContext applicationContext = builder.context(); // Cria o contexto da aplicação Spring Boot

        ConfigurableEnvironment environment = applicationContext.getEnvironment(); // Obtém o ambiente configurável da aplicação
        String applicationName = environment.getProperty("spring.application.name"); // Obtém o nome da aplicação do ambiente
        System.out.println("Nome da aplicação: " + applicationName); // Imprime o nome da aplicação no console
    }

}
