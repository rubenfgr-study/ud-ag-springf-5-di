package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

// @Component("MyComplexService")
public class MyComplexService implements IService {

    public String operation() {
        return "Ejecutando proceso importante complejo...";
    }

}
