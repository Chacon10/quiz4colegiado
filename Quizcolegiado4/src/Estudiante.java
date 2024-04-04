/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author braya
 */
public class Estudiante {
    private final String nombre;
    private String curso;
    private String profesor;
    private final double calificacion;

    public Estudiante(String nombre, String curso, String profesor, double calificacion) {
        this.nombre = nombre;
        this.curso = curso;
        this.profesor = profesor;
        this.calificacion = calificacion;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getProfesor() {
        return profesor;
    }

    public void setProfesor(String profesor) {
        this.profesor = profesor;
    }

    // Getters y setters para las propiedades

    public String getNombre() {
        return nombre;
    }

    public double getCalificacion() {
        return calificacion;
    }

    
}
