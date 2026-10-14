/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.Calendar;

public class Persona {
    private String nombre;
    private String direccion;
    private String telefono;
    private String fechaNacimiento; // formato dd/mm/aaaa

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public String getTelefono() { return telefono; }
    public void setTelefono(String telefono) { this.telefono = telefono; }

    public String getFechaNacimiento() { return fechaNacimiento; }
    public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }

    // SOBRECARGA: mismo nombre, distintos parámetros
    public int getEdad() {
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        return getEdad(anioActual);
    }

    public int getEdad(int anioActual) {
        String[] partes = fechaNacimiento.split("/");
        int anioNacimiento = Integer.parseInt(partes[2]);
        return anioActual - anioNacimiento;
    }

    public boolean esMayorDeEdad() {
        return getEdad() >= 18;
    }

    // SOBREESCRITURA: las subclases redefinen este método
    public String descripcion() {
        return "Persona: " + nombre;
    }
}