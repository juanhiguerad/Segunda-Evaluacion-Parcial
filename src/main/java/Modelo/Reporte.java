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

    // POLIMORFISMO: recibe una Persona y ejecuta el descripcion() de la subclase real
    private String linea(Persona p) {
        return p.descripcion() + "\n";
    }

    // REPORTE 1: lista de estudiantes (dependencia: usa Colegio como parámetro)
    public String reporteEstudiantes(Colegio colegio) {
        String texto = tituloEstudiantes + "\n";
        for (int i = 0; i < colegio.getEstudiantes().size(); i++) {
            texto = texto + linea(colegio.getEstudiantes().get(i));
        }
        return texto;
    }

// REPORTE 2: profesores ordenados por pago total (mayor a menor) + total prestaciones
    public String reporteProfesores(Colegio colegio) {
        // copia de la lista para no alterar el orden original
        ArrayList<Profesor> lista = new ArrayList<Profesor>(colegio.getProfesores());

        // ordenamiento burbuja de mayor a menor
        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = 0; j < lista.size() - 1 - i; j++) {
                if (lista.get(j).calcularPago() < lista.get(j + 1).calcularPago()) {
                    Profesor temporal = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temporal);
                }
            }
        }

