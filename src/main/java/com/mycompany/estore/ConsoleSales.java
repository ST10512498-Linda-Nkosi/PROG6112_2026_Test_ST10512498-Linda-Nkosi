/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estore;

/**
 *
 * @author docto
 */
public class ConsoleSales extends Console {
    
    public ConsoleSales(String consoleType,String storename,int totalsales){
        super(consoleType,storename,totalsales);
        
    }
    public void printReport(){
        System.out.println("CONSOLE SALES REPORT"+"\n***************"); // comment for display
        System.out.println("Console Type:"+" "+this.getConsoleType());
        System.out.println("Store:"+" "+this.getStore()); // gets the store
        System.out.println("Total Sales:"+" "+this.getTotalsales()); // gets the sales
    }
}
