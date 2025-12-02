import java.util.Scanner;
public class GCD{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int firstNumber = input.nextInt();
    System.out.println("Enter second number: ");
    int secondNumber = input.nextInt();
    int firstFactors = 0;
    int secondFactors = 0;
    int gcd = 0;
    int gcdTwo = 0;
    for (int count = 1 ; count <= firstNumber ; count++){
    if (firstNumber % count == 0){
    firstFactors = count;
}  
}
    for (int index = 1 ; index <= secondNumber ; index++){
    if (secondNumber % index == 0){
    secondFactors = index;
}
    if(firstNumber % secondFactors == 0){
    gcd = secondFactors;
} 
    if(secondNumber % firstFactors == 0){
    gcdTwo = firstFactors;
}
    if (gcd >= gcdTwo){
    System.out.print(gcd);
}
}   
}
}
