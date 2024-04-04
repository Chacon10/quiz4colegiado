/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quizcolegiado4;

import javax.swing.JOptionPane;

/**
 *
 * @author braya
 */
public class Quizcolegiado4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       


    
        EscuelaDelProgramador escuela = new EscuelaDelProgramador(10);

        // Agrega estudiantes
        escuela.agregarEstudiante(new Estudiante("Juan", "Programación", "Ana", 90.5));
        escuela.agregarEstudiante(new Estudiante("María", "Bases de Datos", "Pedro", 85.2));
        // Agrega más estudiantes según sea necesario

        // Llama a los métodos solicitados
        escuela.listarEstudiantes();
        Estudiante mejorEstudiante = escuela.estudianteNotaMayor();
        JOptionPane.showMessageDialog(null, "Estudiante con la nota mayor: " + mejorEstudiante.getNombre());

        Estudiante peorEstudiante = escuela.estudianteNotaMenor();
        JOptionPane.showMessageDialog(null, "Estudiante con la nota menor: " + peorEstudiante.getNombre());

        JOptionPane.showMessageDialog(null, "Promedio de calificaciones: " + escuela.promedioCalificaciones());

        // Mostrar calificaciones por encima del promedio
        JOptionPane.showMessageDialog(null, "Calificaciones por encima del promedio:\n" + escuela.estudiantesEncimaPromedio());

        // Mostrar calificaciones por debajo del promedio
        JOptionPane.showMessageDialog(null, "Calificaciones por debajo del promedio:\n" + escuela.estudiantesDebajoPromedio());
    }
}

    
    

