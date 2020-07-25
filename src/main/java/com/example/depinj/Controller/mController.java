package com.example.depinj.Controller;

import com.example.depinj.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class mController {
    private final GreetingService mService;

    public mController(GreetingService greetingService) {
        mService = greetingService;
    }

    public String sayHello(){
        return mService.getGreeting();
    }
}
