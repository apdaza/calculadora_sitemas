/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import calculadora.logica.Calculadora;
import java.util.Scanner;

/**
 *
 * @author Estudiantes
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un entero");
        c.setValor1(sc.nextInt());
        System.out.println("Ingrese otro entero");
        c.setValor2(sc.nextInt());
        c.sumar();
        System.out.println(c.getValor1() + " + " + c.getValor2() + " = " + c.getResultado());
    }
    
}
