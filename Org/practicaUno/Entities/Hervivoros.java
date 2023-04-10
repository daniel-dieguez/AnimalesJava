package Org.practicaUno.Entities;

import Interfaces.IAdministracion;


public class Hervivoros extends AbstracAnimales implements IAdministracion {

    public Hervivoros(String animal, String tamaño, String nombre) {
        super(animal, tamaño, nombre);
    }

    @Override
    public void area() {
        System.out.println("los animales de tomaño ".concat(this.getTamaño()));

    }

    @Override
    public void mostrarInformacion() {
        System.out.print("Datos" + this.getNombre() + "" + this.getNombre());

    }

    @Override
    public void solicitarSolvencia() {
        System.out.print("El animal es de un tamaño " + " " + this.getTamaño());
    }
}
