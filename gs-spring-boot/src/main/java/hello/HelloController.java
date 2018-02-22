package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
    	System.out.println("feature-123456666");
        return "Greetings from Spring Boot!";
    }
    
}
