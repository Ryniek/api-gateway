package pl.rynski.kalendarzzagle.api;

import org.keycloak.adapters.springsecurity.client.KeycloakRestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.util.List;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private KeycloakRestTemplate restTemplate;

    @GetMapping("/api/users")
    public List users() {
        return restTemplate.getForEntity(URI.create("http://localhost:8080/auth/admin/realms/zagle/users"), List.class)
                .getBody();
    }

    @GetMapping("/api/roles")
    public List roles() {
        return restTemplate.getForEntity(URI.create("http://localhost:8080/auth/zagle/roles"), List.class)
                .getBody();
    }

}
