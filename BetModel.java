import java.text.DecimalFormat;


 /**
 *  KenPom betting model
 *
 * Simplified algorithm. 
 *
 *  Ethan Chapman 2023
 */
 
public class BetModel {
   
   private double homeOffEff = 0;
   private double homeDefEff = 0;
   private double awayOffEff = 0;
   private double awayDefEff = 0;
   private double homePosPerGame = 0;
   private double awayPosPerGame = 0;
   
   
   /** 
   * Constructor for the BetModel.
   * Creates the model within user parameters.
   *
   * @param homeOffEffIn - used
   * @param homeDefEffIn - used
   * @param awayOffEffIn - used
   * @param awayDefEffIn - used
   * @param homePosPerGameIn - used
   * @param awayPosPerGameIn - used
   */
   public BetModel(double homeOffEffIn,
      double homeDefEffIn, double awayOffEffIn,
      double awayDefEffIn, double homePosPerGameIn,
      double awayPosPerGameIn) {
      
      setHomeOffEff(homeOffEffIn);
      setHomeDefEff(homeDefEffIn);
      setAwayOffEff(awayOffEffIn);
      setAwayDefEff(awayDefEffIn);
      
      setHomePosPerGame(homePosPerGameIn);
      setAwayPosPerGame(awayPosPerGameIn);
   }

   /**
   * Creates and returns the string assigned to a created model.
   *
   * @return String created string
   */
   public String toString() {
      DecimalFormat df = new DecimalFormat("#,##0");
     // String output = "The away team has an offensive rating of "
      //   + df.format(awayOffRtg()) +  " and a deffensive rating of " 
      //   + df.format(awayDefRtg()) + " ." ;
     // output += "\nThe home team has an offensive rating of "
     //    + df.format(homeOffRtg()) +  " and a deffensive rating of " 
      //   + df.format(homeDefRtg()) + " ." ;
     // output += "\nThis game has an expected pace of " 
      //   + df.format(predictedPace()) + " possesions.";
      //output += "\n\tThe away team will finish with "
      String output = "\n\tThe away team will finish with "
         + df.format(awayPoints()) + " points.";
      output += "\n\tThe home team will finish with "
         + df.format(homePoints()) + " points.";
      return output;
   }
   
   /**
   * Sets the homeOffEff to the given variable.
   *
   * @param homeOffEffIn - used
   * @return boolean if base is set
   */
   public boolean setHomeOffEff(double homeOffEffIn) {
      boolean isHomeOffEffSet = false;
      if (homeOffEffIn > 0) {
         homeOffEff = homeOffEffIn;
         isHomeOffEffSet = true;
      }
   // returns a boolean if the given parameter is valid
      return isHomeOffEffSet;
   }
   /**
   * Retrieves the home offensive efficiencey statistic of the model.
   *
   * @return double the homeOffEff statistic of the model
   */
   public double getHomeOffEff() {
      return homeOffEff;
   }
   /**
   * Sets the homeDefEff to the given variable.
   *
   * @param homeDefEffIn - used
   * @return boolean if base is set
   */
   public boolean setHomeDefEff(double homeDefEffIn) {
      boolean isHomeDefEffSet = false;
      if (homeDefEffIn > 0) {
         homeDefEff = homeDefEffIn;
         isHomeDefEffSet = true;
      }
   // returns a boolean if the given parameter is valid
      return isHomeDefEffSet;
   }
   /**
   * Retrieves the home defensive efficiency of the model.
   *
   * @return double the homeDefEff of the model
   */
   public double getHomeDefEff() {
      return homeDefEff;
   }
   
   
   
