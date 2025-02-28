package ui;
import java.util.Scanner;

public class Ejercicio1{

    private static Scanner input;
    private static int[] memory;

    public static void main(String[] args){

        //Inicialización 
        input = new Scanner (System.in);
        memory = new int[10];

        System.out.println(getMemoryInfo());
        
        int position = 0;
        while(position<1||position>10){
            System.out.println("Por favor digita la posición en la que estará el valor (1-10): "); 
            position = input.nextInt();    
            
            if (position -1>memory.length||position-1<0){
                System.out.println("ERROR: posición inválida");
            }
        }

        System.out.println("Ingrese el nuevo dato: ");
        int dato = input.nextInt();
        modifyPositionInMemory(position, dato);
        System.out.println(getMemoryInfo());

    }

    /**
     * Descripción: Muestra el contenido del arreglo 
     * @return El contenido del arreglo con el formato 
     */

    public static String getMemoryInfo (){

     //Obtener información para imprimirla  
     String info = "";
     for (int i = 0; i < memory.length; i++){
        info += memory[i]; 
        info += " | ";

     }
     return info; 
    }

    /**
     * Descripción: Cmabia el valor a una posición del arreglo 
     * @param int position La posición donde se guardará el valor 
     * @param int value El valor que quiero guardar 
     */

    public static int[] modifyPositionInMemory (int position, int value){
        if (position-1>memory.length){
            System.out.println("ERROR: posición inválida");
        }else{
        memory[position-1]= value;
        } 
        return memory;

        }
    }
