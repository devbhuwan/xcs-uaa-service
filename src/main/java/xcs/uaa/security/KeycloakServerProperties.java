package xcs.uaa.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "keycloak.server")
@Getter
@Setter
public class KeycloakServerProperties {

    private String contextPath = "/auth";
    private AdminUser adminUser = new AdminUser();
    private String importRealms;

    @Getter
    @Setter
    public static class AdminUser {

        private String username = "admin";

        private String password = "admin";
    }
}