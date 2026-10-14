/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

// Subclase 2. Es la ÚNICA clase con constructor.
public class Profesor extends Persona {
    private String cedula;
    private String area;
    private double salarioHora;
    private int horasMes;

    public Profesor(String nombre, String direccion, String telefono, String fechaNacimiento,
                    String cedula, String area, double salarioHora, int horasMes) {
        setNombre(nombre);
        setDireccion(direccion);
        setTelefono(telefono);
        setFechaNacimiento(fechaNacimiento);
        this.cedula = cedula;
        this.area = area;
        this.salarioHora = salarioHora;
        this.horasMes = horasMes;
    }

    public String getCedula() { return cedula; }
    public void setCedula(String cedula) { this.cedula = cedula; }

    public String getArea() { return area; }
    public void setArea(String area) { this.area = area; }

    public double getSalarioHora() { return salarioHora; }
    public void setSalarioHora(double salarioHora) { this.salarioHora = salarioHora; }

    public int getHorasMes() { return horasMes; }
    public void setHorasMes(int horasMes) { this.horasMes = horasMes; }

    // SOBRECARGA
    public double calcularPago() {
        return calcularPago(horasMes);
    }

    public double calcularPago(int horas) {
        double pagoBase = salarioHora * horas;
        double preparacion = pagoBase * 0.30;   // 30% por preparación de clase
        return pagoBase + preparacion;
    }

    public double calcularPrestaciones() {
        return calcularPago() * 0.19;           // 19% del pago total
    }

    // SOBREESCRITURA
    @Override
    public String descripcion() {
        return "Cedula: " + cedula + " | Nombre: " + getNombre() + " | Area: " + area
                + " | Pago: " + calcularPago() + " | Prestaciones: " + calcularPrestaciones();
    }
}
