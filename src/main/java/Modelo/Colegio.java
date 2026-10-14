/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

public class Colegio {
    private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    private ArrayList<Profesor> profesores = new ArrayList<Profesor>();

    public ArrayList<Estudiante> getEstudiantes() { return estudiantes; }
    public void setEstudiantes(ArrayList<Estudiante> estudiantes) { this.estudiantes = estudiantes; }

    public ArrayList<Profesor> getProfesores() { return profesores; }
    public void setProfesores(ArrayList<Profesor> profesores) { this.profesores = profesores; }

    public void agregarEstudiante(Estudiante e) {
        estudiantes.add(e);
    }

    // Devuelve false si el profesor es menor de edad (no se agrega)
    public boolean agregarProfesor(Profesor p) {
        if (p.esMayorDeEdad()) {
            profesores.add(p);
            return true;
        }
        return false;
    }
}