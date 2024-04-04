
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author braya
 */
public class EscuelaDelProgramador {
    private final Estudiante[] topEstudiantes;
    private int numEstudiantes;

    public EscuelaDelProgramador(int capacidad) {
        topEstudiantes = new Estudiante[capacidad];
        numEstudiantes = 0;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (numEstudiantes < topEstudiantes.length) {
            topEstudiantes[numEstudiantes] = estudiante;
            numEstudiantes++;
        } else {
            JOptionPane.showMessageDialog(null, "No se pueden agregar más estudiantes. La capacidad está llena.");
        }
    }

    public void listarEstudiantes() {
        String mensaje = "Listado de estudiantes:\n\n";
        for (int i = 0; i < numEstudiantes; i++) {
            Estudiante estudiante = topEstudiantes[i];
            mensaje += "Nombre: " + estudiante.getNombre() + ", Curso: " + estudiante.getCurso()
                    + ", Profesor: " + estudiante.getProfesor() + ", Calificación: " + estudiante.getCalificacion() + "\n";
        }
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public Estudiante estudianteNotaMayor() {
        if (numEstudiantes == 0) {
            return null;
        }

        Estudiante mejorEstudiante = topEstudiantes[0];
        for (int i = 1; i < numEstudiantes; i++) {
            if (topEstudiantes[i].getCalificacion() > mejorEstudiante.getCalificacion()) {
                mejorEstudiante = topEstudiantes[i];
            }
        }

   
