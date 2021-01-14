package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class skyWalkingDemo {
    @GetMapping("helloworld")
    public String EChoHelloworld(){
        return "helloworld";
    }
}
