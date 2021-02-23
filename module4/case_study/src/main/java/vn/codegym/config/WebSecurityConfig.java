package vn.codegym.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import vn.codegym.service.UserDetailsServiceImpl;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Autowired
    UserDetailsServiceImpl userDetailsService;

    @Bean
    public BCryptPasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
        // Tìm kiếm User trong Database.
        // Và đặt PasswordEncoder.
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        //csrf
        http.csrf().disable();
        //login
        http.formLogin()
                .loginProcessingUrl("/checkLogin")
                .loginPage("/login")
                // login successful
                .defaultSuccessUrl("/")
                // login failed
                .failureUrl("/login?error=true")
                // setting username, password
                .usernameParameter("userName")
                .passwordParameter("password")
                // logout
                .and().logout().logoutUrl("/logout")
                // logout successful
                .logoutSuccessUrl("/");

        http.authorizeRequests().antMatchers("/login","/logout").permitAll();

//        http.authorizeRequests().antMatchers("/customer").hasAnyRole("ADMIN","MEMBER");

        http.exceptionHandling().accessDeniedPage("/403");

        http.rememberMe()
                .rememberMeParameter("rememberMe")
                .rememberMeCookieName("rememberMeCookie")
                .tokenValiditySeconds(60 * 60 * 24 * 7); // 7 days
    }
}
