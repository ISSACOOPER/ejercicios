package main.Consesionario;

 
public class Vendedor extends Persona {
    private double salario;
    private String zonaDeVentas;

    // Constructor
    public Vendedor(String cedula, String nombre_completo, String direccion, String telefono, double salario, String zonaDeVentas) {
        super(cedula, nombre_completo, direccion, telefono); // Llamada al constructor de Persona
        this.salario = salario;
        this.zonaDeVentas = zonaDeVentas;
    }

    // Getters y Setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getZonaDeVentas() {
        return zonaDeVentas;
    }

    public void setZonaDeVentas(String zonaDeVentas) {
        this.zonaDeVentas = zonaDeVentas;
    }

    // Método sobrescrito de Persona
    @Override
    public String toString() {
        return super.toString() + 
               ", Vendedor{" +
               "salario=" + salario +
               ", zonaDeVentas='" + zonaDeVentas + '\'' +
               '}';
    }
}




