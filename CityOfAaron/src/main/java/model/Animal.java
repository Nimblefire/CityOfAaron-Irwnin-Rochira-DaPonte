/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
/**
 *
 * @author dapon
 */
public class Animal extends InventoryItem implements Serializable{
    
    //attributes
    private String name;
    private int age;
    
    //default constructor
    public Animal(){
        
    }
    
    //getter and setter
    @Override
    public String getName(){
        return name;
    }
    
    @Override
    public void setName(String name){
        //if
        this.name = name;
    }
    
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" 
                + "\n name=" + name
                + "\n age=" + age 
                + "\n itemType=" + super.getItemType()
                + "\n quantity=" + super.getQuantity()
                + "\n condition=" +super.getCondition() 
                + '}';
    }
    
}