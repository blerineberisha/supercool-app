package blerine.berisha.supercoolapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloWorld {

    @GetMapping("")
    public String printHelloWorld(){
        return "Hello world!";
    }
}
