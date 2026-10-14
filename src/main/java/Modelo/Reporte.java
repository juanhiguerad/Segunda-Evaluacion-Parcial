/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

public class Reporte {
    private String tituloEstudiantes = "=== LISTA DE ESTUDIANTES ===";
    private String tituloProfesores = "=== PROFESORES POR SALARIO (mayor a menor) ===";

    public String getTituloEstudiantes() { return tituloEstudiantes; }
    public void setTituloEstudiantes(String titulo) { this.tituloEstudiantes = titulo; }

    public String getTituloProfesores() { return tituloProfesores; }
    public void setTituloProfesores(String titulo) { this.tituloProfesores = titulo; }

