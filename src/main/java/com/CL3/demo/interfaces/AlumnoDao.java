package com.CL3.demo.interfaces;

import java.util.List;

import com.CL3.demo.model.alumnoDTO;
import com.CL3.demo.model.carreraDTO;

public interface AlumnoDao {

    public void  registrarAlumno(alumnoDTO alum);
    public List<alumnoDTO>  listaAlumno();
    public List<carreraDTO>ListadoCarrera();
}
