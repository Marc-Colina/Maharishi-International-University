//Question 20
//        Consider the following algorithm
//        - Start with a positive number n
//        - if n is even then divide by 2
//        - if n is odd then multiply by 3 and add 1
//        -* continue this until n becomes 1
//
//        The Guthrie sequence of a positive number n is defined to be the numbers generated by the above algorithm.
//
//        For example, the Guthrie sequence of the number 7 is
//        7, 22, 11, 34, 17, 52, 26, 13, 40, 20, 10, 5, 16, 8, 4, 2, 1
//        It is easy to see that this sequence was generated from number 7 by the above algorithm.
//        Since 7 is odd, multiply by 3 and add 1 to get 22 which is the second number of the sequence.
//        Since 22 is even, divide by 2 to get 11 which is the third number of the sequence.
//        11 is odd, multiply by 3 and add 1 to get 34 which is the fourth number of the sequence and so on.
//
//        Note: the first number of a Guthrie sequence is always the number that generated the sequence and
//        the last number is always 1.
//
//        Write a function named isGuthrieSequence which returns 1 if the elements of the array form a
//        Guthrie sequence. Otherwise, it returns 0.
//        If you are programming in Java or c#, the function signature is
//        int isGuthrieSequence(int[] a)
//        Examples
//        -------------------------|----------|------------------------------------------------------------
//        | if a is                 | return   | reason                                                     |
//        |-------------------------|----------|------------------------------------------------------------|
//        | {8,4,2,1}               | 1        | This is the Guthrie sequence for 8                         |
//        |-------------------------|----------|------------------------------------------------------------|
//        | {8,17,4,1}              | 0        | This is not the Guthrie sequence for 8                     |
//        |-------------------------|----------|------------------------------------------------------------|
//        | {8,4,1}                 | 0        | Missing the 2                                              |
//        |-------------------------|----------|------------------------------------------------------------|
//        | {8,4,2}                 | 0        | A Guthrie sequence must end with 1                         |
//        -------------------------|----------|------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        int [] a =  {8,4,2};


        System.out.println(isGuthrieSequence(a));
    }

    public static int isGuthrieSequence(int [] a)
    {
        if(a[0] < 0 || a[a.length -1] != 1)
            return 0;

        int guthrieNumber = 0;
        for(int counter = 0; counter<a.length-1; counter++)
        {
            if(a[counter] % 2 == 0)
            {
                guthrieNumber = a[counter] / 2;
                if(a[counter+1] != guthrieNumber)
                    return 0;
            }
            else
            {
                guthrieNumber = (a[counter] * 3) + 1;
                if(a[counter+1] != guthrieNumber)
                    return 0;
            }
        }
        return 1;
    }
}