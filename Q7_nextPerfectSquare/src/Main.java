//Question 7
//        Write a function nextPerfectSquare that returns the first perfect square that is greater than
//        it's integer argument. A perfect square is an integer that is equal to some integer squared.
//
//        For example 16 is a perfect square because 16 = 4*4. However 15 is not a perfect square because
//        there is no integer n such that 15 = n*n.
//
//        The signature of the function is
//        int isPerfectSquare(int n)
//        Examples
//        -------------------------|--------------------------------------------------------------
//        | n                       | next perfect square                                          |
//        |-------------------------|--------------------------------------------------------------|
//        | 6                       | 9                                                            |
//        |-------------------------|--------------------------------------------------------------|
//        | 36                      | 49                                                           |
//        |-------------------------|--------------------------------------------------------------|
//        | 0                       | 1                                                            |
//        |-------------------------|--------------------------------------------------------------|
//        | -5                      | 0                                                            |
//        -------------------------|--------------------------------------------------------------

public class Main {
    public static void main(String[] args) {
    int a = -5;

    System.out.println(nextPerfectSquare(a));
    }

    public static int nextPerfectSquare(int a)
    {
        int perfectSquare  = 0;
        int counter = 0;
        //In here we perform a square of each number and if a certain square is greater than the given number a,
        //that means that's the perfect square right next to it. Please take note that all negative numbers
        //have 0 as the next perfect Square.

        while(perfectSquare <= a)
        {
            perfectSquare  = counter * counter;
            counter++;
        }
        return perfectSquare;
    }
}