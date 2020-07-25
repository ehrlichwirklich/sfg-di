package com.example.depinj.Controller;

import com.example.depinj.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {
    private final GreetingService gService;

    public I18nController(@Qualifier("i18nService") GreetingService gService){
        this.gService = gService;
    }

    public String sayHello(){
        return gService.getGreeting();
    }
}
