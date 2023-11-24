/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacion03;



/**
 *
 * @author porke
 */
public class Aplicacion03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 3;
        int numero = 2;
        
        do{
            
        System.out.println(numero);
        numero =suma + numero;
        suma = suma + 2;
        }while(numero <= 37);
    }
    
}
