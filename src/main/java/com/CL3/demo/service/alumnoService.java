package com.CL3.demo.service;

import com.CL3.demo.interfaces.AlumnoDao;
import com.CL3.demo.model.alumnoDTO;
import com.CL3.demo.repository.alumnoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class alumnoService implements AlumnoDao {
    @Autowired
    private alumnoRepository repository;

    @Override
    public void registrarAlumno(alumnoDTO alum) {
        repository.save(alum);        
    }
   
    
}
