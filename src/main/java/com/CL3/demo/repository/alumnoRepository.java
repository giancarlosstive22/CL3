package com.CL3.demo.repository;

import com.CL3.demo.model.alumnoDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface alumnoRepository extends JpaRepository<alumnoDTO,Integer> {
    
}
