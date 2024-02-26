//Question 13
//        Consider the positive integer 50. Note that 50 = 25 + 25 = 5^2 + 5^2 and 50 = 1 + 49 = 1^2 + 7^2,
//        Thus 50 can be expressed as a sum of the two squares in two different ways.
//        Write a method whether or not a positive integer n can be expressed as a sum of two squares in
//        exactly two different ways.
//        The signature of the function is
//        int answerOne(int n)
public class Main {
    public static void main(String[] args) {
        int n =  41;

        System.out.println(answerOne(n));
    }

    public static int answerOne(int n)
    {
        int sumOfSquares;
        int sumOfSquaresWays = 0;
        int outer = 1;

        //We will be needing a nested loop for this because in order to check if the given number has sum of squares, we have to try
        //different square combinations and add them together. I'm not sure if the instruction includes 0, because if it does,
        //all perfect squares have sum of squares because when you square 0 and add the perfect square, it will result to the perfect square
        // itself. But by Occam's /Ockham's Razor theory, it is logical to assume that 0 shouldn't be included.

        //So what we're doing here is that we start the outer loop with 1 and the inner loop with 1. On the first iteration of the
        //outer loop it adds 1 squared to all the possible squares that are less than the given number n. So it goes like 1*1 + 1*1,
        //1*1 + 2*2, 1*1 + 3*3 .. and so on and so forth. At the end of the inner loop execution, we have had checked if the 1*1 has a matching
        //square that when added together will equal the given number n.
        while(outer * outer <= n )
        {
            int inner = 1;
            sumOfSquares = 0;
            while(sumOfSquares < n)
            {
                sumOfSquares = (outer * outer) + (inner * inner);
                if(sumOfSquares == n)
                {
                    //Everytime there is a match, meaning when we square the outer number and the inner number and add them both, and they
                    //equal to n, we increment sumOfSquares. We then break the inner loop because it wouldn't make sense if we continue
                    //it because for sure, the remaining squares when added will be more than the given number n. Or maybe we also don't have
                    //to break because it will give a false boolean value in the inner while anyway. But just so that the loop stops immediately
                    //let's just break it shall we? Sometimes it's right to break things even if it isn't easy.
                    sumOfSquaresWays++;
                    break;
                }
                inner++;
            }
            outer++;
            //Everytime we exit the inner loop, we have to check if the sumOfSquareWays had already equaled to 2 because this is all we need.
            //When we have 2 already, we can safely return 1 instead of having to go through the whole nested loop. Why try to continue searching
            //if you already found what you needed? Haaayss :(
            if(sumOfSquaresWays == 2)
                return 1;
        }

        //If the whole nested loop is done executing, and we still couldn't reach sumOfSquareWays == 2,
        // this means we couldn't find what we were looking for.
        //Maybe in another country, in another place, in another universe, in another timeline who knows. Don't settle, just keep searching.
        return 0;
    }
}