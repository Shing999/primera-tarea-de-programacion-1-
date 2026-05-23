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
public class comparacionDeNumeros {
    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

        int num1, num2;

        System.out.print("Ingrese el primer numero: ");
        num1 = entrada.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        num2 = entrada.nextInt();

        if(num1 > num2) {

            System.out.println("El numero mayor es: " + num1);
            System.out.println("El numero menor es: " + num2);

        } else if(num2 > num1) {

            System.out.println("El numero mayor es: " + num2);
            System.out.println("El numero menor es: " + num1);

        } else {

            System.out.println("Ambos numeros son iguales");
        }
    }
}
