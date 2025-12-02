import java.util.Scanner;
public class ArmstrongNumber{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number: ");
    int number = input.nextInt();
    String numberString = String.valueOf(number);
    int length = numberString.length();
    int result = 0;    
    int sum = 0;
    int armstrong = number;
    while (number != 0 ){
    result = number % 10;
    sum += Math.pow(result, length);
    number = number / 10;
}
    if (sum == armstrong){
    System.out.println("This is an Armstrong number");
}
    else{
    System.out.println("This is NOT an Armstrong number");
}
}
}
