
package com.mycompany.invertirpalabrapila;

/*
Descripción: demostrar como las pilas se pueden usar para invertir una cadena 
 */

import java.util.Stack; 

//tambien podemos utilizar la libreria "deque"
public class Palabra {
    
    //Creamos el metodo que es el que nos va a retornar una cadena.
    public void invertirPalabra(String cadena){

        //crear la pila
        Stack <Character> pila = new Stack<>();
        
        //para dividir la cadena en caracteres declaramos un arreglo de char y convertimos la cadena a char
        char letras [] = cadena.toCharArray();
        
        for(int i=0; i<letras.length;i++){
            pila.push(letras[i]);
        }

        // Construir la cadena revertida extrayendo caracteres de la pila
        while(!pila.empty()){
            System.out.print(pila.pop());
        }
    }

    //Si deseamos invertir una palabra sin utilizar pila podemos manipular el indice desde un arreglo. Collections.sort(al, Collections.reverseOrder());
    
}
