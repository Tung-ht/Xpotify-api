package ict.group1.imovie.auth.repo;

import ict.group1.imovie.common.entity.auth.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthUserRepository extends JpaRepository<AuthUser, Long> {
    AuthUser findAuthUserByUsername(String username);
}
