package simpleRest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello/{name}")
    public Greeting hello(@PathVariable String name) {
        return new Greeting(name, "Hello " + name + "!");
    }

}
