public class PrintArmstrong{
    public static void main(String[] args){
    int number = 1000;
    String numberString = String.valueOf(number);
    int length = numberString.length();
    int result = 0;
    int sum = 0;
    while (number != 0 ){
    result = number % 10;
    sum = (int)Math.pow(result, length);
    number = number / 10;
    System.out.println(sum);   
}
}
}
