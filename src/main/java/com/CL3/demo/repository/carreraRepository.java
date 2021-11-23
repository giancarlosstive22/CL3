package com.CL3.demo.repository;

import com.CL3.demo.model.carreraDTO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface carreraRepository extends JpaRepository<carreraDTO,Integer>{
    
}
