package org.cruz_shaun;
import java.util.Scanner;
/*NOTES SO FAR: (MAGLAGAY KAYO DITO IF MAY NADISCOVER PA KAYO)
1. Wala pang loop pag wala sa choice ung input nila.
2. Ung mAmericano and lAmericano ag inorder mo sila ng mag isa hindi nattrigger yung quantity and total price for that pero sa subtotal and emes gumagana.
3. No applied methods yet.
*/
public class POS_EMULATOR {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        //PRICES OF DRINKS
        double sAmericano = 75.00D, mAmericano = 85.00D, lAmericano = 90.00D, sSlatte = 110.00D, mSlatte = 125.00D, lSlatte = 130.00D;
        double sVlatte = 105.00D, mVlatte = 115.00D, lVlatte = 130.00D, sCaramel = 120.00D, mCaramel = 135.00D, lCaramel = 140.00D;
        //PRICES OF PASTRIES
        double wfl = 105.00D, crsnt = 115.00D, crfl = 125.00D, cnmrl = 125.00D;
        //MGA PERA
        double sAmericanottl=0, mAmericanottl=0, lAmericanottl=0, sSlattettl=0, mSlattettl=0, lSlattettl=0, sVlattettl=0, mVlattettl=0, lVlattettl=0, sCaramelttl=0, mCaramelttl=0, lCaramelttl=0, wafflettl=0, crntttl=0, cnmrlttl=0, crflttl=0, ttlDeduct=0, vat, payment, change;
        //INPUTS OF USER
        String orderCode, choice, choice2;
        //PANG TRIGGER SA RECEIPT (we use ctr to display na choice of drinks(size included) basta mag ctr>0 lalabas na yan sa receipt)
        int ctrAmericanoS=0, ctrAmericanoM=0, ctrAmericanoL=0, ctrSlatteS=0, ctrSlatteM=0, ctrSlatteL=0, ctrVlatteS=0, ctrVlatteM=0, ctrVlatteL=0, ctrCaramelS=0, ctrCaramelM=0, ctrCaramelL=0, ctrWaffle=0, ctrCroissant=0, ctrCinammon=0, ctrCroffle=0;
        /*
        for this one naman, we use different qntty variable for each product para pag sa receipt makikita mo kung ilan ung bibilin, naka increment 
        din yan kada input so whenever uulisin ni user na orderin yon, madadagdagan ung qntty instead na mapalitan yung value at all.
        */
        int itemCtr, sAmericanoqntty=0, mAmericanoqntty=0, lAmericanoqntty=0, sSlatteqntty=0, mSlatteqntty=0, lSlatteqntty=0, sVlatteqntty=0, mVlatteqntty=0, lVlatteqntty=0, sCaramelqntty=0, mCaramelqntty=0, lCaramelqntty=0, waffleqntty=0, crntqntty=0, cnmrlqntty=0, crflqntty=0;
        
        System.out.print("WELCOME TO KAPEniTON! \nContinue? [Y/N]: ");
        String ordering = scan.nextLine();
        
