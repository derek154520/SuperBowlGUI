public class Game{
  String numeral;
  int year;
  String location; 
  String winningTeam;
  String losingTeam;
  String score;
  int pointDifferential;

  public Game(String n, int y, String loc, String w, String los, String s, int diff){
    numeral = n;
    year = y;
    location = loc;
    winningTeam = w;
    losingTeam = los;
    score = s;
    pointDifferential = diff;
  }

  public void setNumeral(String n){
    numeral = n;
  }

  public void setYear(int y){
    year = y;
  }

  public void setLocation(String loc){
    location = loc;
  }

  public void setWinningTeam(String w){
    winningTeam = w;
  }

  public void setLosingTeam(String los){
    losingTeam = los;
  }

  public void setScore(String s){
    score = s;
  }

  public void setPointDifferential(int diff){
    pointDifferential = diff;
  }

  public String getNumeral(){
    return numeral;
  }

  public int getYear(){
    return year;
  }

  public String getLocation(){
    return location;
  }

  public String getWinningTeam(){
    return winningTeam;
  }

  public String getLosingTeam(){
    return losingTeam;
  }

  public String getScore(){
    return score;
  }

  public int getPointDifferential(){
    return pointDifferential;
  }

  public String toString(){
    return "\n" + "Super Bowl " + this.getNumeral() + ": " + this.getWinningTeam() + " defeated " + this.getLosingTeam() + "\n" + "Score: " + this.getScore() + "\n" + "Year: " + this.getYear() + "\n" + "Location: " + this.getLocation() + "\n";
  }
}