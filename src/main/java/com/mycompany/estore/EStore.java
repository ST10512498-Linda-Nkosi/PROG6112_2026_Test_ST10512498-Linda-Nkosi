/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.estore;
import java.util.Scanner;
/**
 *
 * @author docto
 */
public class EStore {

    public static void main(String[] args) {
      
        Scanner input=new Scanner(System.in);
        System.out.println("Select the console type");
        System.out.println("1)"+" "+"PS5"+"\n"+"2)"+" "+"XBOX"+"\n"+"3)"+" "+"SWITCH");
        System.out.println();
        String choice=input.next();
        
        System.out.print("Enter the store:"+" "+"Number"+" "+choice+" ");
        input.nextLine();
        String store= input.nextLine();
        System.out.print("Enter the total sales of "+" "+choice+" "+"for Number"+" "+choice+" "+store+":");
        int totalsales=input.nextInt();
        
        
        ConsoleSales cs=new ConsoleSales(choice,store,totalsales);
        
        cs.printReport();
    }
}
