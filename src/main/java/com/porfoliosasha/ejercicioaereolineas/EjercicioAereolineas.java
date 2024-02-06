package com.porfoliosasha.ejercicioaereolineas;

import java.util.Scanner;

public class EjercicioAereolineas {

    public static void main(String[] args) {
        
        //Creo la matriz
        int vuelos [] [] = new int [6] [3];
        
        //Cargo la matriz
        Scanner teclado = new Scanner (System.in);
        
        for(int f = 0; f < 6; f++) {
            for(int c = 0; c < 3; c++) {
                System.out.println("Ingrese la cantidad de asientos para el destino " + f + ", con horario " + c);
                vuelos [f] [c] = teclado.nextInt();
            }
        }
        
        //Venta de asientos
        Scanner teclado2 = new Scanner (System.in);
        String bandera = "";
        int destino, horario, asientos;
        
        while (!bandera.equalsIgnoreCase("finish")) {
            System.out.println("Ingrese el numero de destino");
            destino = teclado2.nextInt();
            System.out.println("Ingrese el horario del vuelo");
            horario = teclado2.nextInt();
            System.out.println("Ingrese la cantidad de asientos");
            asientos = teclado2.nextInt();
            
            if(destino >= 0 && destino <= 5){
                if(horario >= 0 && horario <= 2) {
                    if(vuelos[destino][horario] >= asientos) {
                        System.out.println("Su reserva fue realizada con exito.");
                        vuelos[destino][horario] = vuelos[destino][horario] - asientos; 
                    } else {
                        System.out.println("No hay asientos disponibles.");
                    }
            
                    System.out.println("Desea continuar reservando asientos? Ingrese finish para terminar o " + "cualquier vuelo para seguir.");
                    bandera = teclado2.next();
                }else {
                    System.out.println("Horario incorrecto. Ingrese un horario entre 0 y 2");    
                }
            }else {
                System.out.println("Destino no existente. Ingrese el destino entre 0 y 5");    
            }
            
            

            
            
        }
        
        
    }
}
