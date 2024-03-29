//Question 10
//        A fancy number is a number in the sequence 1,1,5,17,61,... Note the first two fancy numbers
//        are 1 and any fancy number other than the first two is sum of three times previous one and two times
//        the one before that. see below
//        1,
//        1,
//        3*1 + 2*1 = 5,
//        5*3 + 2*1 = 17,
//        17*3 + 5*2 = 61
//        Write a function named isFancy that returns 1, if it's integer argument is a Fancy number,
//        otherwise it returns 0.
public class Main {
    public static void main(String[] args) {
        int num = 34922;
        System.out.println(" " + isFancy(num));
    }

    public static int isFancy(int num)
    {
        if(num == 1)
            return 1;
        else{
            int prevNum = 1;
            int pPrevNum = 1;
            int fancyNum = 0;

            //We only continue the loop if the current fancyNum being computed is less than the num given
            //Because we will be computing all the fancy numbers until it equals to the num given.
            //if it doesn't equal to the num given and the fancyNum computation is already greater
            //than the num, meaning the num is not a fancy number
            while(fancyNum < num)
            {
                fancyNum = (3*prevNum) + (2*pPrevNum);

                //Once fancyNum equals num, we return right away to prevent further code overhead
                if(fancyNum == num)
                    return 1;

                pPrevNum = prevNum;
                prevNum = fancyNum;
            }
        }

        return 0;
    }
}