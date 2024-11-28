package org.cruz_shaun;
import java.util.Scanner;

public class POS_EMULATOR2 {
    //PRICES OF DRINKS
    static double sAmericano = 75.00D, mAmericano = 85.00D, lAmericano = 90.00D, sSlatte = 110.00D, mSlatte = 125.00D, lSlatte = 130.00D;
    static double sVlatte = 105.00D, mVlatte = 115.00D, lVlatte = 130.00D, sCaramel = 120.00D, mCaramel = 135.00D, lCaramel = 140.00D;
    //PRICES OF PASTRIES
    static double wfl = 105.00D, crsnt = 115.00D, crfl = 125.00D, cnmrl = 125.00D;
    //MGA PERA
    static double sAmericanottl=0, mAmericanottl=0, lAmericanottl=0, sSlattettl=0, mSlattettl=0, lSlattettl=0, sVlattettl=0, mVlattettl=0, lVlattettl=0, sCaramelttl=0, mCaramelttl=0, lCaramelttl=0, wafflettl=0, crntttl=0, cnmrlttl=0, crflttl=0, ttlDeduct=0, vat, payment, change, ttlBalance;
    //INPUTS OF USER
    static String orderCode, choice, choice2;
    //PANG TRIGGER SA RECEIPT (we use ctr to display na choice of drinks(size included) basta mag ctr>0 lalabas na yan sa receipt)
    static int ctrAmericanoS=0, ctrAmericanoM=0, ctrAmericanoL=0, ctrSlatteS=0, ctrSlatteM=0, ctrSlatteL=0, ctrVlatteS=0, ctrVlatteM=0, ctrVlatteL=0, ctrCaramelS=0, ctrCaramelM=0, ctrCaramelL=0, ctrWaffle=0, ctrCroissant=0, ctrCinammon=0, ctrCroffle=0;
    static int itemCtr, sAmericanoqntty=0, mAmericanoqntty=0, lAmericanoqntty=0, sSlatteqntty=0, mSlatteqntty=0, lSlatteqntty=0, sVlatteqntty=0, mVlatteqntty=0, lVlatteqntty=0, sCaramelqntty=0, mCaramelqntty=0, lCaramelqntty=0, waffleqntty=0, crntqntty=0, cnmrlqntty=0, crflqntty=0;

    public static void main(String[] args){
        while (true){
        Scanner scan = new Scanner(System.in);
        mainMenu();
        choice = scan.nextLine();
        
        if(choice.equalsIgnoreCase("1")){//ORDER PRODUCST
        menu();
        orderCode();
        }else if(choice.equalsIgnoreCase("2")){//PROCEEDING TO CHECKOUT -> PAYMENT
            if(orderCode != null){
                receipt();
                doPayment();
            } else {//IF NO ORDER WAS MADE YET STILL CHOSE 2
                System.out.println("\n------------------------------\nCannot proceed without an order.\n------------------------------");
            }

        }else if(choice.equalsIgnoreCase("3")){//EXIT/CANCEL THE PROGRAM
            System.out.println("\n------------------------------\nOkay, Thank You!\n------------------------------");
            System.exit(0);
        }else if(choice.isEmpty()||choice.isBlank()){
            System.out.println("\n------------------------------\nNO DETECTED INPUT, PLEASE TRY AGAIN!\n------------------------------");
        }else {
            System.out.println("\n------------------------------\nINVALID INPUT, PLEASE TRY AGAIN!\n------------------------------");
        }
        }//WHILE 
    }//PSVM
    
    public static void mainMenu(){
        System.out.println("\n= KAPEniTON =");
        System.out.println("\n1. Add order\n2. Proceed to Checkout\n3. Exit/cancel Program\n");
        System.out.print("Please choose from 1-3: ");
    }//mainMenu()
    
    public static void menu(){
        System.out.println("\n===========================================================================================================");
        System.out.println("\t\t\t\t\t\t= MENU =");
        System.out.println("===========================================================================================================");  
        System.out.println("\nDRINKS\t\t\t     SMALL\t\t\t     MEDIUM\t\t\t     LARGE\n");
        System.out.println("AMERICANO \t\t [ A1 ] - Php75.00 \t\t [ A2 ] - Php85.00 \t\t [ A3 ] - Php90.00");
        System.out.println("SPANISH LATTE \t\t [ S1 ] - Php110.00 \t\t [ S2 ] - Php125.00 \t\t [ S3 ] - Php130.00");
        System.out.println("VANILLA LATTE \t\t [ V1 ] - Php105.00 \t\t [ V2 ] - Php115.00  \t\t [ V3 ] - Php130.00");
        System.out.println("CARAMEL MACHIATTO \t [ C1 ] - Php120.00 \t\t [ C2 ] - Php135.00  \t\t [ C3 ] - Php140.00");
        System.out.println("\nPASTRIES\n");
        System.out.println("WAFFLES \t\t [ P1 ] - Php105.00 \nCROISSANT \t\t [ P2 ] - Php115.00 \nCROFFLE \t\t [ P3 ] - Php125.00 \nCINNAMON ROLL \t\t [ P4 ] - Php125.00");
        System.out.println("===========================================================================================================\n");
    }//menu()
    
