//William Borum
//CS 220
//Exercise 3.2
import java.util.Scanner;
public class Ex3_2Borum {
  public static void main(String[] args) {
    int number1 = (int)(System.currentTimeMillis() % 10);
    int number2 = (int)(System.currentTimeMillis()/7 % 10);
    int number3 = (int)(System.currentTimeMillis()/5 % 10);
    
    //Create a Scanner
    Scanner input = new Scanner(System.in);
    
    System.out.print("What is " + number1 + " + " + number2 + " + " + number3 + "? ");
    
    int answer = input.nextInt();
    
    System.out.print(number1 + " + " + number2 + " + " + number3 + " = " + answer + " is " + (number1 + number2 + number3 == answer));
  }
}