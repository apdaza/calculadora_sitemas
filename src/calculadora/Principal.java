/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import calculadora.logica.Calculadora;
import calculadora.logica.CalculadoraBinaria;
import calculadora.logica.CalculadoraDecimal;
import calculadora.logica.CalculadoraHexadecimal;
import calculadora.logica.CalculadoraOctal;
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
        Calculadora c = new CalculadoraDecimal();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un entero");
        c.setValor1(sc.next());
        System.out.println("Ingrese otro entero");
        c.setValor2(sc.next());
        c.sumar();
        System.out.println(c.mostrarValor1() + " + " + c.mostrarValor2() + " = " + c.mostrarResultado());
    }
    
}
