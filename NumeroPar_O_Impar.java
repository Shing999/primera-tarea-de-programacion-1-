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
public class NumeroPar_O_Impar {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int numero;

        System.out.print("Ingrese un numero: ");
        numero = entrada.nextInt();

        if(numero % 2 == 0) {

            System.out.println("El numero es par");

        } else {

            System.out.println("El numero es impar");
        }
    }
}
