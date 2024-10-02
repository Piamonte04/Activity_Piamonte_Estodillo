/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_piamonte_estodillo;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Activity_Piamonte_Estodillo {
     
    static double total, difference, quotient, product;
    static double num1, num2, num3;
   
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!!!!!!");
        
        Scanner sc = new Scanner(System.in);
        
        boolean loop = true;
        
        while (true){
        
        int operation;
        System.out.print("Num 1: ");
        num1 = sc.nextDouble();
        System.out.print("Num 2: ");
        num2 = sc.nextDouble();
        System.out.print("Num 3: ");
        num3 = sc.nextDouble();
        System.out.println("Choose an operation: 1. addition 2.subtraction 3.division 4.multiplication");
        operation = sc.nextInt();
        switch (operation){
            case 1:
                total = num1 + num2 + num3;
                System.out.println("Total: " + total);
                break;        
            case 2:
                difference = num1 - num2 - num3;
                System.out.println("Difference: " + difference);
                break;
            case 3:
                quotient = num1 / num2 / num3;
                System.out.println("Quotient: " + quotient);
                break;
            case 4:
                product = num1 * num2 * num3;
                System.out.println("{Product: " + product);
                break;
            }
            System.out.println("Do you want to calculate another numbers?");
            sc.nextLine();
            System.out.println("Type: y/n ");
            String calculate = sc. nextLine();
            
            if (calculate == "y"){
                loop= true;
            }
            else{
                loop = false;
            }
        }
        
        
    }
    
}
