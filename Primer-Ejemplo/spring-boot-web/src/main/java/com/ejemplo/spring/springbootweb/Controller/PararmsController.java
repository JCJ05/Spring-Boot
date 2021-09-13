package com.ejemplo.spring.springbootweb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/params")
public class PararmsController {
    
    @RequestMapping(value = "/form" , method = RequestMethod.GET)
    public String getFormulario(Model model) {

           model.addAttribute("titulo","Formulario de costos");

           return "formulario";

    }

    @RequestMapping(value = "/variables" , method = RequestMethod.GET)
    public String getParametros(@RequestParam(name = "texto")String texto , @RequestParam(name = "saludo")String saludo , Model model) {
        
        String mensaje;

          mensaje = "El texto es: " + texto +  " " + "Y el saludo es: " + saludo;
        
          model.addAttribute("mensaje", mensaje);

        return "visualizar";
    }



}
