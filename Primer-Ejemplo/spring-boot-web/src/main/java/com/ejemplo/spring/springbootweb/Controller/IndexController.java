package com.ejemplo.spring.springbootweb.Controller;


import com.ejemplo.spring.springbootweb.Model.Usuario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/")
public class IndexController {
    
     
    @RequestMapping(value = "/index" , method = RequestMethod.GET)
    public String index(Model model) {

        model.addAttribute("titulo", "Hola denuevo Spring ");
        return "index";

    }


    @RequestMapping(value = "/perfil")
    public String perfil(Model model) {
            
        Usuario usuario = new Usuario();

        usuario.setNombre("Julio");
        usuario.setApellido("Aguero");

        model.addAttribute("usuario", usuario);

        return "perfil";
          
    }

    
   

}
