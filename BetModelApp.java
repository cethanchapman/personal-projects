import java.util.Scanner;



 /**
 *  KenPom betting model app
 *
 * Simplified algorithm. 
 *
 *  Ethan Chapman 2023
 */

/**
* Creates prompts for user inputs of variables then calculates
* the game outcome information.
*
* @param args Command line arguments - not used
*/

public class BetModelApp {
   
   
   public static void main(String[]args) {
      Scanner user = new Scanner(System.in);
      BetModel bet = new BetModel(0,0,0,0,0,0);
   
   // initial prompt
      System.out.println("Enter statistics for predicted score.");
   
   // away team possessions per game prompt
      System.out.print("\tAway team possesions per"
         + " game: ");
      double awayPosPerGame = Double.parseDouble(user.nextLine());
      bet.setAwayPosPerGame(awayPosPerGame);
      // invalid entry prompt
      if (!bet.setAwayPosPerGame(awayPosPerGame)) {
         System.out.println("The entry must "
            + "be greater than 0.");
         return;
      }
   
   
   // away offensive efficiency prompt
      System.out.print("\tAway team points per 100 possessions: ");
      double awayOffEff = Double.parseDouble(user.nextLine());
      bet.setAwayOffEff(awayOffEff);
   // invalid entry prompt
      if (!bet.setAwayOffEff(awayOffEff)) {
         System.out.println("The entry must "
            + "be greater than 0.");
         return;
      }
   
   
   // away defensive efficiency prompt
      System.out.print("\tAway team points allowed per 100 possessions: ");
      double awayDefEff = Double.parseDouble(user.nextLine());
      bet.setAwayDefEff(awayDefEff);
   // invalid entry prompt
      if (!bet.setAwayDefEff(awayDefEff)) {
         System.out.println("The entry must "
            + "be greater than 0.");
         return;
      }
   
   // home team possessions per game prompt   
      System.out.print("\tHome team possesions per"
         + " game: ");
      double homePosPerGame = Double.parseDouble(user.nextLine());
      bet.setHomePosPerGame(homePosPerGame);
      // invalid entry prompt
      if (!bet.setHomePosPerGame(homePosPerGame)) {
         System.out.println("The entry must "
            + "be greater than 0.");
         return;
      }
   
 
   // home offensive efficiency 
      System.out.print("\tHome team points per 100 possessions: ");
      double homeOffEff = Double.parseDouble(user.nextLine());
      bet.setHomeOffEff(homeOffEff);
   // invalid entry prompt
      if (!bet.setHomeOffEff(homeOffEff)) {
         System.out.println("The entry must "
            + "be greater than 0.");
         return;
      }
    
   // home defensive efficiency prompt
      System.out.print("\tHome team points allowed per 100 possessions: ");
      double homeDefEff = Double.parseDouble(user.nextLine());
      bet.setHomeDefEff(homeDefEff);
      // invalid entry prompt
      if (!bet.setHomeOffEff(homeOffEff)) {
         System.out.println("The entry must "
            + "be greater than 0.");
         return;
      }
           
     
      
      
      System.out.println("\n" + bet);
   }
   
}
           