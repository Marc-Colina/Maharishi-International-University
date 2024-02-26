public class Recursion {

	public static void main(String[] args)
	{
//		Recursive implementation of Factorial
//		int num = 5;
//		System.out.println(" Factorial of " + num + " is: " + factorial(num));
		
		
		//Recursive implementation to reverse a string
		//String word = "Hello";
		//System.out.println("String : " + word + "\n" + "Reversed : " + reverseString(word));
		
		
		//Recursive implementation to know if an integer is arranged in strict ascending order by digit starting from the
		//left to right. Ex. 12345 is in strict ascending order. 21345 is not. 8 is in strict ascending order.
		//int num = 1;
		//System.out.println("Is the integer in strict ascending order? " + strictAscendingOrder(num));	
		
		
		//Check if a given string is a Palindrome  or not using recursion. WOW is a Palindrome. WATAW is a Palindrome.
		//POP is a Palindrom. but Hello is NOT.
//		String word = "deifieds";
//		System.out.println("Is the word " + word + " a Palindrome?: " + isPalindrome(word));
		
		
		//Calculate the power of a number using Recursion powerOfANumber(2,3) means 2 to the power of 3
		//which is 8
//		int base = 5;
//		int exponent = 3;
//		System.out.println( " " + powerOfANumber(base, exponent));
		
		
		//Get the greatest Common Divisor  Greatest Common Factor
		//System.out.println("Greatest Common Factor is : " + greatestCommonDivisor(100,10));l
		
		
		StringBuffer sb = new StringBuffer();
		sb.append("LALAMOVE");
		sb.length();
		System.out.println(sb.length());
	}
	
	public static int factorial(int num)
	{
		if(num == 1)
			return 1;
		
		return num * factorial(num-1);
	}
	
	public static String reverseString(String word)
	{
		if(word.isEmpty())
			return word;
		
		return reverseString(word.substring(1)) + word.charAt(0);

	}
	
	public static boolean strictAscendingOrder(int number) {
        return isStrictlyAscendingHelper(number, Integer.MAX_VALUE);
    }

    private static boolean isStrictlyAscendingHelper(int number, int prevDigit) {
        // Base case: If the number becomes zero, it means all digits were in ascending order
        if (number == 0) {
            return true;
        }

        // Extract the last digit
        int digit = number % 10;

        // Check if the current digit is greater than the previous one
        if (digit >= prevDigit) {
            return false;
        }

        // Recursively check the remaining digits
        return isStrictlyAscendingHelper(number / 10, digit);
    }
    
    public static boolean isPalindrome(String word)
    {
    	if(word.length() % 2 == 0)
    		return false;
    	
    	
    	return isPalindromeHelper(word, 0, word.length() - 1);
    }
    
    public static boolean isPalindromeHelper(String word, int start, int end)
    {
    	if(start == end)
    		return true;
    	
    	if(word.charAt(start) != word.charAt(end))
    		return false;
    	
    	return isPalindromeHelper(word,start+1, end-1);
    }
    
    public static int powerOfANumber(int base, int exponent)
    {
    	if(exponent <=0)
    		return 1;
    	
    	return base * powerOfANumber(base, exponent -1);
    }
    
    public static int greatestCommonDivisor(int num1, int num2)
    {
    	int greaterNumber,smallerNumber;
    	
    	
    
    	if(num1 > num2)
    	{
    		//We just add additional if statements for edge cases like if the other number is 0 or if both numbers are the
    		//same because although the algorithm can take it, we would have to start the algorithm to look for factors
    		//starting with the number itself down to 1 as opposed to starting it to the number divided by 2 because
    		//a number couldn't have a factor greater than half of it aside from the number itself.
    		//Given big numbers, it would be very expensive to start looking for factors starting with the number itself
    		//and since these cases (one number is 0 or both numbers are equal) are known and inexpensive to handle,
    		//we handle it separately. This comment applies to the if statement inside the else if and the else statement
    		//where both numbers are equal.
    		if(num2 == 0)
    			return num1;
    		
    		greaterNumber = num1;
    		smallerNumber = num2;
    	}
    	else if(num1 < num2)
    	{
    		if(num1 == 0)
    			return num2;
    		
    		greaterNumber = num2;
    		smallerNumber = num1;
    	}
    	else
    	{
    		return num1;
    	}
    	
    	return greatestCommonDivisorHelper(smallerNumber, greaterNumber,greaterNumber/2);
    }
    
    public static int greatestCommonDivisorHelper(int smallerNumber, int greaterNumber, int factor)
    {
    	
    	if(greaterNumber % factor == 0 && smallerNumber % factor == 0)
    		return factor;
    	
    	return greatestCommonDivisorHelper(smallerNumber, greaterNumber, factor -1);
    }
    
    
}
