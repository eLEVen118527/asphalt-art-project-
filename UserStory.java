import java.util.Scanner;

public class UserStory {
// Array to store each food item and other information. 
private String[] FoodName;
private int[] Calories;
private int[] Carbs;
private double[] Protein;
private double[] Fat;
private String[] Source;

// prints out healthiest food in console.
public String getHealthFood() {
if (FoodName.length == 0){ // sets to 0 if there is no food and returns a string of nothing.
return ""; 
}
int food = 0; // stores the index of the healthiest food found.
for (int i = 0; i < Calories.length; i++) { // iterates through every food item. 
if (Calories[i] <= 120) { // if the food has 120 calories or fewer it updates the food to the lowest possible index. 
food = i; 
  }
} 


return "\n" + "Lowest Calorie Food: " + FoodName[food] + " - Calories: " + Calories[food] // prints result in console. 
  + ", Carbs: " + Carbs[food] 
  + ", Protein: " + Protein[food]
  + ", Fat: " + Fat[food] 
  + ", (Source: " + Source[food] + ") ";
}

// constructor for UserStory; loads text files. 
//instance variable that refers to specific method and changes the variable. 
public UserStory(String FoodNameFile, String CaloriesFile, String CarbsFile, String ProteinFile, String FatFile, String SourceFile) {
this.FoodName = FileReader.toStringArray(FoodNameFile);
this.Calories = FileReader.toIntArray(CaloriesFile);
this.Protein = FileReader.toDoubleArray(ProteinFile);
this.Carbs = FileReader.toIntArray(CarbsFile);
this.Fat = FileReader.toDoubleArray(FatFile);
this.Source = FileReader.toStringArray(SourceFile);
}

  // to string method that prints the food info.
  public String toString() {
String result = "Nutrition Analyist:\n"; // title 
  
for (int i = 0; i < FoodName.length; i++) { // loops through every item. 
result += "\n" + "\n" + "Food: " + FoodName[i] // prints all lists by adding the resulting String. 
+ " - Calories: " + Calories[i]
+ " - Protein: " + Protein[i]
+ " - Carbs: " + Carbs[i]
+ " - Fats: " + Fat[i]
+ " - (Source: " + Source[i] +")";
result += "\n"; // sets up new line
}
return result; // final return in console. 
  }
}