package com.mycompany.invertirpalabrapila;
import java.util.Scanner;


public class InvertirPalabraPila {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean continuar = true;

        //Encabezado
        System.out.println("\n--------------------------------------------------");
        System.out.println("\t     INVERTIR UNA PALABRA");
        System.out.println("--------------------------------------------------");
        
        //repetir hasta que el usuario no desee continuar
        do{

            System.out.println("\n¿Cuantas cadenas desea invertir?");
            System.out.print("Respuesta:");
            int cantidad;
            try{
                cantidad = in.nextInt();
            }catch(Exception e){
                System.out.println("Error! Ingrese solo números.");
                in.nextLine();
                continue;
            }
            in.nextLine(); //consumir la nueva linea
            
            for(int i=0;i<cantidad;i++){
                String cadena = "";

                //verificar que la cadena ingresada no este vacia si es asi preguntar hasta que sea lo contrario
                do{
                    System.out.print("\nIngrese la cadena #"+(i+1)+" a invertir: ");
                    cadena = in.nextLine();
                    if(cadena.isEmpty()){
                        System.out.println("La cadena esta vacía, intente de nuevo");   
                    }else if(cadena.length() <= 1){
                        System.out.println("La cadena debe tener por lo menos 2 caracteres");
                    }


                    /*para manejar el espacio como un caracter se debe crear una 
                    función en el que predefinamos un caracter al momento que el usuario use la tecla espacio 
                    */ 

                }while(cadena.isEmpty() || cadena.length()<=1);
                
                //instanciamos la clase palabra para invertir la cadena usando pilas 
                Palabra p = new Palabra();
                System.out.println("\nCadena "+(i+1)+" invertida");
                p.invertirPalabra(cadena);
                System.out.println(); //salto de linea entre cada cadena 
            }
            
            System.out.println("\n¿Desea continuar ingresando mas cadenas?(si/no)");
            System.out.print("Respuesta:");
            String respuesta = in.nextLine().toLowerCase();

            //Verificamos si la respuesta que nos ha dado el usuario es SI o NO.
            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println("\nRespuesta no válida. Por favor, responda 'si' o 'no'.");
                System.out.print("Respuesta:");
                respuesta = in.nextLine().toLowerCase();
            }
            if (!respuesta.equals("si")) {
                continuar = false;
            }   
        }
        while(continuar);
        System.out.println("\nPrograma Finalizado...");
        in.close();//cerramos el scanner para evitar la fuga de datos.
    }
}
