package com.Health.StlHealth_Dev.security;

import com.Health.StlHealth_Dev.Model.User;
import com.Health.StlHealth_Dev.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserLoginDetailsService implements UserDetailsService {
    @Autowired
    UserRepository USER_REPPO;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User USER=USER_REPPO.findByUniqueId(username);
        if(USER!=null){
            return new UserLoginDetails(USER);
        }
        return null;
    }
}