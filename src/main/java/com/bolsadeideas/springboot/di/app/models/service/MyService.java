package com.bolsadeideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

// @Component("MySimpleService")
// @Primary
public class MyService implements IService {

    public String operation() {
        return "Ejecutando proceso importante simple...";
    }

}
