import java.util.Scanner;
public class Factorial{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int number = input.nextInt();
    int result = 1;  
    for(int count = 1 ; count < number + 1 ; count++){
    result *= count;
}        
    System.out.println(result);

}
}
