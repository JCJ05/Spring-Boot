package com.ejemplo.spring.springbootweb.Controller;


import java.util.ArrayList;
import java.util.List;

import com.ejemplo.spring.springbootweb.Model.Usuario;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
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
        usuario.setEmail("julio@gmail.com");

        model.addAttribute("usuario", usuario);

        return "perfil";
          
    }

    @RequestMapping(value = "/listar")
    public String listarUsuarios(Model model) {

           model.addAttribute("titulo", "Lista de usuarios");

           return "listar";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> getUsarios(Model model) {


        List<Usuario> usuarios = new ArrayList<>();

         usuarios.add( new Usuario("Julio" , "Aguero" , "revels@gmail.com"));
         usuarios.add( new Usuario("Christian" , "Corrales" , "cricri@gmail.com"));
         usuarios.add( new Usuario("Jefry" , "Chavez" , "jeffer@gmail.com"));

         return usuarios;

    }

    
   

}
