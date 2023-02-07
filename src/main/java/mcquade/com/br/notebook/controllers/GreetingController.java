package mcquade.com.br.notebook.controllers;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import mcquade.com.br.notebook.models.Greeting;


@RestController 
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();
    
    @GetMapping("/greeting")
    public Greeting greenting(@RequestParam(value = "name", defaultValue = "World") String name ){
      return new Greeting(counter.incrementAndGet(), String.format(template, name));  
    }

}
