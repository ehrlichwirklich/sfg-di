package com.example.depinj.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{
    public String getGreeting(){
        return "Hello from Constructor!";
    };
}
