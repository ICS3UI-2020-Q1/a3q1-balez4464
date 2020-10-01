import java.util.Scanner;

/**
 *Program gives user his maximum number
 * @author Zachary Balean
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // creates Scanner
    Scanner input = new Scanner(System.in);

    //asks and allows user to input their numbers
    System.out.println("Please enter three integers on separate lines");
    int firstNumber = input.nextInt();
    int secondNumber = input.nextInt();
    int thirdNumber = input.nextInt();   

    //finds maximum number
    if(firstNumber >= secondNumber && firstNumber >= thirdNumber){
      System.out.println("Maximum: " + firstNumber);
    } else if(secondNumber >= firstNumber && secondNumber >= thirdNumber){
      System.out.println("Maximum: " + secondNumber);
    }else{
      System.out.println("Maximum: " + thirdNumber);
    }

  }
}
