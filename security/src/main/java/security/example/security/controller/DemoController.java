package security.example.security.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import security.example.security.service.AuthenticationService;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/admin")
    public ResponseEntity<?> admin(){
        return ResponseEntity.ok("This is Admin Route");
    }
    @GetMapping("/user")
    public ResponseEntity<?> users(){
        return ResponseEntity.ok("This is User Route");
    }

}
