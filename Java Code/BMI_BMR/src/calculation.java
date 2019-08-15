
import java.util.Scanner;

class sdlc{
    void system(){
        System.out.println("BMI/BMR Calculation");
    }
}
public class calculation extends sdlc
{
    public static void main(String args[]) 
    {
      
      calculation obj = new calculation();
      obj.system();
      System.out.println("1) BMI/BMR for Humans\n2) BMI/BMR for Animals");
      Scanner sc = new Scanner(System.in);
      switch (sc.nextInt()){
          case 1:
              System.out.println("You chose calculation for humans");
              break;
          case 2:
              System.out.println("You chose calculation for animals");
              break;
      }
      System.out.print("Input weight in kilogram: ");
      double weight = sc.nextDouble();
      System.out.print("\nInput height in meters: ");
      double height = sc.nextDouble();
      double BMI = weight / (height * height);
      System.out.print("\n Body Mass Index (BMI) is " + BMI + " kg/m2");
      while (BMI<18.5){
           System.out.println("\nUnderweight");
           break;
      }
      while (BMI>25.5){
           System.out.println("\nOverweight");
           break;
      }
      System.out.println("\nEnter age in years:");
      int age = sc.nextInt();
      double BMRw = (10 * weight) + (.625 * height) - (5 * age) - 161;
      double BMRm = (10 * weight) + (.625 * height) - (5 * age) + 5;
      System.out.println("Basal Metabolic Rate (BMR) for female is: " + BMRw);
      System.out.println("Basal Metabolic Rate (BMR) for male is: " + BMRm);
}     
    }

