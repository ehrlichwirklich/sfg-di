package com.example.depinj.Controller;

import com.example.depinj.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService gService;


    public ConstructorInjectedController(@Qualifier("constructorGreetingServiceImpl")GreetingService gService) {
        this.gService = gService;
    }

    public String  sayGreeting(){
        return gService.getGreeting();
    }
}
