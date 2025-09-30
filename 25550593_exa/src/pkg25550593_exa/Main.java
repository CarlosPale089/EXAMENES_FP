/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg25550593_exa;

import java.util.Scanner;

/**
 *
 * @author unipa
 */
public class Main {
    
static String PIN = "1234";
   
    public static void main(String[] args) {
         Scanner input = new Scanner (System.in);
      int contraseña;
      int consulta;
      int retirar;
      int depositar;
      int saldo;
      int retiro;
      
        System.out.println("BIENVENIDO");
        System.out.println("Ingresa tu PIN para acceder: ");
     contraseña = input.nextInt();
        System.out.println("Ingresa 1 si quieres consultar dinero");
        System.out.println("Ingresa 2 si quieres retirar dinero");
        System.out.println("Ingresar 3 si quieres depositar dinero");
        consulta = input.nextInt();
        if(consulta == 2){
            System.out.println("Cual es el monto que quieres retirar");}
        retirar = input.nextInt();
        saldo = 5000 - retirar;
        System.out.println("Tu saldo es: " +  saldo);
        else if
            
        }
        
      
    
      
        
            
        
      
      
    }
    
}
