//Question 1
//        An array with an odd number of elements is said to be centered
//        if all elements (except the middle one) are strictly greater than the value
//        of the middle element. Note that only arrays with an odd number of elements
//        have a middle element. Write a function that accepts an integer array and
//        returns 1 if it is a centered array, otherwise it returns 0.
//        Examples:
//        -----------------------|-----------------------------------------------------------------------
//        | if the input array is | return                                                                |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {1,2,3,4,5}           | 0 (the middle element 3 is not strictly less than all other elements) |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {3,2,1,4,5}           | 1 (the middle element 1 is strictly less than all other elements)     |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {3,2,1,4,1}           | 0 (the middle element 1 is not strictly less than all other elements) |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {1,2,3,4}             | 0 (no middle element)                                                 |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {}                    | 0 (no middle element)                                                 |
//        |-----------------------|-----------------------------------------------------------------------|
//        | {10}                  | 1 (the middle element 10 is strictly less than all other elements)    |
//        -----------------------------------------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        int [] num = {10};
        System.out.println( "" + isCentered(num));
    }

    public static int isCentered(int [] num) {
        int numLength = num.length;

        if (numLength % 2 == 0) {
            return 0;
        }
        else {
            //We don't add one because arrays are 0 based. So if array length is 5, 5/2 is 2 which is the
            //third element
            int middleIndex = numLength/2;

            for(int counter = 0; counter < numLength; counter++)
            {
                //Make sure to include less than or equal to so that if it sees an element of the array
                //that's equal to the middle element and it's not the middle element, it returns 0
                if(num[counter] <= num[middleIndex] && counter!= middleIndex)
                {
                    return 0;
                }
            } //closing for
        } //closing else
        return 1;
    }

}