//1. A primeproduct is a positive integer that is the product of exactly two primes greater than 1. For
//        example, 22 is primeproduct since 22 = 2 times 11 and both 2 and 11 are primes greater than 1.
//        Write a function named isPrimeProduct with an integer parameter that returns 1 if the parameter is a
//        primeproduct, otherwise it returns 0. Recall that a prime number is a positive integer with no factors
//        other than 1 and itself.
//        You may assume that there exists a function named isPrime(int m) that returns 1 if its m is a prime
//        number. You do not need to write isPrime. You are allowed to use this function.
//        The function signature
//        int isPrimeProduct(int n)

public class Main {
    public static void main(String[] args){
        int a = 22;

        System.out.println(isPrimeProduct(77));
    }


    public static int isPrimeProduct(int n)
    {
        for(int counter=2; counter <= n/2; counter++){
            if(n  % counter == 0)
                if(!isPrime(counter))
                    return 0;
        }
        return 1;
    }


    //This is another way to solve it. Got this from an answer key in a PDF given to us. Just leaving it here to
    //serve as a reminder that at one point in my life, I was smarter at solving this problem than at least one person (the person who made this code below hehe).
//    static int isprimeproduct(int n) {
//        for(int i=2; i<n; i++){
//            if(n%i==0 && isPrime(i)){
//                for(int j=i+1; j<n; j++)
//                    if(n%j==0 && isPrime(j)){
//                        if(i*j==n)
//                            return 1;
//                    }
//            }
//        }
//        return 0;
//    }


    public static boolean isPrime(int n)
    {
        //We divide the n into 2 because a number cannot have a factor bigger than its half.
        for(int counter=2; counter <= n/2; counter++){
            if(n  % counter == 0)
                return false;
        }

        return true;
    }
}

