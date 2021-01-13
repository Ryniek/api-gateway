package pl.rynski.kalendarzzagle;

import org.keycloak.adapters.KeycloakConfigResolver;
import org.keycloak.adapters.springboot.KeycloakSpringBootConfigResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

//EnableZuulServer jest podzbiorem Proxy(bez filtrow)
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class KalendarzZagleApplication {

    public static void main(String[] args) {
        SpringApplication.run(KalendarzZagleApplication.class, args);
    }

}
