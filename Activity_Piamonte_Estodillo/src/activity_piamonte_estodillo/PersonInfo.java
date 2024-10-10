/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package activity_piamonte_estodillo;

/**
 *
 * @author Asus
 */
public class PersonInfo {
    
    private String name;
    private int age;
    private int gLevel;

    public PersonInfo() {
    }
    
    public PersonInfo (String name, int age, int gLevel){
        this.name = name;
        this.age = age;
        this.gLevel = gLevel;
    }
    
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }  
    int getAge() {
        return age;
    }
    public void setAge(){
        this.age = age;
    }
    int getGradeLevel(){
        return gLevel;
    }
    public void setGradeLevel(){
        this.gLevel = gLevel;
    }
}

