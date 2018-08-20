/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebamultiplicar;

// Importamos el paquete java.util para utilizar la clase Scanner

import java.util.*;
/**
 *
 * @author Amarico
 */
public class multiplicar {
    
    // Creamos un objeto de la clase Scanner
    
    Scanner entrada = new Scanner(System.in);
    
    // Creamos una variable entera
    
    private int numero;
    
    
    // Creo el método IntroduceNumero, el cual nos pedirá un número entero
    // por consola
    public void introduceNumero(){
        
        System.out.println("Introduce un número: ");
        
        numero = entrada.nextInt();
        
    // Creo metodo imprimeTabla
    }public void imprimeTabla() {
        // bucle for 
        for (int i=0; i <= 10; i++){
            
            System.out.println("El número " + numero+ " multiplicado por " + i + " es igual a: "+ (i*numero) );
            
            
        }
        
            
    }
    
    
    
    
}
