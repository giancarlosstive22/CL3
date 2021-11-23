package com.CL3.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name="carrera")
public class carreraDTO {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int codigo;
    private String nombreCarrera;
    private String coordinador;
    private double costo;
    private int semestres;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombreCarrera() {
        return nombreCarrera;
    }
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }
    public String getCoordinador() {
        return coordinador;
    }
    public void setCoordinador(String coordinador) {
        this.coordinador = coordinador;
    }
    public double getCosto() {
        return costo;
    }
    public void setCosto(double costo) {
        this.costo = costo;
    }
    public int getSemestres() {
        return semestres;
    }
    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }


    
    
}
