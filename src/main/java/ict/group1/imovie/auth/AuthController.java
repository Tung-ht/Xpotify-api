package ict.group1.imovie.auth;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/imovie-api/v1/")
public class AuthController {

    @GetMapping
    public String get(){
        return "hello";
    }
}
