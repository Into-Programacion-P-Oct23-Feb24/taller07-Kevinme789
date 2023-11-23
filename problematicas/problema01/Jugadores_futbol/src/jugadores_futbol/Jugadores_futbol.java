/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jugadores_futbol;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LAB.ELECT
 */
public class Jugadores_futbol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String cadena = "";
        String cadena2 = "";
        String listado = "Listado de Jugadores";
        String listado2 = "Listado de edades";
        String promedioedad = "Promedio de edades:";
        String promedioestatura = "Promedio de estaturas:";
        String nombre;
        String posicion;
        int edad;
        int contador = 0;
        int opcion;
        double estatura;
        double suma = 0;
        double suma2 = 0;
        double promedio;
        double promedio2;
        boolean datos = true;
        
        do{
        contador = contador + 1;
        System.out.println("Ingrese nombre del jugador");
        nombre = entrada.nextLine();
        System.out.println("Ingrese posicion en el campo de juego");
        posicion = entrada.nextLine();
        System.out.println("Ingrese edad del jugador");
        edad = entrada.nextInt();
        System.out.println("Ingrese estatura del jugador");
        estatura = entrada.nextDouble();
        cadena = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n", 
                cadena,contador, nombre, posicion, edad, 
                estatura);
        suma = suma+(double)edad;
        suma2 = suma2 + (double)estatura;
        cadena2 = String.format("%s%d\n",cadena2, edad);
        System.out.println("Ingrese el numero '0' para ya no ingresar mas datos");
        opcion = entrada.nextInt();
        entrada.nextLine();
        if( opcion == 0){
        datos = false;
        }
        }while(datos);
         promedio = suma/contador;
         promedio2 = suma2 / contador;
         System.out.printf("%s\n%s%s\n%s%s %.2f\n%s %.2f\n", listado, 
                 cadena, listado2, cadena2, promedioedad, 
                 promedio, promedioestatura, promedio2);
    }
    
}
