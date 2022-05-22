package com.sofka.proyect;

import javax.swing.*;
import java.util.Scanner;

public class HelloWord {
    public static void main(String[] args) {
        String Nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String Celular = JOptionPane.showInputDialog("Ingrese su numero de celular");
        String Edad = JOptionPane.showInputDialog("Ingrese su edad");
    JOptionPane.showMessageDialog(null, "Bienvenido senor "+Nombre+", es un placer para nosotros contar con una persona de " +Edad+" anos. \n"+
                "Proximamente nos comunicaremos con usted al numero "+Celular+ "\n"+
                "Feliz dia");

    }
}
