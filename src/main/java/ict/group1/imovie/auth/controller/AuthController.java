package ict.group1.imovie.auth.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
@Slf4j
public class AuthController {
    private final Logger logger = LoggerFactory.getLogger(AuthController.class);

    @GetMapping
    public ResponseEntity<String> get() {
        logger.debug("pass into api");
        return ResponseEntity.internalServerError().build();
    }
}
