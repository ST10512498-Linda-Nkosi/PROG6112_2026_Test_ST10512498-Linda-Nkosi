/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.electronicfranchise;

/**
 *
 * @author docto
 */
public class ElectronicFranchise {

    public static void main(String[] args) {
        
        String []franchise={"Cape Town","Port Elizabeth","Pretoria"};
        
        int [][]sales={{1000,2000,3000},{2000,3000,4000},{1500,1100,1200}};
        
        
        System.out.println("-----------------------------------------");
            System.out.println("GAMING CONSOLE REPORT");
            System.out.println("-----------------------------------------");
            System.out.println("\t\tPS5"+"\t"+"XBOX"+"\t"+"SWITCH");
        for (int i = 0; i <franchise.length; i++) { //loop through rows
            System.out.println(franchise[i]+"\t"+sales[i][0]+"\t"+sales[i][1]+"\t"+sales[i][2]);
          
        }
        int maxmovie=-1;
            String City=" ";
             System.out.println("-----------------------------------------");
                 System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
                   System.out.println("-----------------------------------------");
             for (int i = 0; i <franchise.length; i++) {
                  
         int totalsales=sales[i][0]+sales[i][1]+sales[i][2];
                 System.out.println(franchise[i]+" "+totalsales);
                 
                 if(totalsales>maxmovie){
                     maxmovie=totalsales;
                     City=franchise[i];
                 }    
        }
             System.out.println("CITY WITH THE MOST SALES:"+" "+City);
               System.out.println("----------------------------------------");
    }
}
