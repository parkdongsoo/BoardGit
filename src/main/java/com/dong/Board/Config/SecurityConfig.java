/*
 * package com.dong.Board.Config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.factory.PasswordEncoderFactories; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.web.SecurityFilterChain;
 * 
 * import com.dong.Board.Service.MemberService;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class SecurityConfig {
 * 
 * @Autowired private MemberService memberService;
 * 
 * @Bean public SecurityFilterChain filterChain(HttpSecurity http) throws
 * Exception{ return http.csrf().disable() .authorizeRequests()
 * .antMatchers("/customer/board/insertForm").authenticated()
 * .anyRequest().permitAll() .and() .formLogin() .loginPage("/login/login")
 * .loginProcessingUrl("/login/loginPro")
 * .defaultSuccessUrl("/customer/board/list") .and() .build();
 * 
 * }
 * 
 * @Bean public BCryptPasswordEncoder bCryptPasswordEncoder() { return new
 * BCryptPasswordEncoder(); } }
 */
