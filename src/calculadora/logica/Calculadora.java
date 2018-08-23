/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora.logica;

/**
 *
 * @author Estudiantes
 */
public class Calculadora {
    protected int valor1;
    protected int valor2;
    protected int resultado;

    public int getValor1() {
        return valor1;
    }

    public void setValor1(int valor1) {
        this.valor1 = valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public void setValor2(int valor2) {
        this.valor2 = valor2;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void sumar(){
        this.resultado = this.valor1 + this.valor2;
    }
    
    public void restar(){
        this.resultado = this.valor1 - this.valor2;
    }
    
    public void multiplicar(){
        this.resultado = this.valor1 * this.valor2;
    }
    
    public void dividir(){
        this.resultado = this.valor1 / this.valor2;
    }
    
    
}
