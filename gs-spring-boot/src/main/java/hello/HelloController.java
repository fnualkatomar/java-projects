package hello;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
    	System.out.println("feature-1234566669999");
        return "Greetings from Spring Boot!";
    }
    
}
