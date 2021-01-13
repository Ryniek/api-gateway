package pl.rynski.kalendarzzagle.api;

import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext;
import org.keycloak.adapters.springsecurity.token.KeycloakAuthenticationToken;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class AuthorizationController {

    @GetMapping("/test")
    public String test() {
        return "Test";
    }

    @GetMapping("/hello")
    public String hello(HttpServletRequest request) {
        KeycloakAuthenticationToken token = (KeycloakAuthenticationToken) request.getUserPrincipal();
        KeycloakPrincipal principal=(KeycloakPrincipal)token.getPrincipal();
        System.out.println(principal.getName());
        KeycloakSecurityContext session = principal.getKeycloakSecurityContext();
        System.out.println(session.getTokenString());
        return "Hello world!";
    }
}
