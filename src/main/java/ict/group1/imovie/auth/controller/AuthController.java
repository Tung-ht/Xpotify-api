package ict.group1.imovie.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@Slf4j
public class AuthController {

    @GetMapping
    public ResponseEntity<String> get() {
        log.debug("pass into api");
        return ResponseEntity.internalServerError().build();
    }
}
