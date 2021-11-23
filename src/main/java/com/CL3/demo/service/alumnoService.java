package com.CL3.demo.service;

import java.util.List;

import com.CL3.demo.interfaces.AlumnoDao;
import com.CL3.demo.model.alumnoDTO;
import com.CL3.demo.model.carreraDTO;
import com.CL3.demo.repository.alumnoRepository;
import com.CL3.demo.repository.carreraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class alumnoService implements AlumnoDao {
    @Autowired
    private alumnoRepository repository;
    @Autowired
    private carreraRepository repos;

    @Override
    public void registrarAlumno(alumnoDTO alum) {
        repository.save(alum);        
    }

    @Override
    public List<carreraDTO> ListadoCarrera() {
        return  repos.findAll();
    } 
    @Override
    public List<alumnoDTO>  listaAlumno(){
        return  repository.findAll();
    } 
    
}
