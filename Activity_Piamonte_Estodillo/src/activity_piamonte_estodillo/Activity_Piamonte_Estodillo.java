/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package activity_piamonte_estodillo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Activity_Piamonte_Estodillo {
     

//    static double numbers [] = new double[10], x, mean,
//                       sum=0, sum2=0, counter=0;
   
    public static void main(String[] args) {
        List<PersonInfo> info = new ArrayList<>();
   
       
      
      
        System.out.println("Person Info: ");
        
         while (true) {     
             
             try {
                  Scanner scn = new Scanner(System.in);
           
             System.out.println("Enter Name: ");
             String name = scn.nextLine();
             
             System.out.println("Enter Age: ");
             int Age = scn.nextInt();
             
             System.out.println("Enter Grade Level: ");
             int gLevel = scn.nextInt();
             
             PersonInfo person = new PersonInfo(name, Age, gLevel);
             info.add(person);
             
             for (PersonInfo personInfo : info) {
                 System.out.println("Name: " + personInfo.getName());
                 System.out.println("Age: " + personInfo.getAge());
                 System.out.println("Grade Level: " + personInfo.getGradeLevel()+"\n");
             }
             } catch (NumberFormatException e) {
                 e.printStackTrace();
             }
          
             
        }
        
        
        
        
        
        
        
        
        
    
        
   //     mean
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter 10 munbers, one at a time: ");
//        
//        for (int i = 0;i<numbers.length;i++) {
//        x= scn.nextDouble();
//          numbers[i]= x;
//          sum+=numbers[i];
//        }
//        mean = sum / numbers.length;
//        for (int i = 0;i<numbers.length;i++){
//            sum2 += Math.pow(numbers[i] - mean, 2);
//        }
//        System.out.println("Mean = " + mean );
//        
        
        
        
//       System.out.ptln("Hello World!!!!!!");
//        
//        Scanner sc = new Scanner(System.in);
//        
//        boolean loop = true;
//        
//        while (true){
//        
//        int operation;
//        System.out.print("Num 1: ");
//        num1 = sc.nextDouble();
//        System.out.print("Num 2: ");
//        num2 = sc.nextDouble();
//        System.out.print("Num 3: ");
//        num3 = sc.nextDouble();
//        System.out.println("Choose an operation: 1. addition 2.subtraction 3.division 4.multiplication");
//        operation = sc.nextInt();
//        switch (operation){
//            case 1:
//                total = num1 + num2 + num3;
//                System.out.println("Total: " + total);
//                break;        
//            case 2:
//                difference = num1 - num2 - num3;
//                System.out.println("Difference: " + difference);
//                break;
//            case 3:
//                quotient = num1 / num2 / num3;
//                System.out.println("Quotient: " + quotient);
//                break;
//            case 4:
//                product = num1 * num2 * num3;
//                Sysem.out.println("{Product: " + product);
//                break;
//            }
//            System.out.println("Do you want to calculate another numbers?");
//            sc.nextLine();
//            System.out.println("Type: y/n ");
//            String calculate = sc. nextLine();
//            
//            if (calculate == "y"){
//                loop= true;
//            }
//            else{
//                loop = false;
//            }
//        }
//        
//        
//    }
    
}}
