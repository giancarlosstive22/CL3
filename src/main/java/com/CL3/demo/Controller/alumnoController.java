package com.CL3.demo.Controller;

import com.CL3.demo.service.alumnoService;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.CL3.demo.model.alumnoDTO;
import com.CL3.demo.model.carreraDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/Alumno")
public class alumnoController {

@Autowired
private alumnoService servi;

   @GetMapping("/nuevoAlumno")
   public String nuevoAlumno(Model mod){
       mod.addAttribute("listaCarrera", servi.ListadoCarrera());
       mod.addAttribute("codigo",servi.listaAlumno().size()+1);
       return "registroHuaccachi";
   }

   @PostMapping("/registrarAlumno")
   public String registrarAlumno(
       @RequestParam("codigo") String codigo,
       @RequestParam("nombre") String nombre,
       @RequestParam("carrera") String carrera,
       @RequestParam("ciclo") String ciclo,
       @RequestParam("edad") String edad,Model mod,HttpSession session){
        String msj=null;
        try{
            alumnoDTO a = new alumnoDTO();
            a.setCodigo(Integer.parseInt(codigo));
            a.setNombre(nombre);
            a.setCarrera(new carreraDTO(Integer.parseInt(carrera)));
            a.setCiclo(Integer.parseInt(ciclo));
            a.setEdad(Integer.parseInt(edad));
            servi.registrarAlumno(a);
            msj="SE REGISTRO CORRECTAMENTE"; 
            mod.addAttribute("ok","true");
        }catch(Exception e){
            msj="ERROR AL REGISTAR :"+e.getMessage();
            mod.addAttribute("ok","false");
        }
        mod.addAttribute("mensaje",msj);
         mod.addAttribute("codigo",servi.listaAlumno().size()+1);
         mod.addAttribute("listaCarrera", servi.ListadoCarrera());
       return "registroHuaccachi";//"redirect:/Alumno/nuevoAlumno";
   }


    
}
