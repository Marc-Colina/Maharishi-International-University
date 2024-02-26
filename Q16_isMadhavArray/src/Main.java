// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int [] a =  {3,1,2,3,0};

        System.out.println(isMadhavArray(a));
    }

    public static int isMadhavArray(int[] a)
    {
        boolean isValidLength = false;

        for(int n  = 0; n < a.length; n ++)
        {
            if(a.length == n * (n+1) / 2)
                isValidLength = true;
        }

        if(!isValidLength)
            return 0;
        else
        {
            int intervalLimit = 2;
            int sum = 0;
            int intervalCounter = 0;
            for(int counter = 1 ; counter< a.length; counter++)
            {

                sum += a[counter];
                intervalCounter++;
                if(intervalCounter == intervalLimit)
                {
                    if(a[0] != sum)
                        return 0;
                    sum = 0;
                    intervalLimit++;
                    intervalCounter = 0;
                }
            }
        }
        return 1;


    }
}