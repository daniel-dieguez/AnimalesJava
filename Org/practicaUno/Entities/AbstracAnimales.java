package Org.practicaUno.Entities;

public abstract class AbstracAnimales {
    private String animal;
    private String tamaño;
    private String nombre;


    public AbstracAnimales(String animal, String tamaño, String nombre) {
        this.animal = animal;
        this.tamaño = tamaño;
        this.nombre = nombre;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void area();

}
