package org.luciano.Entidades;

public class Hijo extends Padre{

    //El hijo hereda atributos del padre, y se le suman los siguientes
    private String colorOjos;
    private String complexion;

    public Hijo(String nombre, String apellido, int edad, double estatura, String nacionalidad, String colorOjos, String complexion) {
        super(nombre, apellido, edad, estatura, nacionalidad);
        this.colorOjos = colorOjos;
        this.complexion = complexion;
    }

    public Hijo() {
    }

    public String getColorOjos() {
        return colorOjos;
    }

    public void setColorOjos(String colorOjos) {
        this.colorOjos = colorOjos;
    }

    public String getComplexion() {
        return complexion;
    }

    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    @Override
    public String toString() {
        return "Hijo{" +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", estatura=" + estatura +
                ", nacionalidad='" + nacionalidad + '\'' +
                ", colorOjos='" + colorOjos + '\'' +
                ", complexion='" + complexion + '\'' +
                '}';
    }
}
