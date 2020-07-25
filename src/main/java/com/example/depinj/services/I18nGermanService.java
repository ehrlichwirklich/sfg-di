package com.example.depinj.services;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service("i18nService")
@Profile("DE")
public class I18nGermanService implements GreetingService{
    @Override
    public String getGreeting() {
        return "Hallo auf Deutsch!";
    }
}
