/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Colegio;
import Modelo.Estudiante;
import Modelo.Profesor;
import Modelo.Reporte;

// Sin constructor propio: los objetos se crean al declarar los atributos.
public class ControladorColegio {
    private Colegio colegio = new Colegio();
    private Reporte reporte = new Reporte();

    public Colegio getColegio() { return colegio; }
    public void setColegio(Colegio colegio) { this.colegio = colegio; }

    public Reporte getReporte() { return reporte; }
    public void setReporte(Reporte reporte) { this.reporte = reporte; }

    // Devuelve el mensaje que la vista mostrará al usuario
    public String agregarEstudiante(String nombre, String direccion, String telefono,
                                    String fecha, String codigo, String grado) {
        try {
            Estudiante e = new Estudiante();
            e.setNombre(nombre);
            e.setDireccion(direccion);
            e.setTelefono(telefono);
            e.setFechaNacimiento(fecha);
            e.getEdad(); // valida el formato de la fecha (dd/mm/aaaa)
            e.setCodigo(codigo);
            e.setGrado(grado);
            colegio.agregarEstudiante(e);
            return "Estudiante agregado";
        } catch (Exception ex) {
            return "Datos invalidos. Use la fecha como dd/mm/aaaa";
        }
    }

    public String agregarProfesor(String nombre, String direccion, String telefono,
                                  String fecha, String cedula, String area,
                                  String salarioHora, String horasMes) {
        try {
            Profesor p = new Profesor(nombre, direccion, telefono, fecha, cedula, area,
                    Double.parseDouble(salarioHora), Integer.parseInt(horasMes));
            if (colegio.agregarProfesor(p)) {
                return "Profesor agregado";
            }
            return "El profesor debe ser mayor de edad";
        } catch (Exception ex) {
            return "Datos invalidos. Revise la fecha (dd/mm/aaaa), el salario y las horas";
        }
    }

    public String reporteEstudiantes() {
        return reporte.reporteEstudiantes(colegio);
    }

    public String reporteProfesores() {
        return reporte.reporteProfesores(colegio);
    }
}
