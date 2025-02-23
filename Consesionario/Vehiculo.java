package main.Consesionario;



public class Vehiculo {
    private String marca;
    private String referencia;
    private int modelo;
    private double precio;

    public Vehiculo(String marca, String referencia, int modelo, double precio) {
        this.marca = marca;
        this.referencia = referencia;
        this.modelo = modelo;
        this.precio = precio;
    }

    // Getters y setters (opcional)
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", referencia='" + referencia + '\'' +
                ", modelo=" + modelo +
                ", precio=" + precio +
                '}';
    }
}
