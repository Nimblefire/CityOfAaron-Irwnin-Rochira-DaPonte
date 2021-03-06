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
public class Provision extends InventoryItem implements Serializable{
    //attributes
    private boolean perishable;
    
    //default constructor
    public Provision(){   
    }
    
    // overloaded constructor
    public Provision(String name, ItemType itemType, Condition condition, int quantity, boolean perishable){
        this.name = name;
        this.itemType = itemType;
        this.condition = condition;
        this.quantity = quantity;
        this.perishable = perishable;
    }
    
    
    //getter and setter
    
    public boolean getPerishable(){
        return perishable;
    }
    
    public void setPerishable(boolean perishable){
        this.perishable = perishable;
    }
   
    @Override
    public String toString(){
        return "Provision{"
                + super.toString()
                + "\n perishable=" + perishable
                + "}";
    }
}
