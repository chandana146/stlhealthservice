package com.Health.StlHealth_Dev.Controllers;
import com.Health.StlHealth_Dev.Model.User;
import com.Health.StlHealth_Dev.Model.UserDetails;
import com.Health.StlHealth_Dev.jwt.JwtUtills;
import com.Health.StlHealth_Dev.repositories.UserRepository;
import com.Health.StlHealth_Dev.repositories.UserDetailsRepository;
import com.Health.StlHealth_Dev.security.UserLoginDetails;
import com.Health.StlHealth_Dev.security.UserLoginDetailsService;
import com.Health.StlHealth_Dev.security.UserSecurity;
import java.util.HashMap;
import java.util.Map;
import java.util.*;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDetailsRepository userDetailsRepository;

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    UserLoginDetailsService userLoginDetailsService;


    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    JwtUtills jwtUtills;


    @Value("${jwt.privateKey}")
    private String privateKey;

    @Value("${jwt.publicKey}")
    private String publicKey;

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> loginRequest) {
        String uniqueId = loginRequest.get("unique_id");
        String password = loginRequest.get("password");

        try {
            authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(uniqueId, password));
        } catch (Exception e) {
            throw new BadCredentialsException("Invalid username or password");
        }

   UserLoginDetails userLoginDetails;
        try {
    	userLoginDetails = (UserLoginDetails) userLoginDetailsService.loadUserByUsername(uniqueId);
  	
            
        } catch (Exception e) {
            throw new BadCredentialsException("Invalid username or password");
        }
        

        User user = userRepository.findByUniqueId(uniqueId);

        String role;
        switch (user.getROLE_ID()) {
            case 1:
                role = "Admin";
                break;
            case 2:
                role = "VLE";
                break;
            case 3:
                role = "Doctor";
                break;
            case 4:
                role = "User";
                break;
            default:
                role = "Not Defined";
        }

        UserLoginDetails userLoginDetails1=(UserLoginDetails) userLoginDetailsService.loadUserByUsername(loginRequest.get(uniqueId));
        String TOKEN=jwtUtills.generateJwtToken(userLoginDetails1);
        return TOKEN;
    }


    @PostMapping("/register")
    public Map<String, Object> register(@RequestBody Map<String, Object> registerRequest) throws Exception {
        String email = (String) registerRequest.get("email");
        String uniqueId = (String) registerRequest.get("unique_id");
        Integer roleId = (Integer) registerRequest.get("role_id");
        String password = (String) registerRequest.get("password");

        if (userRepository.existsByUniqueId(uniqueId)) {
            throw new Exception("Unique ID already exists");
        }

        User user = new User();
        user.setEMAIL(email);
        user.setUNIQUE_ID(uniqueId);
        user.setROLE_ID(roleId);
        user.setPASSWORD(passwordEncoder.encode(password));
        userRepository.save(user);

        Map<String, Object> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "User created successfully");
        response.put("user", user);
     response.put("authorization", generateToken(uniqueId, "", user.getUSER_ID(), ""));

        return response;
    }

    @PostMapping("/logout")
    public Map<String, String> logout() {
        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Successfully logged out");
        return response;
    }

    private Map<String, Object> generateToken(String uniqueId, String role, Long userId, String string) {
        Map<String, Object> claims = new HashMap<>();
        claims.put("unique_id", uniqueId);
        claims.put("role", role);
        claims.put("user_id", userId);
        claims.put("first_name", string);
        // Generate and return the token using your preferred token generation mechanism
        // For example, you can use JWT or any other token library
        String token = generateToken(claims);
        return Map.of("token", token, "type", "bearer");
    }

    private String generateToken(Map<String, Object> claims) {
        // Generate the token using your preferred token generation mechanism
        // For example, you can use JWT or any other token library
        // Return the generated token
        // You can use Spring Security's JwtHelper and Jwt classes to generate and validate JWT tokens
        return "generated_token";
    }
}

