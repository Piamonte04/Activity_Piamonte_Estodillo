/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity_piamonte_estodillo;

/**
 *
 * @author Lenovo
 */
public class mean {
     public double calculateMean(double[]numbers) {
        double sum = 0;
        for (double num:numbers){
            sum += num;
           
        }
        return sum/numbers.length;
    }
    
}