   /**
   * Sets the awayOffEff to the given variable.
   *
   * @param awayOffEffIn - used
   * @return boolean if base is set
   */
   public boolean setAwayOffEff(double awayOffEffIn) {
      boolean isAwayOffEffSet = false;
      if (awayOffEffIn > 0) {
         awayOffEff = awayOffEffIn;
         isAwayOffEffSet = true;
      }
   // returns a boolean if the given parameter is valid
      return isAwayOffEffSet;
   }
   /**
   * Retrieves the away offensive efficiencey statistic of the model.
   *
   * @return double the awayOffEff statistic of the model
   */
   public double getAwayOffEff() {
      return awayOffEff;
   }
   /**
   * Sets the awayDefEff to the given variable.
   *
   * @param awayDefEffIn - used
   * @return boolean if base is set
   */
   public boolean setAwayDefEff(double awayDefEffIn) {
      boolean isAwayDefEffSet = false;
      if (awayDefEffIn > 0) {
         awayDefEff = awayDefEffIn;
         isAwayDefEffSet = true;
      }
   // returns a boolean if the given parameter is valid
      return isAwayDefEffSet;
   }
   /**
   * Retrieves the away defensive efficiency statistic of the model.
   *
   * @return double the awayDefEff statistic of the model
   */
   public double getAwayDefEff() {
      return awayDefEff;
   }
   
   
   
   
   /**
   * Sets the homePosPerGame to the given variable.
   *
   * @param homePosPerGameIn - used
   * @return boolean if base is set
   */
   public boolean setHomePosPerGame(double homePosPerGameIn) {
      boolean isHomePosPerGameSet = false;
      if (homePosPerGameIn > 0) {
         homePosPerGame = homePosPerGameIn;
         isHomePosPerGameSet = true;
      }
   // returns a boolean if the given parameter is valid
      return isHomePosPerGameSet;
   }
   /**
   * Retrieves the home possession per game statistic of the model.
   *
   * @return double the homePosPerGame statistic of the model
   */
   public double getHomePosPerGame() {
      return homePosPerGame;
   }
   /**
   * Sets the awayPosPerGame to the given variable.
   *
   * @param awayPosPerGameIn - used
   * @return boolean if base is set
   */
   public boolean setAwayPosPerGame(double awayPosPerGameIn) {
      boolean isAwayPosPerGameSet = false;
      if (awayPosPerGameIn > 0) {
         awayPosPerGame = awayPosPerGameIn;
         isAwayPosPerGameSet = true;
      }
   // returns a boolean if the given parameter is valid
      return isAwayPosPerGameSet;
   }
   /**
   * Retrieves the away possessions per game statistic of the model.
   *
   * @return double the awayPosPerGame statistic of the model
   */
   public double getAwayPosPerGame() {
      return awayPosPerGame;
   }
   
   
   
   // constructor for the away team's offensive rating calculation.
   
   // @return double calculated away offensive rating. 
   
   public double awayOffRtg() {
      double awayOffRtg = (awayOffEff 
         - (0.014 * awayOffEff));
      return awayOffRtg;
   }
   // constructor for the away team's defensive rating calculation.
   
   // @return double calculated away defensive rating. 
   
   public double awayDefRtg() {
      double awayDefRtg = (awayDefEff 
         + (0.014 * awayDefEff));
      return awayDefRtg;
   }
         



         
   
   // constructor for the home team's offensive rating calculation.
   
   // @return double calculated home offensive rating. 
   
   public double homeOffRtg() {
      double homeOffRtg = (homeOffEff 
         + (0.014 * homeOffEff));
      return homeOffRtg;
   }
   // constructor for the home team's defensive rating calculation.
   
   // @return double calculated home defensive rating. 
   
   public double homeDefRtg() {
      double homeDefRtg = (homeDefEff 
         - (0.014 * homeDefEff));
      return homeDefRtg;
   }
   
   // constructor for predicted pace calculation
   
   // @return double calculated predicted pace
   
   
   public double predictedPace() {
      double predictedPace = ((homePosPerGame 
         * awayPosPerGame) / 67.6);
      return predictedPace;
   }
   
   //  constructor for away points per game stat calculation
   
   
   public double awayPointsPer() {
      double awayPointsPer = (((awayOffEff 
         - (0.014 * awayOffEff)) * (homeDefEff 
         - (0.014 * homeDefEff)))
         / 100);
      return awayPointsPer;
   }
   
   //  constructor for away points per game stat calculation

   
   public double homePointsPer() {
      double homePointsPer = (((homeOffEff 
         + (0.014 * homeOffEff)) * (awayDefEff 
         + (0.014 * awayDefEff)))
         / 100);
      return homePointsPer;
   }
   
   
   
   //Constructor for away team's total point calculation
   
   public double awayPoints() {
      double awayPoints = (((((awayOffEff 
         - (0.014 * awayOffEff)) * (homeDefEff 
         - (0.014 * homeDefEff)))
         / 100) * ((homePosPerGame 
         * awayPosPerGame) / 67.6))
         / 100);
      return awayPoints;
      
   }
   
   //Constructor for home team's total point calculation
   
   public double homePoints() { 
      double homePoints = (((((homeOffEff 
         + (0.014 * homeOffEff)) * (awayDefEff 
         + (0.014 * awayDefEff)))
         / 100) * ((homePosPerGame 
         * awayPosPerGame) / 67.6))
         / 100);
      return homePoints;
   }
   
}
