package com.example.progettospringfreemarker.controller;

import com.example.progettospringfreemarker.model.TV;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@RequestMapping("/first")
@Controller
public class FirstController {


    @RequestMapping("/welcome")
    public String benvenuto(ModelMap model) {
        model.addAttribute("messaggio","Salve, benvenuto nel sito");
        return "welcomePage";
    }

    @GetMapping("/catalogoProdotti")
    public String catProdotti(ModelMap model){
        TV tv= new TV("Sony","Bravia",62);
        model.addAttribute("televisione",tv);
        model.addAttribute("numProdotti",1);
        model.addAttribute("messaggiDaLeggere",20);
        model.addAttribute("messaggiLetti",10);

        return "firstPage";
    }

    @GetMapping("/prova")
    public String sample(ModelMap model){
        ArrayList <String> listaAuto = new ArrayList<>();
        listaAuto.add("fiat");
        listaAuto.add("peugeout");
        listaAuto.add("mercedes");
        listaAuto.add("opel");
        model.addAttribute("myList",listaAuto);
        model.addAttribute("x",5);
        model.addAttribute("clienteRegistrato",true);
        model.addAttribute("datiCliente","Giovanni Granatello");
        return "secondPage";
    }

}
