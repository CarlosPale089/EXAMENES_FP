/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_exa2_25050593;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class EVA2_EXA2_25050593 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);
        int opcion;
        do {
            soliciatarPrimosonoPrimos();
            opcion = input.nextInt();
            if (opcion == 1) {
                numeroPrimo();
            } else if (opcion == 2) {
                noesnumeroPrimo();
            } else if (opcion == 3) {

            }
        } while (opcion != 4);
        {
            System.out.println("Saliendo del sistema.............");
        }
    }

    public static void soliciatarPrimosonoPrimos() {
        System.out.println("Bienvenido");
        System.out.println("Que quiere solicitar");
        System.out.println("1.Numeros primos");
        System.out.println("2.Numeros no primos");
        System.out.println("3.Salir del sistema");
    }

    public static void numeroPrimo() {
        Scanner input = new Scanner(System.in);
        int valor;
        boolean esPrimo = true;
        System.out.println("Introduce un valor: ");
        valor = input.nextInt();

        for (int i = 2; i <= valor; i++) {
            for (int j = 1; j <= i; j++) {
                
                    System.out.print("*");

                }
                System.out.println("");
            }
    }
    public static void noesnumeroPrimo() {
          Scanner input = new Scanner(System.in);
        int valor;
        boolean esPrimo = true;
        System.out.println("Introduce un valor: ");
        valor = input.nextInt();

        for (int i = 2; i <= valor; i++) {
            for (int j = 1; j <= i; j++) {
                
                    System.out.print("*");

                }
                System.out.println("");
            }
    }
    
}
