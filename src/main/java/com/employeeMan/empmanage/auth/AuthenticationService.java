package com.employeeMan.empmanage.auth;

import com.employeeMan.empmanage.config.JwtService;
import com.employeeMan.empmanage.entity.user.Role;
import com.employeeMan.empmanage.entity.user.User;
import com.employeeMan.empmanage.repository.user.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {

        var user = User
                .builder()
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .email(request.getEmail())
                .password(encoder.encode(request.getPassword()))
                .role(request.getRole())
                .build();
        repository.save(user);

        var jwtToken = jwtService.generateToken(user);

        return AuthenticationResponse
                .builder()
                .token(jwtToken)
                .role(user.getRole())
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticateRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );

        var user = repository.findByEmail(request.getEmail()).orElseThrow();

        var jwtToken = jwtService.generateToken(user);

        return AuthenticationResponse
                .builder()
                .token(jwtToken)
                .role(user.getRole())
                .build();
    }
}
