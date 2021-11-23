package com.CL3.demo.model;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="alumnos")

public class alumnoDTO {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    
    private int codigo;
    private String nombreAlumno;
    @JoinColumn(name="codCarrera")
    @OneToMany(fetch=FetchType.EAGER)
    private carreraDTO Carrera;
    private int ciclo;
    private int edad;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombreAlumno() {
        return nombreAlumno;
    }
    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }
    public carreraDTO getCarrera() {
        return Carrera;
    }
    public void setCarrera(carreraDTO carrera) {
        Carrera = carrera;
    }
    public int getCiclo() {
        return ciclo;
    }
    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    




}
