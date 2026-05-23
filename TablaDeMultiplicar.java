/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helloworld;
import java.util.Scanner;
/**
 *
 * @author shing
 */
public class TablaDeMultiplicar {
     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero para ver su tabla de multiplicar: ");
        numero = entrada.nextInt();

        System.out.println("\nTabla del " + numero);

        for(int i = 1; i <= 10; i++) {

            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }
}
