/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author porke
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int numero = 2;
        int contador = 2;
        while(numero <= 110){
            System.out.printf("%d\n", numero);
            contador = contador + 2;
            numero = numero + contador;
        
        }
    }
    
}
