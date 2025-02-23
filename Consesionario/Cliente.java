package main.Consesionario;

// Clase Cliente que extiende de Persona
public class Cliente extends Persona {
    private String email;
    private String tipoCliente;

    // Constructor
    public Cliente(String cedula, String nombre_completo, String direccion, String telefono, String email, String tipoCliente) {
        super(cedula, nombre_completo, direccion, telefono);
        this.email = email;
        this.tipoCliente = tipoCliente;
    }

    // Getters y Setters
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    // Método sobrescrito de Persona
    @Override
    public String toString() {
        return super.toString() + 
               ", Cliente{" +
               "email='" + email + '\'' +
               ", tipoCliente='" + tipoCliente + '\'' +
               '}';
    }
}