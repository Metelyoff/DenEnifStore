package com.enifsoft.enifstore.auth;

import com.enifsoft.enifstore.core.entity.AuthenticationEntity;
import com.enifsoft.enifstore.core.repository.AuthenticationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;

@Component
public class EnifAuthenticationProvider implements AuthenticationProvider {

    @Autowired
    private AuthenticationRepository authenticationRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String userName = authentication.getName();
        String password = authentication.getCredentials().toString();
        AuthenticationEntity user = authenticationRepository.findByLogin(userName);
        return new UsernamePasswordAuthenticationToken(userName,password);
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