        while (ordering.equalsIgnoreCase("Y")){
            System.out.println("\nKAPEniTON");
            System.out.println("\n1. Add order\n2. Proceed to Checkout\n3. Exit/cancel Program\n");
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

            System.out.print("\n ENTER ORDER CODE (a1/A1): ");
            orderCode = scan.nextLine();
            //ORDER CODES
                    if(orderCode.equalsIgnoreCase("A1")){ //SMALL AMERICANO
                        System.out.println("\n[S] Americano - Php 75.00");
                        System.out.print("Enter Quantity: ");
                        sAmericanoqntty += scan2.nextInt();
                        
                        sAmericanottl = (sAmericano * sAmericanoqntty);
                        ctrAmericanoS++;
                        System.out.println("------------------------------");//<- USED TO DIVIDE CONTENTS TO MINIMIZE CONFUSIONS
                    }else if(orderCode.equalsIgnoreCase("A2")){ //MEDIUM AMERICANO
                        System.out.println("\n[M] Americano - Php 85.00");
                        System.out.print("Enter Quantity: ");
                        mAmericanoqntty += scan2.nextInt();
                        
                        mAmericanottl = (mAmericano * mAmericanoqntty);                   
                        ctrAmericanoM++;
                    }else if(orderCode.equalsIgnoreCase("A3")){ //LARGE AMERICANO
                        System.out.println("\n[L] Americano - Php 90.00");
                        System.out.print("Enter Quantity: ");
                        lAmericanoqntty += scan.nextInt();
                        
                        lAmericanottl = (lAmericano * lAmericanoqntty);                  
                        ctrAmericanoL++;
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("S1")){ //SMALL SPANISH LATTE
                        System.out.println("\n[S] Spanish Latte - Php 110.00");
                        System.out.print("Enter Quantity: ");
                        sSlatteqntty += scan2.nextInt();
                        
                        sSlattettl = (sSlatte * sSlatteqntty);
                        ctrSlatteS++;
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("S2")){ //MEDIUM SPANISH LATTE
                        System.out.println("\n[M] Spanish Latte - Php 110.00");
                        System.out.print("Enter Quantity: ");
                        mSlatteqntty += scan2.nextInt();
                        
                        mSlattettl = (mSlatte * mSlatteqntty);
                        ctrSlatteM++;
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("S3")){ //LARGE SPANISH LATTE
                        System.out.println("\n[L] Spanish Latte - Php 130.00");
                        System.out.print("Enter Quantity: ");
                        lSlatteqntty += scan2.nextInt();

                        lSlattettl = (lSlatte * lSlatteqntty);
                        ctrSlatteL++;
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("V1")){ //SMALL VANILLA LATTE
                        System.out.println("\n[S] Vanilla Latte - Php 105.00");
                        System.out.print("Enter Quantity: ");
                        sVlatteqntty += scan2.nextInt();

                        sVlattettl = (sVlatte * sVlatteqntty);
                        ctrVlatteS++;
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("V2")){ //MEDIUM VANILLA LATTE
                        System.out.println("\n[M] Vanilla Latte - Php 115.00");
                        System.out.print("Enter Quantity: ");
                        mVlatteqntty += scan2.nextInt();

                        mVlattettl = (mVlatte * mVlatteqntty);
                        ctrVlatteM++;
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("V3")){ //LARGE VANILLA LATTE
                        System.out.println("\n[L] Vanilla Latte - Php 130.00");
                        System.out.print("Enter Quantity: ");
                        lVlatteqntty += scan2.nextInt();

                        lVlattettl = (lVlatte * lVlatteqntty);
                        ctrVlatteL++;    
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("C1")){ //SMALL CARAMEL MACHIATTO
                        System.out.println("\n[S] Caramel Machiatto - Php 120.00");
                        System.out.print("Enter Quantity: ");
                        sCaramelqntty += scan2.nextInt();

                        sCaramelttl = (sCaramel * sCaramelqntty);
                        ctrCaramelS++;   
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("C2")){ //MEDIUM CARAMEL MACHIATTO
                        System.out.println("\n[M] Caramel Machiatto - Php 135.00");
                        System.out.print("Enter Quantity: ");
                        mCaramelqntty += scan2.nextInt();

                        mCaramelttl = (mCaramel * mCaramelqntty);
                        ctrCaramelM++;
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("C3")){ //LARGE CARAMEL MACHIATTO
                        System.out.println("\n[L] Caramel Machiatto - Php 140.00");
                        System.out.print("Enter Quantity: ");
                        lCaramelqntty += scan2.nextInt();

                        lCaramelttl = (lCaramel * lCaramelqntty);
                        ctrCaramelL++;
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("P1")){ //WAFFLES
                        System.out.println("\nWaffles - Php 105.00");
                        System.out.print("Enter Quantity: ");
                        waffleqntty += scan2.nextInt();

                        wafflettl = (wfl * waffleqntty);
                        ctrWaffle++;
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("p2")){ //CROISSANT
                        System.out.println("\nCroissant - Php 115.00");
                        System.out.print("Enter Quantity: ");
                        crntqntty += scan2.nextInt();

                        crntttl = (crsnt * crntqntty);
                        ctrCroissant++;
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("P3")){ //CROFFLE
                        System.out.println("\nCroffle - Php 125.00");
                        System.out.print("Enter Quantity: ");
                        crflqntty += scan2.nextInt();

                        crflttl = (crfl * crflqntty);
                        ctrCroffle++;
                        System.out.println("------------------------------");
                    }else if(orderCode.equalsIgnoreCase("P4")){ //CINNAMON ROLL
                        System.out.println("\nCinammon Roll - Php 125.00");
                        System.out.print("Enter Quantity: ");
                        cnmrlqntty += scan2.nextInt();

                        cnmrlttl = (cnmrl * cnmrlqntty);
                        ctrCinammon++;
                        System.out.println("------------------------------");
                    }else{//ERROR/INVALID INPUT
                        System.out.println("\nINVALID INPUT!, PLEASE TRY AGAIN.");
                        System.out.println("------------------------------");
                    }
            }//IF EQUAL1
            //PROCEEDING CHECKOUT
            double total = sAmericanottl + mAmericanottl + lAmericanottl + sSlattettl + mSlattettl + lSlattettl + sVlattettl + mVlattettl + lVlattettl + sCaramelttl + mCaramelttl + lCaramelttl + wafflettl + crntttl + cnmrlttl + crflttl;
            itemCtr = sAmericanoqntty + mAmericanoqntty + lAmericanoqntty + sSlatteqntty + mSlatteqntty + lSlatteqntty + sVlatteqntty + mVlatteqntty + lVlatteqntty + sCaramelqntty + mCaramelqntty + lCaramelqntty + waffleqntty + crntqntty + cnmrlqntty + crflqntty;
            vat = total * 0.20;

