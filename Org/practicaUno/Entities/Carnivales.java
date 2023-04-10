package Org.practicaUno.Entities;


import Interfaces.IAdministracion;

public class Carnivales extends AbstracAnimales implements IAdministracion {



    public Carnivales(String animal, String tamaño, String nombre) {

        super(animal, tamaño, nombre);
    }



    @Override
    public void area() {
        System.out.println("primera el animal es el ".concat(this.getAnimal())); //importane poder usar getters y setter antes
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
