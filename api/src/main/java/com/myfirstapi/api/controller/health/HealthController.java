package com.myfirstapi.api.controller.health;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HealthController {
    @RequestMapping("/health")
    public String checkAPI(){
        return "<h1>The API is working ok!</h1>";
    }
    public ResponseEntity<String> handleException(Exception ex){
        return new ResponseEntity<>("Error en la api:" + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
