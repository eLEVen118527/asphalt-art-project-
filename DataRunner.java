import java.util.Scanner;

public class DataRunner {
  public static void 
  main(String[] args) {
// creates a new user object. 
// loads file name.
UserStory us = new UserStory
("FoodName.txt","Calories.txt",
"Carbs.txt","Protein.txt","Fat.txt",
"Source.txt");
    // Use toString() method to 
    //print out all food items 
    System.out.println(us);
System.out.println(us.getHealthFood()); // prints out the result of the getHealthFood method.

  }
}