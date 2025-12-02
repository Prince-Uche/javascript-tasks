import java.util.Scanner;
public class PerfectNumber{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number: ");
    int number = input.nextInt();
    int properDivisors = 0;
    int sum = 0;

    for(int divisor = 1 ; divisor < number ; divisor++){
    
    if (number % divisor == 0){
    properDivisors = divisor;
    sum += properDivisors;
     
}
}
    if (sum < 1){
    System.out.println(number+ " is not a perfect number");
}
    else if (sum == number && sum > 0){
    System.out.println(number+ " is a perfect number");
}
    else{
    System.out.println(number+ " is not a perfect number");
}
}
}