            if(choice.equals("2")){
                System.out.print("Are you a Senior citizen/PWD [Y/N]: ");
                choice2 = scan.nextLine();

                if (choice2.equalsIgnoreCase("Y")){
                    ttlDeduct = total * 0.20;
                }
                System.out.println("\n=============================================================");
                System.out.println("\nORDERS: \t\tQUANTITY: \t\t\t PRICE: ");
                if(ctrAmericanoS > 0){
                    System.out.println("(S) Americano: \t\t " + " x" + "(" + sAmericanoqntty + ")" + "\t\t\t" + "Php" + sAmericanottl);
                }if(ctrAmericanoL > 0){
                    System.out.println("(M) Americano: \t " + " x" + "(" + mAmericanoqntty + ")" +  "\t\t\t" + "Php" + mAmericanottl);
                }if(ctrAmericanoM > 0){
                    System.out.println("(L) Americano: \t\t " + " x" + "(" + lAmericanoqntty + ")" +  "\t\t\t" + "Php" + lAmericanottl);
                }if(ctrSlatteS > 0){
                    System.out.println("(S) Spanish Latte: \t " + " x" + "(" + sSlatteqntty + ")" +  "\t\t\t" + "Php" + sSlattettl);
                }if(ctrSlatteM > 0){
                    System.out.println("(M) Spanish Latte: \t " + " x" + "(" + mSlatteqntty + ")" +  "\t\t\t" + "Php" + mSlattettl);
                }if(ctrSlatteL > 0){
                    System.out.println("(L) Spanish Latte: \t " + " x" + "(" + lSlatteqntty + ")" +  "\t\t\t" + "Php" + lSlattettl);
                }if(ctrVlatteS > 0){
                    System.out.println("(S) Vanilla Latte: \t " + " x" + "(" + sVlatteqntty + ")" +  "\t\t\t" + "Php" + sVlattettl);
                }if(ctrVlatteM > 0){
                    System.out.println("(M) Vanilla Latte: \t " + " x" + "(" + mVlatteqntty + ")" +  "\t\t\t" + "Php" + mVlattettl);
                }if(ctrVlatteL > 0){
                    System.out.println("(L) Vanilla Latte: \t " + " x" + "(" + lVlatteqntty + ")" +  "\t\t\t" + "Php" + lVlattettl);
                }if(ctrCaramelS > 0){
                    System.out.println("(S) Caramel Machiatto: \t " + " x" + "(" + sCaramelqntty + ")" +  "\t\t\t" + "Php" + sCaramelttl);
                }if(ctrCaramelM > 0){
                    System.out.println("(M) Caramel Machiatto: \t " + " x" + "(" + mCaramelqntty + ")" +  "\t\t\t" + "Php" + mCaramelttl);
                }if(ctrCaramelL > 0){
                    System.out.println("(L) Caramel Machiatto: \t " + " x" + "(" + lCaramelqntty + ")" +  "\t\t\t" + "Php" + lCaramelttl);
                }if(ctrWaffle > 0){
                    System.out.println("Waffle: \t\t " + " x" + "(" + waffleqntty + ")" +  "\t\t\t" + "Php" + wafflettl);
                }if(ctrCroissant > 0){
                    System.out.println("Croissant: \t\t " + " x" + "(" + crntqntty + ")" +  "\t\t\t" + "Php" + crntttl);
                }if(ctrCinammon > 0){
                    System.out.println("Cinnamon Roll: \t " + " x" + "(" + cnmrlqntty + ")" +  "\t\t\t" + "Php" + cnmrlttl);
                }if(ctrCroffle > 0){
                    System.out.println("Croffle: \t\t " + " x" + "(" + crflqntty + ")" +  "\t\t\t" + "Php" + crflttl);
                }

                double ttlBalance = ((total + vat) - (ttlDeduct));
                System.out.println("");
                System.out.println("\t\t\tTotal items: \t\tx" + "(" + itemCtr + ")");
                System.out.println("\t\t\tSubtotal: \t\tphp" + total);
                System.out.println("\t\t\t\t--------------------");
                System.out.println("\t\t\tVAT: \t\tphp" + vat);
                System.out.println("\t\t\tTotal Discount: \t-php" + ttlDeduct);
                System.out.println("\t\t\tTOTAL BALANCE:\tphp" + ttlBalance);
                System.out.println("\n=============================================================");

                System.out.print("\nHow much would you like to pay:\tphp");
                payment = scan.nextDouble();

                while(!(payment==0)){
                    if(payment == ttlBalance){
                        System.out.println("Orders Recieved, Thank you so much!");
                        System.exit(0);
                    }else if(payment > ttlBalance){
                        change = (payment-ttlBalance);
                        System.out.println("\nChange: \t\t\tphp" + (change));
                        System.out.println("\nOrders recieved, Thank you so much!\n");
                        System.exit(0);
                    }if(payment<ttlBalance){
                        System.out.println("\nInsufficient funds, please try again.");
                        break;
                    }
                }//WHILE OF PAYMENT
            }//IF (2)

            if("3".equals(choice)){
                System.exit(0);
            }//if (3)
            if(!(choice.equalsIgnoreCase("1")||choice.equalsIgnoreCase("2")||choice.equalsIgnoreCase("3"))){
                    System.out.println("\nINVALID INPUT!, PLEASE TRY AGAIN.");
                    System.out.println("------------------------------");
                    }
        }//WHILE  
    }//PSVM
}//PUBLIC CLASS