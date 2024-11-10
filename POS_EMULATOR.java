/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package org.cruz_shaun;
import java.util.Scanner;

public class POS_EMULATOR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     
        //PRICES OF DRINKS
        double sAmericano = 75.00D, mAmericano = 85.00D, lAmericano = 90.00D, sSlatte = 110.00D, mSlatte = 125.00D, lSlatte = 130.00D;
        double sVlatte = 105.00D, mVlatte = 115.00D, lVlatte = 130.00D, sCaramel = 120.00D, mCaramel = 135.00D, lCaramel = 140.00D;
        //PRICES OF PASTRIES
        double wfl = 105.00D, crsnt = 115.00D, crfl = 125.00D, cnmrl = 125.00D, total=0;
        String orderCode, choice, drink="", pastry;
        //PANG TRIGGER SA RECEIPT 
        int ctrAmericano=0, ctrSlatte=0, ctrVlatte=0, ctrCaramel=0, ctrWaffle=0, ctrCroissant=0, ctrCinammon=0, ctrCroffle=0, qntty=0;
        boolean ordering = true;
        
        
        while(ordering){
        System.out.println("\n1. Add order\n2. Proceed to Checkout\n3. Exit Program\n");
        System.out.print("Please choose from 1-3: ");
        choice = scan.nextLine();
        
        if ("1".equals(choice)){
        System.out.println("================================================================================================");
        System.out.println("\t\t\t\t\t = MENU =");
        System.out.println("================================================================================================");  
        System.out.println("\nDRINKS\t\t\t     SMALL\t\t\t     MEDIUM\t\t\t     LARGE\n");
        System.out.println("AMERICANO \t\t\t [ A1 ] - Php75.00 \t\t [ A2 ] - Php85.00 \t\t [ A3 ] - Php90.00");
        System.out.println("SPANISH LATTE \t\t [ S1 ] - Php110.00 \t\t [ S2 ] - Php125.00 \t\t [ S3 ] - Php130.00");
        System.out.println("VANILLA LATTE \t\t [ V1 ] - Php105.00 \t\t [ V2 ] - Php115.00  \t\t [ V3 ] - Php130.00");
        System.out.println("CARAMEL MACHIATTO \t\t [ C1 ] - Php120.00 \t\t [ C2 ] - Php135.00  \t\t [ C3 ] - Php140.00");
        System.out.println("\nPASTRIES\n");
        System.out.println("WAFFLES \t\t\t [ P1 ] - Php105.00 \nCROISSANT \t\t\t [ P2 ] - Php115.00 \nCROFFLE \t\t\t [ P3 ] - Php125.00 \nCINNAMON ROLL \t\t [ P4 ] - Php125.00");
        System.out.println("================================================================================================\n");

        System.out.print("\n ENTER ORDER CODE: ");
        orderCode = scan.nextLine();
        //ORDER CODES
        switch(orderCode) { 
                case "A1":
                    System.out.println("[S] Americano - Php 75.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (sAmericano * qntty);
                    drink = "Americano";
                    ctrAmericano++;
                    break;
                case "A2":
                    System.out.println("[M] Americano - Php 85.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (mAmericano * qntty);
                    drink = "Americano";                   
                    ctrAmericano++;
                    break;
                case "A3":
                    System.out.println("[L] Americano - Php 90.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (lAmericano * qntty);
                    drink = "Americano";                    
                    ctrAmericano++;
                    break;
                case "S1":
                    System.out.println("[S] Spanish Latte - Php 110.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (sSlatte * qntty);
                    drink = "Spanish Latte";
                    ctrSlatte++;
                    break;
                case "S2":
                    System.out.println("[M] Spanish Latte - Php 110.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (mSlatte * qntty);
                    drink = "Spanish Latte";
                    ctrSlatte++;
                    break;
                case "S3":
                    System.out.println("[L] Spanish Latte - Php 130.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (lSlatte * qntty);
                    drink = "Spanish Latte";
                    ctrSlatte++;
                    break;
                case "V1":
                    System.out.println("[S] Vanilla Latte - Php 105.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (sVlatte * qntty);
                    drink = "Vanilla Latte";
                    ctrVlatte++;
                case "V2":
                    System.out.println("[M] Vanilla Latte - Php 115.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (mVlatte * qntty);
                    drink = "Vanilla Latte";
                    ctrVlatte++;
                    break;
                case "V3":
                    System.out.println("[L] Vanilla Latte - Php 130.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (lVlatte * qntty);
                    drink = "Vanilla Latte";
                    ctrVlatte++;                    
                    break;
                case "C1":
                    System.out.println("[S] Caramel Machiatto - Php 120.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (sCaramel * qntty);
                    drink = "Caramel Machiatto";
                    ctrCaramel++;            
                    break;
                case "C2":
                    System.out.println("[M] Caramel Machiatto - Php 135.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (mCaramel * qntty);
                    drink = "Caramel Machiatto";
                    ctrCaramel++;     
                    break;
                case "C3":
                    System.out.println("[L] Caramel Machiatto - Php 140.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (lCaramel * qntty);
                    drink = "Caramel Machiatto";
                    ctrCaramel++;     
                    break;     
                case "P1":
                    System.out.println("Waffles - Php 105.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (wfl * qntty);
                    pastry = "Waffle";
                    ctrWaffle++;     
                    break;     
                case "P2":
                    System.out.println("Croissant - Php 115.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (crsnt * qntty);
                    pastry = "Croissant";
                    ctrCroissant++;     
                    break;     
                case "P3":
                    System.out.println("Croffle - Php 125.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (crfl * qntty);
                    pastry = "Croffle";
                    ctrCroffle++;     
                    break;     
                case "P4":
                    System.out.println("Cinammon Roll - Php 125.00");
                    System.out.println("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    total += (cnmrl * qntty);
                    pastry = "Cinammon Roll";
                    ctrCinammon++;     
                    break;
        }//SWITCH 
        }//IF
        
        //PROCEEDING CHECKOUT
        if("2".equals(choice)){
            System.out.println("DRINK: \t\t QUANTITY: \t\t\t PRICE: ");
            
            if(ctrAmericano > 0){
                System.out.println("Americano: \t\t" + qntty + "\t\t\t" + total);
            }
            if(ctrSlatte > 0){
                System.out.println("Spanish Latte: \t\t" + qntty + "\t\t\t" + total);
            }
            if(ctrVlatte > 0){
                System.out.println("Vanilla Latte: \t\t" + qntty + "\t\t\t" + total);
            }
            
        }//IF (2)
        
        if("3".equals(choice)){
            System.exit(0);
        }
        
        else if(!"1".equals(choice)||!"2".equals(choice)||!"3".equals(choice)){
            System.out.println("INVALID INPUT, PLEASE TRY AGAIN :)");
        }
        
        
        }//WHILE  
    }//PSVM
}//PUBLIC CLASSLASS*/

