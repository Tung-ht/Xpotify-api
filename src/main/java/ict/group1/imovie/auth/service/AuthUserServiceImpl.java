package ict.group1.imovie.auth.service;

import ict.group1.imovie.auth.repo.AuthUserRepository;
import ict.group1.imovie.common.dto.GeneralResponse;
import ict.group1.imovie.common.entity.auth.AuthUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@Slf4j
public class AuthUserServiceImpl implements AuthUserService {
    @Autowired
    AuthUserRepository authUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AuthUser user = authUserRepository.findAuthUserByUsername(username);
        if (user == null) {
            log.debug("Username: \"" + username + "\" doesn't exist");
            throw new UsernameNotFoundException("Username: \"" + username + "\" doesn't exist");
        }
        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
        grantedAuthorities.add(new SimpleGrantedAuthority(user.getRole()));
        return new User(user.getUsername(), user.getPassword(), grantedAuthorities);
    }

    @Override
    public List<AuthUser> getListUsers() {
        return authUserRepository.findAll();
    }

}
