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
  if (FoodName.length == 0) return "";
  int food = 0; 

  for (int i = 1; i < Calories.length; i++) { 
    if (Calories[i] < Calories[food]) { 
     food = i; 
}
  } 
return FoodName[food] + " - Calories: " + Calories[food] // returns the foods with less calories
  + ", Carbs: " + Carbs[food] 
  + ", Protein: " + Protein[food]
  + ", Fat: " + Fat[food] 
  + ", Source: " + Source[food];
}
  
// constructor for UserStory; loads text files. 
public UserStory(String FoodNameFile, String CaloriesFile, String CarbsFile, String ProteinFile, String FatFile, String SourceFile) {
this.FoodName = FileReader.toStringArray(FoodNameFile);
this.Calories = FileReader.toIntArray(CaloriesFile);
this.Protein = FileReader.toDoubleArray(ProteinFile);
this.Carbs = FileReader.toIntArray(CarbsFile);
this.Fat = FileReader.toDoubleArray(FatFile);
this.Source = FileReader.toStringArray(SourceFile);
}

  
  public String toString() {
    String result = "Nutrition Analyist:\n"; // title 
    for (int i = 0; i < FoodName.length; i++) {
      result += "Food: " + FoodName[i] // prints all lists
        + " - Calories: " + Calories[i]
        + " - Protein: " + Protein[i]
        + " - Carbs: " + Carbs[i]
        + " - Fats: " + Fat[i]
        + " - Sources: " + Source[i];
      result += "\n"; // new line
    }
    return result;
  }
}