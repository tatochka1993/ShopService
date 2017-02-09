package by.epamproject.configuration;

//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(securedEnabled = true)
//
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    @Qualifier("customUserDetailsService")
//    UserDetailsService customUserDetailsService;
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(customUserDetailsService);
//        auth.authenticationProvider(authenticationProvider());
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//    @Bean
//    public DaoAuthenticationProvider authenticationProvider() {
//        DaoAuthenticationProvider authenticationProvider = new DaoAuthenticationProvider();
//        authenticationProvider.setUserDetailsService(customUserDetailsService);
//        authenticationProvider.setPasswordEncoder(passwordEncoder());
//        return authenticationProvider;
//    }
//
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//            .authorizeRequests()
//           .antMatchers("/products/**").anonymous()
//            //.antMatchers("/registration").anonymous() //"loginClient/code/**",
//           // .antMatchers( "/login").permitAll() //"login"
//
//
////            .anyRequest().authenticated()
//            .and()
//
//            .formLogin()
//            .loginPage("/login")
//            .loginProcessingUrl("/j_spring_security_check")
//            .defaultSuccessUrl("/")
//            .failureUrl("/login?error")
//            .usernameParameter("login")
//            .passwordParameter("password")
//
//            .and()
//
//            .logout()
//            .logoutUrl("/j_spring_security_logout")
//            .logoutSuccessUrl("/login")
//            .deleteCookies("JSESSIONID")
//            .invalidateHttpSession(true)
//            .and()
//
//            .csrf().disable();

//    }
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web
//            .ignoring()
//            .antMatchers("/resources/**");
//    }
//
//    @Autowired
//    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(customUserDetailsService);
//        auth.authenticationProvider(authenticationProvider());
//    }
//}
