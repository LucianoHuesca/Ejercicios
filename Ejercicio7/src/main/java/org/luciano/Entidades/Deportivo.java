package org.luciano.Entidades;

public class Deportivo extends Automovil{
    private int noCilindros;

    //Metodo personalizado
    public String mostrarDatos() {
        return "Vehiculo\n" + "Marca: " + this.marca + "\nSubMarca: " + this.subMarca
                + "\nCapcidad de Carga: " + this.noCilindros;
    }

    public Deportivo() {
    }

    public Deportivo(String marca, String subMarca, String modelo, int noCilindros) {
        super(marca, subMarca, modelo);
        this.noCilindros = noCilindros;
    }

    public int getNoCilindros() {
        return noCilindros;
    }

    public void setNoCilindros(int noCilindros) {
        this.noCilindros = noCilindros;
    }
}