    public static void orderCode(){
        Scanner scan = new Scanner(System.in);
        while (true){
        System.out.print("\n ENTER ORDER CODE (a1/A1): ");
        orderCode = scan.nextLine();
        
        if(orderCode.equalsIgnoreCase("A1")){ //SMALL AMERICANO
            System.out.println("\n[S] Americano - Php 75.00");
            while(true){
            System.out.print("Enter Quantity: ");
            sAmericanoqntty += scan.nextInt();

            if(sAmericanoqntty > 0){
            sAmericanottl = (sAmericano * sAmericanoqntty);
            ctrAmericanoS++;
            System.out.println("\n------------------------------");//<- USED TO DIVIDE CONTENTS TO MINIMIZE CONFUSIONS
            break; 
            }else{
            System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("A2")){ //MEDIUM AMERICANO
            System.out.println("\n[M] Americano - Php 85.00");
            while(true){
            System.out.print("Enter Quantity: ");
            mAmericanoqntty += scan.nextInt();

            if(mAmericanoqntty > 0){
                mAmericanottl = (mAmericano * mAmericanoqntty);                   
                ctrAmericanoM++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("A3")){ //LARGE AMERICANO
            System.out.println("\n[L] Americano - Php 90.00");
            while(true){
            System.out.print("Enter Quantity: ");
            lAmericanoqntty += scan.nextInt();

            if(lAmericanoqntty > 0){
                lAmericanottl = (lAmericano * lAmericanoqntty);                  
                ctrAmericanoL++;
                System.out.println("\n------------------------------");
                break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("S1")){ //SMALL SPANISH LATTE
            System.out.println("\n[S] Spanish Latte - Php 110.00");
            while(true){
            System.out.print("Enter Quantity: ");
            sSlatteqntty += scan.nextInt();

            if(sSlatteqntty > 0){
                sSlattettl = (sSlatte * sSlatteqntty);
                ctrSlatteS++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("S2")){ //MEDIUM SPANISH LATTE
            System.out.println("\n[M] Spanish Latte - Php 110.00");
            while(true){
            System.out.print("Enter Quantity: ");
            mSlatteqntty += scan.nextInt();

            if(mSlatteqntty > 0){ 
                mSlattettl = (mSlatte * mSlatteqntty);
                ctrSlatteM++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("S3")){ //LARGE SPANISH LATTE
            System.out.println("\n[L] Spanish Latte - Php 130.00");
            while(true){
            System.out.print("Enter Quantity: ");
            lSlatteqntty += scan.nextInt();

            if(lSlatteqntty > 0){
                lSlattettl = (lSlatte * lSlatteqntty);
                ctrSlatteL++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("V1")){ //SMALL VANILLA LATTE
            System.out.println("\n[S] Vanilla Latte - Php 105.00");
            while(true){
            System.out.print("Enter Quantity: ");
            sVlatteqntty += scan.nextInt();

            if(sVlatteqntty > 0){
                sVlattettl = (sVlatte * sVlatteqntty);
                ctrVlatteS++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("V2")){ //MEDIUM VANILLA LATTE
            System.out.println("\n[M] Vanilla Latte - Php 115.00");
            while(true){
            System.out.print("Enter Quantity: ");
            mVlatteqntty += scan.nextInt();

            if(mVlatteqntty > 0){
                mVlattettl = (mVlatte * mVlatteqntty);
                ctrVlatteM++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("V3")){ //LARGE VANILLA LATTE
            System.out.println("\n[L] Vanilla Latte - Php 130.00");
            while(true){
            System.out.print("Enter Quantity: ");
            lVlatteqntty += scan.nextInt();

            if(lVlatteqntty > 0){
                lVlattettl = (lVlatte * lVlatteqntty);
                ctrVlatteL++;    
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("C1")){ //SMALL CARAMEL MACHIATTO
            System.out.println("\n[S] Caramel Machiatto - Php 120.00");
            while(true){
            System.out.print("Enter Quantity: ");
            sCaramelqntty += scan.nextInt();

            if(sCaramelqntty > 0){
                sCaramelttl = (sCaramel * sCaramelqntty);
                ctrCaramelS++;   
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("C2")){ //MEDIUM CARAMEL MACHIATTO
            System.out.println("\n[M] Caramel Machiatto - Php 135.00");
            while(true){
            System.out.print("Enter Quantity: ");
            mCaramelqntty += scan.nextInt();

            if(mCaramelqntty > 0){
                mCaramelttl = (mCaramel * mCaramelqntty);
                ctrCaramelM++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("C3")){ //LARGE CARAMEL MACHIATTO
            System.out.println("\n[L] Caramel Machiatto - Php 140.00");
            while(true){
            System.out.print("Enter Quantity: ");
            lCaramelqntty += scan.nextInt();

            if(lCaramelqntty > 0){
                lCaramelttl = (lCaramel * lCaramelqntty);
                ctrCaramelL++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("P1")){ //WAFFLES
            System.out.println("\nWaffles - Php 105.00");
            while(true){
            System.out.print("Enter Quantity: ");
            waffleqntty += scan.nextInt();

            if(waffleqntty > 0){
                wafflettl = (wfl * waffleqntty);
                ctrWaffle++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("p2")){ //CROISSANT
            System.out.println("\nCroissant - Php 115.00");
            while(true){
            System.out.print("Enter Quantity: ");
            crntqntty += scan.nextInt();

            if(crntqntty > 0){
                crntttl = (crsnt * crntqntty);
                ctrCroissant++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("P3")){ //CROFFLE
            System.out.println("\nCroffle - Php 125.00");
            while(true){
            System.out.print("Enter Quantity: ");
            crflqntty += scan.nextInt();

            if(crflqntty > 0){
                crflttl = (crfl * crflqntty);
                ctrCroffle++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.equalsIgnoreCase("P4")){ //CINNAMON ROLL
            System.out.println("\nCinammon Roll - Php 125.00");
            while(true){
            System.out.print("Enter Quantity: ");
            cnmrlqntty += scan.nextInt();
  
            if(cnmrlqntty > 0){
                cnmrlttl = (cnmrl * cnmrlqntty);
                ctrCinammon++;
                System.out.println("\n------------------------------");
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------\n");
            }
            }break;
        }else if(orderCode.isBlank()||orderCode.isEmpty()){//BLANK INPUT
            System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------");

        }else{//ERROR/INVALID INPUT
            System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------");         
        }
        }
    }//orderCode()
    
    public static void receipt(){
        double total = sAmericanottl + mAmericanottl + lAmericanottl + sSlattettl + mSlattettl + lSlattettl + sVlattettl + mVlattettl + lVlattettl + sCaramelttl + mCaramelttl + lCaramelttl + wafflettl + crntttl + cnmrlttl + crflttl;
        itemCtr = sAmericanoqntty + mAmericanoqntty + lAmericanoqntty + sSlatteqntty + mSlatteqntty + lSlatteqntty + sVlatteqntty + mVlatteqntty + lVlatteqntty + sCaramelqntty + mCaramelqntty + lCaramelqntty + waffleqntty + crntqntty + cnmrlqntty + crflqntty;
        vat = total * 0.20;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\n------------------------------\nPROCEEDING TO CHECKOUT\n------------------------------");
        while(true){
            System.out.print("\nAre you a Senior citizen/PWD [Y/N]: ");
            choice2 = scan.nextLine();

            if (choice2.equalsIgnoreCase("Y")){
                ttlDeduct = total * 0.20; 
                break;  
            }else if (choice2.equalsIgnoreCase("N")){
            break;
            }else{
                System.out.println("\n------------------------------\nINVALID INPUT!, PLEASE TRY AGAIN.\n------------------------------");
            }
        }//WHILE OF "ARE YOU SENIOR"
        
        System.out.println("\n================================================================================");
        System.out.println("QTY: \t   ORDERS: \t\t\tUNIT PRICE: \t\t\tAMOUNT: ");
        System.out.println("================================================================================\n");
        if(ctrAmericanoS > 0){
            System.out.println(" x" + sAmericanoqntty +  "\t(S) Americano: \t\t\t " + "75.00" + "\t\t\t\t" + "Php" + sAmericanottl);
        }if(ctrAmericanoM > 0){
            System.out.println(" x" + mAmericanoqntty +  "\t(M) Americano: \t\t\t " + "85.00" +  "\t\t\t\t" + "Php" + mAmericanottl);
        }if(ctrAmericanoL > 0){
            System.out.println(" x" + lAmericanoqntty + "\t(L) Americano: \t\t\t " + "90.00" +  "\t\t\t\t" + "Php" + lAmericanottl);
        }if(ctrSlatteS > 0){
            System.out.println(" x" + sSlatteqntty + "\t(S) Spanish Latte: \t\t " + "110.00" +  "\t\t\t\t" + "Php" + sSlattettl);
        }if(ctrSlatteM > 0){
            System.out.println(" x" + mSlatteqntty + "\t(M) Spanish Latte: \t\t " +  "125.00" +  "\t\t\t\t" + "Php" + mSlattettl);
        }if(ctrSlatteL > 0){
            System.out.println(" x" + lSlatteqntty + "\t(L) Spanish Latte: \t\t " + "130.00" +  "\t\t\t\t" + "Php" + lSlattettl);
        }if(ctrVlatteS > 0){
            System.out.println(" x" + sVlatteqntty + "\t(S) Vanilla Latte: \t\t " + "105.00" +  "\t\t\t\t" + "Php" + sVlattettl);
        }if(ctrVlatteM > 0){
            System.out.println(" x" + mVlatteqntty + "\t(M) Vanilla Latte: \t\t " + "115.00" +  "\t\t\t\t" + "Php" + mVlattettl);
        }if(ctrVlatteL > 0){
            System.out.println(" x" + lVlatteqntty + "\t(L) Vanilla Latte: \t\t " + "130.00" +  "\t\t\t\t" + "Php" + lVlattettl);
        }if(ctrCaramelS > 0){
            System.out.println(" x" + sCaramelqntty + "\t(S) Caramel Machiatto: \t\t " + "120.00" +  "\t\t\t\t" + "Php" + sCaramelttl);
        }if(ctrCaramelM > 0){
            System.out.println(" x" + mCaramelqntty + "\t(M) Caramel Machiatto: \t\t " + "135.00" +  "\t\t\t\t" + "Php" + mCaramelttl);
        }if(ctrCaramelL > 0){
            System.out.println(" x" + lCaramelqntty + "\t(L) Caramel Machiatto: \t\t " + "140.00" +  "\t\t\t\t" + "Php" + lCaramelttl);
        }if(ctrWaffle > 0){
            System.out.println(" x" + waffleqntty + "\t    Waffle: \t\t\t " + "105.00" +  "\t\t\t\t" + "Php" + wafflettl);
        }if(ctrCroissant > 0){
            System.out.println(" x" + crntqntty + "\t    Croissant: \t\t\t " + "115.00" +  "\t\t\t\t" + "Php" + crntttl);
        }if(ctrCinammon > 0){
            System.out.println(" x" + cnmrlqntty + "\t    Cinnamon Roll: \t\t " + "125.00" +  "\t\t\t\t" + "Php" + cnmrlttl);
        }if(ctrCroffle > 0){
            System.out.println(" x" + crflqntty + "\t    Croffle: \t\t\t " + "125.00" +  "\t\t\t\t" + "Php" + crflttl);}

        ttlBalance = ((total + vat) - (ttlDeduct));
        System.out.println("\n\n");
        System.out.println("\t\t\t\t\t\tTotal items: \t\tx" + "(" + itemCtr + ")");
        System.out.println("\t\t\t\t\t\tSubtotal: \t\tphp" + total);
        System.out.println("\t\t\t\t\t\t\t--------------------");
        System.out.println("\t\t\t\t\t\tVAT: \t\t\t php" + vat);
        System.out.println("\t\t\t\t\t\tTotal Discount: \t-php" + ttlDeduct);
        System.out.println("\t\t\t\t\t\tTOTAL BALANCE:\t\t php" + ttlBalance);
        System.out.println("\n================================================================================");
    }//receipt()
 
    public static void doPayment(){
        Scanner scan = new Scanner(System.in);
                        do{
                System.out.print("\nPlease enter the amount to pay:\t");
                payment = scan.nextDouble();

                        if(payment >= ttlBalance){
                        change = (payment-ttlBalance);
                        
                        System.out.println("\nPAYMENT: \t\t\tphp" + (payment));
                        System.out.println("CHANGE: \t\t\tphp" + (change));
                        System.out.println("\n-------------------------------------\nORDERS RECIEVED, THANK YOU SO MUCH!\n-------------------------------------\n");
                        System.exit(0);
                    }if(payment<ttlBalance){
                        System.out.println("\n-------------------------------------\nINSUFFICIENT FUNDS! PLEASE TRY AGAIN TO PROCEED.\n-------------------------------------\n");
                    }
                    }while(payment!=0);
    }//doPayment()
    
}//PUBLIC CLASS