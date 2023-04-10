package Org.practicaUno.models;

import Org.practicaUno.Entities.AbstracAnimales;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelsPersona extends AbstractTableModel {
    private String[] encabezados = {"Animal", "Tamaño" ,"Nombre" };
    ArrayList<AbstracAnimales> animal = new ArrayList<>();

    public ArrayList<AbstracAnimales> getAnimal() {
        return animal;
    }

    public void setAnimal(ArrayList<AbstracAnimales> animal) {
        this.animal = animal;
    }

    @Override
    public int getRowCount() { //cantidad de feliz a tener
        return animal.size();
    }

    @Override
    public int getColumnCount() {//encabezado
        return encabezados.length;
    }

    @Override
    public String getColumnName(int columna){
        return encabezados[columna];
    }

    @Override
    public Object getValueAt(int filas, int columna) {
        String resultados = "";
        AbstracAnimales elemento = animal.get(filas);
        switch (columna){
            case 0:
                resultados = elemento.getAnimal();
                break;
            case 1:
                resultados = elemento.getTamaño();
                break;
            case 2:
                resultados = elemento.getNombre();
                break;
        }
        return resultados;
    }
}
