package ict.group1.imovie.auth.controller;

import ict.group1.imovie.auth.service.AuthUserService;
import ict.group1.imovie.common.constant.HttpStatusConstant;
import ict.group1.imovie.common.dto.GeneralResponse;
import ict.group1.imovie.common.entity.auth.AuthUser;
import ict.group1.imovie.common.exception.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@Slf4j
//@RequestMapping("/api")
public class AuthController {

    @Autowired
    AuthUserService authUserService;

    @PostMapping("/login")
    public GeneralResponse<?> login() {
        return GeneralResponse.ok(null);
    }

    @GetMapping
    public ResponseEntity<String> all() {
        log.debug("pass into api");
        return ResponseEntity.ok("all");
    }

    @GetMapping("/user")
    public ResponseEntity<String> user() {
        log.debug("pass into api");
        return ResponseEntity.ok("user");
    }

    @GetMapping("/admin")
    public ResponseEntity<List<AuthUser>> getListUsers() {
        return ResponseEntity.ok(authUserService.getListUsers());
    }
}
