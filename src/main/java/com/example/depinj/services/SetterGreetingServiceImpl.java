package com.example.depinj.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService{
    public String getGreeting(){
        return "Hello from Setter!";
    };
}
