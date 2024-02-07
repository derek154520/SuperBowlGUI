import java.util.ArrayList;
import java.io.*;  
import java.util.Scanner;
import java.io.File;
import java.lang.Math;

public class GameList{
  ArrayList<Game> superBowls = new ArrayList<Game>();

  public GameList() throws Exception{
  	File file = new File("src/main/java/SuperBowlData.txt");
  	Scanner text = new Scanner(file);
    text.nextLine();
  
    while(text.hasNextLine()){
      String newtext = text.nextLine();
      int index1 = newtext.indexOf(","); 
      int index2 = newtext.indexOf(",", index1+1); 
      int index3 = newtext.indexOf(",", index2+1); 
      int index4 = newtext.indexOf(",", index3+1); 
      int index5 = newtext.indexOf(",", index4+1); 
      int index6 = newtext.indexOf(",", index5+1); 
      int index7 = newtext.indexOf(",", index6+1); 
      int index8 = newtext.indexOf(",", index7+1); 
      int index9 = newtext.indexOf("–"); 
  
  		String numeral = newtext.substring(0, index1);
      int year = Integer.valueOf(newtext.substring(index2+2, index3-1));
      String winningTeam = newtext.substring(index3+1, index4);
      String score = newtext.substring(index4+1, index5);
      String losingTeam = newtext.substring(index5+1, index6);
      String location = newtext.substring(index7+2, index8);
      int firstScore = Integer.valueOf(newtext.substring(index4+1, index9));
      int secondScore = Integer.valueOf(newtext.substring(index9+1, index5));
      int differential = Math.abs(firstScore-secondScore);
  
      Game game1 = new Game(numeral, year, location, winningTeam, losingTeam, score, differential);
      superBowls.add(game1);
    }
  }
  
	public ArrayList<Game> getSuperBowls(){
    return superBowls;
  }

  public int numWins(String teamName){
    int wins = 0;
    for(int i = 0; i < superBowls.size(); i++){
      if(superBowls.get(i).getWinningTeam().equals(teamName)){
        wins++;
      }
    }
    return wins;
  }

	public void sortByYear(){
    for(int i = 0; i < superBowls.size(); i++){
        for (int j = i + 1; j < superBowls.size(); j++){
            int a = superBowls.get(i).getYear();
            int b = superBowls.get(j).getYear();
            if (a > b){
                Game temp = superBowls.get(i);
                superBowls.set(i, superBowls.get(j));
                superBowls.set(j, temp);
            }
        }
    }
  }

  public void sortByWinningTeam(){
    for(int i = 0; i < superBowls.size(); i++){
        for (int j = i + 1; j < superBowls.size(); ++j){
            String a = superBowls.get(i).getWinningTeam();
            String b = superBowls.get(j).getWinningTeam();
            int compare = a.compareTo(b);
            if (compare > 0){
                Game temp = superBowls.get(i);
                superBowls.set(i, superBowls.get(j));
                superBowls.set(j, temp);
            }
        }
    }
  }

  public void sortByPointDifferential(){
    for(int i = 0; i < superBowls.size(); i++){
        for (int j = i + 1; j < superBowls.size(); j++){
            int a = superBowls.get(i).getPointDifferential();
            int b = superBowls.get(j).getPointDifferential();
            if (a < b){
                Game temp = superBowls.get(i);
                superBowls.set(i, superBowls.get(j));
                superBowls.set(j, temp);
            }
        }
    }
  }
}