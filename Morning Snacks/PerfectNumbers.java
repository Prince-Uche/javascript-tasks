public class PerfectNumbers{
    public static void main(String[] args){  
    int factorSum = 0;
    int number = 1000;
    for(int count = 1; count <= number; count++){
    if(number % count == 0){
    factorSum += count;
    System.out.println(count);  
}
}
}
}
