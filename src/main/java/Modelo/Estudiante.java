/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

// Subclase 1. No tiene constructor propio.
public class Estudiante extends Persona {
    private String codigo;
    private String grado;

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getGrado() { return grado; }
    public void setGrado(String grado) { this.grado = grado; }

    // Sobreescritura
    @Override
    public String descripcion() {
        return "Codigo: " + codigo + " | Nombre: " + getNombre()
                + " | Grado: " + grado + " | Edad: " + getEdad();
    }
}
