package securitylivrariasrs;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.HttpBasicConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        HttpBasicConfigurer<HttpSecurity> httpSecurityHttpBasicConfigurer = http.csrf().disable()
                .authorizeRequests()
                .anyRequest().permitAll()  // Permitir acesso público às rotas da API
                .anyRequest().authenticated()       // Exigir autenticação para qualquer outra rota
                .and()
                .httpBasic();// Habilitar autenticação HTTP Basic

        return http.build();
    }
}


