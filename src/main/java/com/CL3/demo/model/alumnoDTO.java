package com.CL3.demo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="alumnos")
@ToString
@Getter
@Setter
public class alumnoDTO {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="codigo")
    private int codigo; 
    @Column(name="nombrealumno")
    private String nombre;
    @JoinColumn(name="carrera")
    @ManyToOne(fetch=FetchType.EAGER)
    private carreraDTO carrera; 
    @Column(name="ciclo")
    private int ciclo; 
    @Column(name="edad")
    private int edad;
  
    public alumnoDTO(){
    }




}
