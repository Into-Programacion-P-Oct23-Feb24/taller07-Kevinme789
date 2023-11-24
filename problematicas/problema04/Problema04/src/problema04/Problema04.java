/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author porke
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero = 1;
        int contador = 3;
        System.out.printf("%d ", numero);
        while(contador <= 15){
            System.out.printf("- %d/%d", numero, contador);
            contador = contador +2;
            if(contador < 15){
            System.out.printf(" + %d/%d ", numero, contador);
            }
            contador = contador +2;
        
        }
    }
    
}
