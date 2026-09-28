/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estore;

/**
 *
 * @author docto
 */
public abstract class Console implements IConsoles {
    
    
    private String consoleType; // gets the console type
    private String storename;
    private int totalsales;
    
    public Console(String consoleType,String storename,int totalsales){ //constructor
        this.consoleType=consoleType;
        this.storename=storename;
        this.totalsales=totalsales;
        
        
    }
    @Override
    public String getConsoleType(){ // get the console type
        return this.consoleType;
    }
    @Override
    public String getStore(){ // get the store
        return this.storename;
    }
    @Override
    public int getTotalsales(){
        return this.totalsales;
    }
}
