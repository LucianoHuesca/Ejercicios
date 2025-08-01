package org.luciano.Entidades;

public class PickUp extends Automovil{
    private int capacidadCarga;

    // metdo personalizado
    public String mostrarDatos() {
        return "Vehiculo\n" + "Marca: " + this.marca + "\nSubMarca: " + this.subMarca
                + "\nCapcidad de Carga: " + this.capacidadCarga;
    }

    public PickUp() {

    }

    public PickUp(String marca, String subMarca, String modelo, int capacidadCarga) {
        super(marca, subMarca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public int getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(int capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
}
