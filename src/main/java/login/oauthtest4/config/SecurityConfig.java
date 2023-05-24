//package com.example.demo2.config;
//
//import com.example.demo2.service.CustomOAuth2UserService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.EnableAspectJAutoProxy;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.http.SessionCreationPolicy;
//import org.springframework.security.oauth2.client.web.OAuth2AuthorizationRequestRedirectFilter;
//import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.CorsConfigurationSource;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//
//import java.util.Arrays;
//
//
//
//
//@Configuration
//@RequiredArgsConstructor
//@EnableWebSecurity
//public class SecurityConfig {
//    //private final CorsProperties corsProperties;
//
//    @Autowired
//    CustomOAuth2UserService customOAuth2UserService;
//
//    @Autowired
//    MyAuthenticationSuccessHandler myAuthenticationSuccessHandler;
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
//                .and()
//                .cors().configurationSource(corsConfigurationSource())
//                .and()
//                .csrf().disable()
//                .authorizeHttpRequests()
//                .requestMatchers("/").permitAll()
//                .requestMatchers("/login").permitAll()
//                .requestMatchers("/api/getMycloset2/kookmin123").permitAll()
//                .requestMatchers("/addClothes").permitAll()
//                //.requestMatchers("/testAI").permitAll()
//                //.requestMatchers("/testing").permitAll()
//                .requestMatchers("/api/uploadTempCloset_OUTER").permitAll()
//                .requestMatchers("/user").hasRole("USER")
//                .anyRequest().permitAll()
//                .and()
//
//                .exceptionHandling().accessDeniedPage("/accessDenied")
//                .and()
//                .logout().logoutUrl("/logout")
//                .logoutSuccessUrl("/").permitAll()
//                .and()
//                .oauth2Login().loginPage("/login")
//                //인증에 성공하면 실행할 handler (redirect 시킬 목적)
//                //.successHandler(myAuthenticationSuccessHandler)
//                //OAuth 2.0 Provider로부터 사용자 정보를 가져오는 엔드포인트를 지정하는 메서드
//                .userInfoEndpoint()
//                //OAuth 2.0 인증이 처리되는데 사용될 사용자 서비스를 지정하는 메서드
//                .userService(customOAuth2UserService)
//                .and();
//        return http.build();
//    }
//
//    @Bean
//    public CorsConfigurationSource corsConfigurationSource() {
//        CorsConfiguration corsConfiguration = new CorsConfiguration();
//        corsConfiguration.setAllowedOriginPatterns(Arrays.asList("*"));
//        corsConfiguration.setAllowedMethods(Arrays.asList("*"));
//        corsConfiguration.setAllowedHeaders(Arrays.asList("*"));
//        corsConfiguration.setAllowCredentials(true);
//
//        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//        source.registerCorsConfiguration("/**", corsConfiguration);
//
//        return source;
//    }
//
//}
