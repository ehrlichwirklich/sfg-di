package com.example.depinj.Controller;

import com.example.depinj.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Qualifier("propertyGreetingServiceImpl")
    @Autowired
    public GreetingService gService;

    public String  sayGreeting(){
        return gService.getGreeting();
    }
}
