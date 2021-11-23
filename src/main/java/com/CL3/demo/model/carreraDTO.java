package com.CL3.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name="carreras")
@ToString
@Getter
@Setter
public class carreraDTO {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="codigo")
    private int codigo;
    @Column(name="nombrecarrera")
    private String carrera;
    @Column(name="coordinador" )
    private String coordinador; 
    @Column(name="costo")
    private double costo;
    @Column(name="semestres")
    private int sementre;
    
    public carreraDTO(int codigo){
        this.codigo=codigo;
    }
    public carreraDTO(){
    }
}
