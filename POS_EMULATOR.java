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
        double wfl = 105.00D, crsnt = 115.00D, crfl = 125.00D, cnmrl = 125.00D;
        //MGA PERA
        double sAmericanottl=0, mAmericanottl=0, lAmericanottl=0, sSlattettl=0, mSlattettl=0, lSlattettl=0, sVlattettl=0, mVlattettl=0, lVlattettl=0, sCaramelttl=0, mCaramelttl=0, lCaramelttl=0, wafflettl=0, crntttl=0, cnmrlttl=0, crflttl=0, ttlDeduct=0, vat=0;
        //INPUTS
        String orderCode, choice, choice2;
        //PANG TRIGGER SA RECEIPT 
        int ctrAmericanoS=0, ctrAmericanoM=0, ctrAmericanoL=0, ctrSlatteS=0, ctrSlatteM=0, ctrSlatteL=0, ctrVlatteS=0, ctrVlatteM=0, ctrVlatteL=0, ctrCaramelS=0, ctrCaramelM=0, ctrCaramelL=0, ctrWaffle=0, ctrCroissant=0, ctrCinammon=0, ctrCroffle=0, qntty=0;
        boolean ordering = true;//SERVES TO PROCEED TO THE LOOP

        while (ordering){
        System.out.println("\nKAPEniTON");
        System.out.println("\n1. Add order\n2. Proceed to Checkout\n3. Exit Program\n");
        System.out.print("Please choose from 1-3: ");
        choice = scan.nextLine();
 
        if ("1".equals(choice)){//MENU
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
         
                if(orderCode.equalsIgnoreCase("A1")){ 
                    System.out.println("\n[S] Americano - Php 75.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    sAmericanottl += (sAmericano * qntty);
                    ctrAmericanoS++;
                }
                
                else if(orderCode.equalsIgnoreCase("A2")){ 
                    System.out.println("\n[M] Americano - Php 85.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    mAmericanottl += (mAmericano * qntty);                   
                    ctrAmericanoM++;
                }
                
                else if(orderCode.equalsIgnoreCase("A3")){ 
                    System.out.println("\n[L] Americano - Php 90.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    lAmericanottl += (lAmericano * qntty);                  
                    ctrAmericanoL++;
                }
                
                else if(orderCode.equalsIgnoreCase("S1")){ 
                    System.out.println("\n[S] Spanish Latte - Php 110.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    sSlattettl += (sSlatte * qntty);
                    ctrSlatteS++;
                }
                
                else if(orderCode.equalsIgnoreCase("S2")){ 
                    System.out.println("\n[M] Spanish Latte - Php 110.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    mSlattettl += (mSlatte * qntty);
                    ctrSlatteM++;
                }
                
                else if(orderCode.equalsIgnoreCase("S3")){ 
                    System.out.println("\n[L] Spanish Latte - Php 130.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    lSlattettl += (lSlatte * qntty);
                    ctrSlatteL++;
                }
                
                else if(orderCode.equalsIgnoreCase("V1")){ 
                    System.out.println("\n[S] Vanilla Latte - Php 105.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    sVlattettl += (sVlatte * qntty);
                    ctrVlatteS++;
                }
                
                else if(orderCode.equalsIgnoreCase("V2")){ 
                    System.out.println("\n[M] Vanilla Latte - Php 115.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    mVlattettl += (mVlatte * qntty);
                    ctrVlatteM++;
                }
                
                else if(orderCode.equalsIgnoreCase("V3")){ 
                    System.out.println("\n[L] Vanilla Latte - Php 130.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    lVlattettl += (lVlatte * qntty);
                    ctrVlatteL++;                    
                }
                
                else if(orderCode.equalsIgnoreCase("C1")){ 
                    System.out.println("\n[S] Caramel Machiatto - Php 120.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    sCaramelttl += (sCaramel * qntty);
                    ctrCaramelS++;            
                }
                
                else if(orderCode.equalsIgnoreCase("C2")){ 
                    System.out.println("\n[M] Caramel Machiatto - Php 135.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    mCaramelttl += (mCaramel * qntty);
                    ctrCaramelM++;     
                }
                
                else if(orderCode.equalsIgnoreCase("C3")){ 
                    System.out.println("\n[L] Caramel Machiatto - Php 140.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    lCaramelttl += (lCaramel * qntty);
                    ctrCaramelL++;     
                }
                
                else if(orderCode.equalsIgnoreCase("P1")){ 
                    System.out.println("\nWaffles - Php 105.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    wafflettl += (wfl * qntty);
                    ctrWaffle++;     
                }
                
                else if(orderCode.equalsIgnoreCase("p2")){ 
                    System.out.println("\nCroissant - Php 115.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    crntttl += (crsnt * qntty);
                    ctrCroissant++;     
                }
                
                if(orderCode.equalsIgnoreCase("P3")){ 
                    System.out.println("\nCroffle - Php 125.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    crflttl += (crfl * qntty);
                    ctrCroffle++;     
                }
                
                else if(orderCode.equalsIgnoreCase("P4")){ 
                    System.out.println("\nCinammon Roll - Php 125.00");
                    System.out.print("Enter Quantity: ");
                    qntty = scan.nextInt();
                    
                    cnmrlttl += (cnmrl * qntty);
                    ctrCinammon++;     
                }
                
        }//IF EQUAL 1
        
        //WHILE
        
        //PROCEEDING CHECKOUT
        double total = sAmericanottl + mAmericanottl + lAmericanottl + sSlattettl + mSlattettl + lSlattettl + sVlattettl + mVlattettl + lVlattettl + sCaramelttl + mCaramelttl + lCaramelttl + wafflettl + crntttl + cnmrlttl + crflttl; 
        vat = total * 0.20;
        
        if(choice.equals("2")){
            
            System.out.print("Are you a Senior citizen/PWD [Y/N]: ");
            choice2 = scan.nextLine();
            
            if (choice2.equalsIgnoreCase("Y")){
                ttlDeduct = total * 0.20;
            }
            
            
            System.out.println("\nDRINK: \t\t QUANTITY: \t\t\t PRICE: ");
            if(ctrAmericanoS > 0){
                System.out.println("(S) Americano: \t" + qntty + "\t\t\t" + "Php" + sAmericanottl);
            }
            if(ctrAmericanoL > 0){
                System.out.println("(M) Americano: \t" + qntty + "\t\t\t" + "Php" + mAmericanottl);
            }
            if(ctrAmericanoM > 0){
                System.out.println("(L) Americano: \t\t" + qntty + "\t\t\t" + "Php" + lAmericanottl);
            }
            if(ctrSlatteS > 0){
                System.out.println("(S) Spanish Latte: \t" + qntty + "\t\t\t" + "Php" + sSlattettl);
            }
            if(ctrSlatteM > 0){
                System.out.println("(M) Spanish Latte: \t" + qntty + "\t\t\t" + "Php" + mSlattettl);
            }
            if(ctrSlatteL > 0){
                System.out.println("(L) Spanish Latte: \t" + qntty + "\t\t\t" + "Php" + lSlattettl);
            }
            if(ctrVlatteS > 0){
                System.out.println("(S) Vanilla Latte: \t" + qntty + "\t\t\t" + "Php" + sVlattettl);
            }
            if(ctrVlatteM > 0){
                System.out.println("(M) Vanilla Latte: \t" + qntty + "\t\t\t" + "Php" + mVlattettl);
            }
            if(ctrVlatteL > 0){
                System.out.println("(L) Vanilla Latte: \t" + qntty + "\t\t\t" + "Php" + lVlattettl);
            }
            if(ctrCaramelS > 0){
                System.out.println("(S) Caramel Machiatto: \t" + qntty + "\t\t\t" + "Php" + sCaramelttl);
            }
            if(ctrCaramelM > 0){
                System.out.println("(M) Caramel Machiatto: \t" + qntty + "\t\t\t" + "Php" + mCaramelttl);
            }
            if(ctrCaramelL > 0){
                System.out.println("(L) Caramel Machiatto: \t" + qntty + "\t\t\t" + "Php" + lCaramelttl);
            }
            if(ctrWaffle > 0){
                System.out.println("Waffle: \t\t" + qntty + "\t\t\t" + "Php" + wafflettl);
            }
            if(ctrCroissant > 0){
                System.out.println("Croissant: \t\t" + qntty + "\t\t\t" + "Php" + crntttl);
            }
            if(ctrCinammon > 0){
                System.out.println("Cinnamon Roll: \t\t" + qntty + "\t\t\t" + "Php" + cnmrlttl);
            }
            if(ctrCroffle > 0){
                System.out.println("Croffle: \t\t" + qntty + "\t\t\t" + "Php" + crflttl);
            }
            System.out.println("\n\t\t\tSubtotal: \t\tphp" + total);
            System.out.println("\n\t\t\t\t--------------------");
            System.out.println("\t\t\tVAT: \t\tphp" + vat);
            System.out.println("\t\t\tTotal Discount: \t-php" + ttlDeduct);
            System.out.println("\t\t\tTOTAL BALANCE:\tphp" + ((total + vat) - ttlDeduct));

            
            
            
        }//IF (2)
        
        if("3".equals(choice)){
            break;
        }//if (3)
        
        
        }//WHILE  
        
    }//PSVM
}


