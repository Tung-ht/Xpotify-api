package ict.group1.imovie.auth.controller;

import ict.group1.imovie.auth.service.AuthUserService;
import ict.group1.imovie.common.entity.auth.AuthUser;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api")
@Slf4j
public class AuthController {

    @Autowired
    AuthUserService authUserService;

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
