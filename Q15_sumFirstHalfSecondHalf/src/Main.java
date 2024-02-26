//Question 15
//        Write a function that will return 1 if an integer array satisfies the following conditions and returns 0 otherwise.
//        1. it has even numbers of elements
//        2. Sum of all the numbers in the first half of the array is equal to the sum of all the numbers in the second half of the array.
//
//        If you are programming in Java, the function Signature is
//        int answerThree(int[] a)
//        Examples
//        -------------------|--------|-----------------------------------------------------------------------
//        | a                 | return | Explanation                                                           |
//        |-------------------|--------|-----------------------------------------------------------------------|
//        | {5,4,3,2,3,4,6,1} | 1      | *There are 8 (even) number of elements in the array. Thus condition 1 |
//        |                   |        | satisfied.                                                            |
//        |                   |        | *The sum of all the numbers in the first half = 5+4+3+2 = 14          |
//        -------------------|--------|-----------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        int [] array = {1,5,4,3,2,3,4,6,1,2};

        System.out.println(answerThree(array));
    }

    public static int answerThree(int [] array)
    {

        if(array.length % 2 != 0)
        {
            return 0;
        }
        else
        {
            int sumOfFirstHalf = 0;
            int sumOfSecondHalf = 0;
            for(int counter = 0; counter < array.length; counter++)
            {
                if(counter < (array.length / 2))
                {
                    sumOfFirstHalf += array[counter];
                }
                else
                {
                    sumOfSecondHalf  += array[counter];
                }
            }

            if(sumOfFirstHalf  == sumOfSecondHalf)
                return 1;
            else
                return 0;
        }
    }
}