import java.util.Scanner;
public class LCM{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int firstNumber = input.nextInt();
    System.out.println("Enter second number: ");
    int secondNumber = input.nextInt();
    int product = firstNumber * secondNumber;
    int gcd = 0;
    int lcm = 0;
    int smallestNumber = (firstNumber < secondNumber ? firstNumber : secondNumber);
    for (int count = 1 ; count <= smallestNumber ; count++){
    if (firstNumber % count == 0 && secondNumber % count == 0){
    gcd = count;
    lcm = product / gcd;
    }
    }
    System.out.println(lcm);
}
}
