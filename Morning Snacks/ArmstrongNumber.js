
    let number = prompt("Enter number: ");
//    String numberString = String.valueOf(number);
    let length = number.length();
    let result = 0;    
    let sum = 0;
    let armstrong = number;
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
