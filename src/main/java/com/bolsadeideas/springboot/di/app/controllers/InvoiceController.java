package com.bolsadeideas.springboot.di.app.controllers;

import com.bolsadeideas.springboot.di.app.models.domain.Invoice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("invoice")
public class InvoiceController {

    @Autowired
    private Invoice invoice;

    @GetMapping("/show")
    public String show(Model model) {
        System.out.println(invoice.getClient());
        model.addAttribute("invoice", invoice);
        model.addAttribute("title", "Ejemplo Factura con Inyección de Dependencia");
        return "invoice/show";
    }

}
