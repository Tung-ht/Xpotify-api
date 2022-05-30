package ict.group1.imovie.auth.service;

import ict.group1.imovie.common.entity.auth.AuthUser;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.List;

public interface AuthUserService extends UserDetailsService {
    List<AuthUser> getListUsers();
}
