/**
* CustomClasses
* @author Jeremy Heist CMPSC 221
*/
public class Main{ 

  public static void main(String[] args) 
  {
      Chatbot siri = new Chatbot();
      siri.sportsScore();
      siri.timeAndDate();
      siri.simpleAddition();
  }


}

class Chatbot
    {
    private String sportsTeam;
    private int teamScore;
    private int opponentScore;
    private int day;
    private int month;
    private int year;
    private int hour;
    private int minute;
    private int num1;
    private int num2;
    private int sum; 
    
    public Chatbot()
    {
    sportsTeam = "Eagles";
    teamScore = 18;
    opponentScore = 12;
    day = 10;
    month = 9;
    year = 2018;
    hour = 3;
    minute = 35;
    num1 = 2;
    num2 = 3;
    sum = num1+num2;
    }
    
    
    public void sportsScore()
    {       
      if(teamScore>opponentScore)
      {
        System.out.println("The " + sportsTeam + " won " + teamScore + " to " + opponentScore);
        }
      else
      {
        System.out.println("The " + sportsTeam + " lost " + teamScore + " to " + opponentScore);
      }
    }
    public void timeAndDate()
    {
        System.out.println("It is " + hour + ":" + minute + " on " + month + "/" + day + "/" + year);
    }
    public void simpleAddition()
    {
        System.out.println(num1 + " plus " + num2 +" is equal to " + sum);
    }
}
