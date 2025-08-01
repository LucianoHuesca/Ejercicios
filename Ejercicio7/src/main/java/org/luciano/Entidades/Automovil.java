package org.luciano.Entidades;

public class Automovil {
    protected String marca;
    protected String subMarca;
    protected String modelo;

    //metdo personalizado
    public String mostrarDatos() {
        return "Vehiculo\n" + "Marca: " + this.marca + "\nSubMarca: " + this.subMarca;
    }

    public Automovil() {
    }

    public Automovil(String marca, String subMarca, String modelo) {
        this.marca = marca;
        this.subMarca = subMarca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSubMarca() {
        return subMarca;
    }

    public void setSubMarca(String subMarca) {
        this.subMarca = subMarca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
