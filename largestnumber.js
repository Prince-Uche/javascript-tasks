	let numbers = [15, 4, 27, 2, 32, 71, 2]; 

	let largestNumber = numbers[0];
	let secondLargest = 0;

	for(let index = 0;  index < numbers.length; index++)
		if(largestNumber < numbers[index])
		   largestNumber = numbers[index];		
		
	for(let count = 0;  count < numbers.length; count++)
	if (numbers[count] > secondLargest && numbers[count] != largestNumber)

		secondLargest = numbers[count];

		console.log("The second largest number is " + secondLargest);
		console.log("The largest Number is " + largestNumber);
