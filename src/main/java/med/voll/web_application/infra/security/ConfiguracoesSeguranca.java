package med.voll.web_application.infra.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
@EnableWebSecurity
public class ConfiguracoesSeguranca {

    @Bean
    public UserDetailsService dadosUsuariosCadastros() {
        UserDetails usuario1 = User.builder()
                .username("pedro@email.com")
                .password("{noop}pedro123")
                .build();

        UserDetails usuario2 = User.builder()
                .username("bruno@email.com")
                .password("{noop}bruno123")
                .build();

        return new InMemoryUserDetailsManager(usuario1, usuario2);
    }
}
