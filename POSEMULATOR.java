public class PosEmulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("WELCOME TO KAPEniTON! \n\na. - ADD ORDER\nb. - VIEW CART\nc. - PROCEED TO CHECKOUT\nd. - EXIT PROGRAM");
        System.out.println();
        String choice1 = scan.nextLine();
        
        String drink="";
        double price=0.00D, total=0.00D;
        
        
        switch (choice1){
            case "a":
                
        System.out.println("========================");
        System.out.println("\t MENU");
        System.out.println("========================");
        System.out.println("\nDRINKS\t\t\t\t\tSMALL\t\t\t\tMEDIUM\t\t\t\tLARGE\n");
        System.out.println("AMERICANO \t\t\t [A1] - Php75.00 \t\t [A2] - Php85.00 \t\t [A3] - Php90.00");
        System.out.println("SPANISH LATTE \t\t\t [S1] - Php110.00 \t\t [S2] - Php125.00 \t\t [S3] - Php130.00");
        System.out.println("VANILLA LATTE \t\t\t [V1] - Php105.00 \t\t [V2] - Php115.00  \t\t [V3] - Php130.00");
        System.out.println("CARAMEL MACHIATTO \t\t [C1] - Php120.00 \t\t [C2] - Php135.00  \t\t [C3] - Php140.00");
        System.out.println("MATCHA ESPRESSO \t\t [M1] - Php115.00 \t\t [M2] - Php125.00  \t\t [M3] - Php140.00");
        System.out.println("\nPASTRIES\n");
        System.out.println("WAFFLES \t\t\t [P1] - Php105.00 \nCROISSANT \t\t\t [P2] - Php115.00 \nCROFFLE \t\t\t [P3] - Php125.00 \nCINNAMON ROLL \t\t\t [P4] - Php125.00");
        
        System.out.print("\nPlease enter order code (Ex. A1): ");
        String order = scan.nextLine();
        
        if ("a1".equals(order) || "A1".equals(order)){
                drink = "Americano (Small) -  Php75.00";
                price =+ 75.00D;
                total =+ price;
                
                System.out.print("\nPlease enter quantity: ");
                int qnt = scan.nextInt();
                
                total =+ (price)*(qnt);
                
                System.out.println("\nDrink: " + drink + "\nTotal: " + "Php" + total);
            }
        break;
        
        
        
        } //SWITCH
    }//PSVM
}//PUBLIC CLASS
