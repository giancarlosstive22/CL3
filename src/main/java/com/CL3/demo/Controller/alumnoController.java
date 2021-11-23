package com.CL3.demo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/Alumno")
  
public class alumnoController {

   @GetMapping("/nuevoAlumno")
   public String nuevoAlumno(){
       return "";
   }

   @PostMapping("/registrarAlumno")
   public String registrarAlumno(){
       return "";
   }


    
}
