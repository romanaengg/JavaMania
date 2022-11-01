import java.util.Scanner;
public class BlackJack {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.err.println("Do you have a knack for Black Jack?");
        System.out.println("\nWe shall see!...Ready? Press anything to begin!");
        scan.nextLine();
        int playerCard1= randomCard();
        int playerCard2= randomCard();
        System.out.println("\nYou get a "+playerCard1);
        System.out.println( cardString(playerCard1));
        System.out.println("\nand a "+playerCard2);
        System.out.println( cardString(playerCard2));
        int yourTotal= Math.min(playerCard1,10)+Math.min(playerCard2,10);
        System.out.println("your total is: "+yourTotal);
        if(yourTotal>21){
            System.out.println("\nBust! Player loses");
            System.exit(0);}
        
        int dealerFirstCard = randomCard();
        int faceDownCard = randomCard();
        int dealerTotal=Math.min(dealerFirstCard,10)+Math.min(faceDownCard,10);
        System.out.println("\nThe dealer shows \n");
        System.out.println( cardString(dealerFirstCard));
         System.out.println(" and has a card facing down" );
         System.out.println( faceDown());
         System.out.println("\nThe dealer's total is hidden");
        
            while (true){
                String option= hitOrStay();
                if(option.equalsIgnoreCase("stay")){
                    break;
                }
                int newPlayerCard= randomCard();
                yourTotal+= Math.min(newPlayerCard,10);
                System.out.println("\nYou got a\n");
                System.out.println(cardString(newPlayerCard));
                System.out.println("your new total is "+yourTotal);
                if(yourTotal>21){
                    System.out.println("\nBust! Player loses");
                    System.exit(0);}
                
        }
        System.out.println("\nDealer's turn");
        System.out.println("\n The dealr's cards are\n");
        System.out.println(cardString(dealerFirstCard)+"\n"+cardString(faceDownCard));
        System.out.println("Dealer's total is: "+dealerTotal+"\n");
        while(dealerTotal<17){
            int newDealerCard = randomCard();
            dealerTotal+=Math.min(newDealerCard,10);
            System.out.println("Dealer draws a\n "+cardString(newDealerCard));
            System.out.println("Dealer's total is: "+dealerTotal);
            if(dealerTotal>21){
                System.out.println("\nBust! Computer loses");
                System.exit(0);}
            
        }   
        if(yourTotal>dealerTotal){
            System.out.println("Whoo..ho..,Player wins!");
        } else if(yourTotal<dealerTotal){
            System.out.println("oops! dealer wins!");
        } else{
            System.out.println("Wow, It's a tie");
            
        }
        scan.close();
    }
    /** Function name – randomCard
     * @return (int)
     *
     * Inside the function:
     *   1. Gets a random number between 1 and 13.
     *   2. Returns a card.
     */
    public static int randomCard(){
        double random = (Math.random()*12)+1;
        int randomCard = (int)random;
        return randomCard;
    }
    /**
     * Function printCard
     * print a card
     */
    public static String cardString (int randomCard){
        switch (randomCard){
            case 1:return 
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
            case 2:return
            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
            case 3: return
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";
            case 4: return
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
            case 5: return
            "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";
            case 6: return 
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";
            case 7: return
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
            case 8: return
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
            case 9: return 
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";
            case 10: return
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
            case 11: return 
            "   _____\n" +
            "  |J  ww|\n"+ 
            "  | o {)|\n"+ 
            "  |o o% |\n"+ 
            "  | | % |\n"+ 
            "  |__%%[|\n";
            case 12: return
            "   _____\n" +
            "  |Q  ww|\n"+ 
            "  | o {(|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%O|\n";
            case 13: return
            "   _____\n" +
            "  |K  WW|\n"+ 
            "  | o {)|\n"+ 
            "  |o o%%|\n"+ 
            "  | |%%%|\n"+ 
            "  |_%%%>|\n";
            default: return "";

        }
      

    }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }

   /** Function name – hitOrStay
     * @return (String)
     *
     * Inside the function:
     *   1. Asks the user to hit or stay.
     *   2. If the user doesn't enter "hit" or "stay", keep asking them to try again by printing:
     *      Please write 'hit' or 'stay'
     *   3. Returns the user's option 
     */
    public static String hitOrStay(){
        System.out.print("Please enter 'hit' or 'stay' :");
        String option = scan.nextLine();
        
            while (!(option.equalsIgnoreCase("hit") || option.equalsIgnoreCase("stay"))){
                System.out.println("Please write 'hit' or 'stay'");
                option=scan.nextLine();
            }
                return option;
        }
        
        
    
}
