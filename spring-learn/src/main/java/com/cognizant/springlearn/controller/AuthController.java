package com.cognizant.springlearn.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cognizant.springlearn.security.JwtUtil;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(Authentication authentication) {
        String username = authentication.getName();
        String token = JwtUtil.generateToken(username);
        Map<String, String> response = new HashMap<>();
        response.put("token", token);
        return response;
    }
}
