package Org.practicaUno.iu;


import Org.practicaUno.Entities.AbstracAnimales;
import Org.practicaUno.Entities.Carnivales;
import Org.practicaUno.models.ModelsPersona;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentaPrincipal extends JFrame implements ActionListener {

    private ArrayList<AbstracAnimales>  animales = new ArrayList<AbstracAnimales>();

    private JButton btnListo;
    private JTable tbTable;
    private JScrollPane jsPrincipal;
    private ModelsPersona modelo;

    // Todo lo que con lleva la creacion de venta

    public VentaPrincipal(){
        animales.add(new Carnivales("Tigre","Grande","Pedro"));
        animales.add(new Carnivales("Puma","mediano","Daniel"));
        this.setTitle("Listado de carnivoros");
        this.setSize(800,500);
        this.setLayout(null);
        this.getContentPane().add(getBtnListo());
        this.getContentPane().add(getJsPrincipal());
        modelo.setAnimal(animales);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // cuando sepa que cuando el programa termine, se destruya la instanca
        this.setVisible(true);
    }


    public JScrollPane getJsPrincipal() {
        if(jsPrincipal == null){
            jsPrincipal = new JScrollPane();
            jsPrincipal.setBounds(5,5,790,240);
            jsPrincipal.setViewportView((getTbTable()));
        }
        return jsPrincipal;
    }

    public JTable getTbTable() {
        if(tbTable == null){
            tbTable = new JTable();
            tbTable.setModel(getModelo());
        }
        return tbTable;
    }



    public ModelsPersona getModelo() {
        if(modelo == null){
            modelo = new ModelsPersona();
        }
        return modelo;
    }

    public JButton getBtnListo() {
        if (btnListo == null){
            btnListo = new JButton("Listo");
            btnListo.setBounds(10,360,200,100);
            btnListo.addActionListener(this); //el evento que escuchara es el evento "this"

        }
        return btnListo;
    }

    public void setBtnListo(JButton btnListo) {
        this.btnListo = btnListo;
    }


    @Override
    public void actionPerformed(ActionEvent e) { //cuando se preciono el click en el evento btnListo, si proviene de ahi agragar
        if(e.getSource()== btnListo){
            JOptionPane.showMessageDialog(null, "Iniciamos interfaz");
        }

    }
}
