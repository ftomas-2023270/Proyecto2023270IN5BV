/*
  To change this license header, choose License Headers in Project Properties.
  To change this template file, choose Tools | Templates
  and open the template in the editor.
 */
package org.fernandotomas.principal;

import java.util.Scanner;
import javax.swing.JOptionPane;

/*
    Documentacion
        Nombre COmpleto: Fernando Javier Tomas Velasquez
        Codigo Tecnico: IN5BV
        Fecha de Creacion: 22/02/2024
        Fecha de Modificaciones:
    
 */
public class Principal {
    // psvm sout fori
    public static void main(String[] args) {
    
        int num1, num2, result;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el Primer valor");
        num1 = sc.nextInt();
        System.out.println("Ingrese el Segundo Valor");
        num2 = sc.nextInt();
        result = num1 + num2;
        System.out.println("La suma es " + result + " :,)");
        
        JOptionPane.showMessageDialog(null,"Holi esposa mia");
    
        
        num1 = Integer.parseInt(JOptionPane.showInputDialog(  "Ingrese el Primer valor"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo valor"));
        
        result = num1 - num2;
        
        JOptionPane.showMessageDialog(null ,"El resultado es "+ String.valueOf(result));
    }
}
