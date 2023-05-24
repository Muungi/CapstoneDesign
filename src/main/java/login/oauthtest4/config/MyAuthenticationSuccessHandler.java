//package com.example.demo2.config;
//
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.oauth2.core.user.OAuth2User;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//import org.springframework.web.util.UriComponentsBuilder;
//
//import java.io.IOException;
//import java.nio.charset.StandardCharsets;
//
//@Component
//public class MyAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
//
//    private static final String REDIRECT_URI = "http://localhost:3000/logincheck";
//
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//                                        Authentication authentication) throws IOException {
//
//        OAuth2User oAuth2User = (OAuth2User) authentication.getPrincipal();
//        System.out.println("SuccessHandler oAuth2User: " + oAuth2User);
//
//        String redirectUrl = UriComponentsBuilder.fromUriString(REDIRECT_URI)
//                .queryParam("accessToken", "accessToken")
//                .queryParam("refreshToken", "refreshToken")
//                .build()
//                .encode(StandardCharsets.UTF_8)
//                .toUriString();
//
//        //response.sendRedirect(redirectUrl);
//        response.sendRedirect(UriComponentsBuilder.fromUriString("http://localhost:3000/login/callback")
//                .queryParam("accessToken", "accessToken")
//                .queryParam("refreshToken", "refreshToken")
//                .build()
//                .encode(StandardCharsets.UTF_8)
//                .toUriString());
//    }
//}