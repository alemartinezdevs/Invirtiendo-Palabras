package com.mycompany.invertirpalabrapila;
import java.util.Scanner;
/*
 * @author gabrielapineda
 */
public class InvertirPalabraPila {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continuar = true;
        
        //repetir hasta que el usuario no desee continuar
        do{

            System.out.print("¿Cuantas cadenas desea inverir?");
            int cantidad = 0;
            try{
                cantidad = in.nextInt();
            }catch(Exception e){
                System.out.println("Error! Ingrese solo numero.");
                in.nextLine();
                continue;
            }
            in.nextLine(); //consumir la nueva linea
            
            for(int i=0;i<cantidad;i++){
                String cadena = "";
                //verificar que la cadena ingresada no este vacia si es asi preguntar hasta que sea lo contrario
                do{
                    System.out.print("\nIngrese la cadena a invertir: ");
                    cadena = in.nextLine();
                    if(cadena.isEmpty()){
                        System.out.println("La cadena esta vacía, intente de nuevo");   
                    }else if(cadena.length() <= 1){
                        System.out.println("La cadena debe tener por lo menos 2 caracteres");
                    }
                }while(cadena.isEmpty() || cadena.length()<=1);
                
                //usar la clase palabra para invertir la cadena usando pilas 
                Palabra p = new Palabra();
                System.out.println("\nCadena "+(i+1)+" invertida");
                p.invertirPalabra(cadena);
                System.out.println(); //salto de linea entre cada cadena 
            }
            
            System.out.print("\n¿Desea continuar ingresando mas cadenas?(si/no)");
            String respuesta = in.nextLine().toLowerCase();
            // Verificar si la respuesta no es "si" ni "no"
            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println("Respuesta no válida. Por favor, responda 'si' o 'no'.");
                respuesta = in.nextLine().toLowerCase();
            }
            if (!respuesta.equals("si")) {
                continuar = false;
            }   
        }
        while(continuar);
        in.close();//cerrar el scanner
    }
}
