//Question 17
//        An array is defined to be inertial if the following conditions hold:
//        a. it contains at least one odd value
//        b. the maximum value in the array is even
//        c. every odd value is greater than every even value that is not the maximum value.
//        so {11,4,20,9,2,8} is inertial because
//        - it contains at least one odd value
//        - the maximum value in the array is 20 which is even
//        - the two odd values (11 and 9) are greater than all the even values that are not
//        equal to 20 (the maximum), i.e {4,2,8}.
//        However, {12,11,4,9,2,3,10} is not inertial because it fails condition (c), i.e.
//        10 (which is even) is greater than 9 (which is odd), and 10 is not the maximum value
//        in the array.
//
//        Write a function called isInertial that accepts an integer array and returns 1 if the array
//        is inertial; otherwise it returns 0.
//        If you are programing in Java or C#, the function signature is
//        int isInertial(int[] a)
//
//        Some other examples:
//        -----------------------|--------|-----------------------------------------------------------------------
//        | if the input array is | return | reason                                                                |
//        |-----------------------|--------|-----------------------------------------------------------------------|
//        | {1}                   | 0      | fails condition (a) - the maximum value must be even                  |
//        |-----------------------|--------|-----------------------------------------------------------------------|
//        | {2}                   | 0      | fails condition (b) - the array must contain at least one odd value   |
//        |-----------------------|--------|-----------------------------------------------------------------------|
//        | {1,2,3,4}             | 0      | fails condition (c) - 1(which is odd) is not greater than all even    |
//        |                       |        | values other than the maximum (1 is less than 2 which is not the max) |
//        |-----------------------|--------|-----------------------------------------------------------------------|
//        | {1,1,1,1,1,1,2}       | 1      | there is no even number other than the maximum. Hence, there can be no|
//        |                       |        | other even values that are greater than 1.                            |
//        |-----------------------|--------|-----------------------------------------------------------------------|
//        | {2,12,4,6,8,11}       | 1      | 11, the only odd value is greater than all even values except 12 which|
//        |                       |        | is the maximum value in the array.                                    |
//        |-----------------------|--------|-----------------------------------------------------------------------|
//        | {2,12,12,4,6,8,11}    | 1      | same as previous, ie, it is ok if maximum value occurs more than once |
//        |-----------------------|--------|-----------------------------------------------------------------------|
//        | {-2,-4,-6,-8,-11}     | 0      | -8, which is even, is not the maximum value but is greater than -11   |
//        |-----------------------|--------|-----------------------------------------------------------------------|
//        | {2,3,5,7}             | 0      | the maximum value is odd                                              |
//        |-----------------------|--------|-----------------------------------------------------------------------|
//        | {2,4,6,8,10}          | 0      | there is no odd value in the array                                    |
//        -----------------------|--------|-----------------------------------------------------------------------

//You are yet to complete this. Figure out how to make the negatives work.
public class Main {
    public static void main(String[] args) {
        int [] a = {2,12,4,6,8,11};
        System.out.println(isInertial(a));
    }

//    public static int isInertial(int[] a)
//    {
//        boolean hasOdd = false;
//        //boolean oddGreater = true;
//        int maxValue = 0;
//        int maxEvenValue = 0;
//        int secondMaxEven = 0;
//        int smallestOdd = 0;
//
//        for(int counter = 0; counter < a.length; counter++)
//        {
//            if(counter == 0)
//            {
//                maxValue = a[counter];
//
//                if(a[counter] %2 == 0) {
//                    maxEvenValue = a[counter];
//                    secondMaxEven = a[counter];
//                }
//                else{
//                    smallestOdd = a[counter];
//                }
//
//
//            }
//            else{
//                if(a[counter] > maxValue)
//                    maxValue = a[counter];
//
//                if(a[counter] %2 == 0) {
//                    if (a[counter] > maxEvenValue) {
//                        secondMaxEven = maxEvenValue;
//                        maxEvenValue = a[counter];
//                    }
//                }
//                else
//                {
//                    hasOdd = true;
//                    if(smallestOdd == 0)
//                        smallestOdd = a[counter];
//                    else if(smallestOdd > a[counter])
//                        smallestOdd = a[counter];
//                }
//            }
//        }
//
//        if(maxValue %2 == 0 && hasOdd && smallestOdd > secondMaxEven)
//            return 1;
//        else
//            return 0;
//    }
static String isInertial(int[] a){
    int isInertial = 1;
    int hasAtleastOneOdd = 0;
    int maxNumberIsEven = 0;
    int maxNumber = a[0];
    int lengthOdd = 0;
    int lengthEven = 0;

    for (int i = 0; i < a.length; i++) {
        if (a[i] % 2 == 1 || a[i] % 2 == -1) {
            hasAtleastOneOdd = 1;
            lengthOdd++;
        } else lengthEven++;
    }
    if (hasAtleastOneOdd == 0) return 0 + " no odd value";

    for (int i = 1; i < a.length; i++) {
        for (int j = 0; j < i; j++) {
            if (a[i] > a[j]) {
                if (a[i] > maxNumber) maxNumber = a[i];
            }
        }
    }
    if (maxNumber % 2 == 0 || maxNumber % 2 == -0) {
        maxNumberIsEven = 1;
    }
    if (maxNumberIsEven == 0) return 0 + " max number is not even, " + maxNumber + " is the max number";

    int[] oddValues = new int[lengthOdd];
    int[] evenValues = new int[lengthEven];
    int oddIdx = 0;
    int evenIdx = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] % 2 == 0 || a[i] % 2 == -0) {
            evenValues[evenIdx] = a[i];
            evenIdx++;
        } else {
            oddValues[oddIdx] = a[i];
            oddIdx++;
        }
    }

    for (int i = 0; i < oddValues.length; i++) {
        for (int j = 0; j < evenValues.length; j++) {
            if (evenValues[j] != maxNumber) {
                if (oddValues[i] < evenValues[j]) {
                    isInertial = 0;
                    return isInertial + " some odd value is not greater than some even value which is not the Max number";
                }
            }
        }
    }
    return isInertial + " is Intertial";
}
}