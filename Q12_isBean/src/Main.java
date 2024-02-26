//Question 12
//        A Bean array is defined to be an integer array where for every value n in the array,
//        there is also an element 2n, 2n+1 or n/2 in the array.
//
//        for example {4,9,8} is a Bean array because for 4,8 is present, for 9, 4 is present, for 8, 4 is present.
//        Other Bean arrays include {2,2,5,11,23}, {7,7,3,6} and {0}
//        The array {3,8,4} is not a Bean array because of the value 3 which requires that the array contains
//        either the value 6, 7 or 1 and none of these values are in the array.
//        Write a function named isBean that returns 1 if it's array argument is a Bean array,
//        otherwise it returns a 0.
//        if you are programming in Java or C#, the function signature is int isBean(int[] a)

public class Main {
    public static void main(String[] args) {
    int [] array = {4,9,8};

    System.out.println(isBean(array));
    }

    public static int isBean(int [] array)
    {
        int twoN, twoNplusOne, nOverTwo;
        boolean isBean = true;

        for(int outer = 0; outer < array.length; outer++)
        {
            //First, we have to compute the different bean values(2*n, 2*n+1, n/2) for each element in the array.
            //In the given example, we will first compute the bean values of 4. We will be doing each of this
            //for every element in the array.
            twoN = array[outer] * 2;
            twoNplusOne = 2 * array[outer] + 1;
            nOverTwo = array[outer] / 2;

            //After computing the bean values of the outer element, we then check if any of the elements
            //in the array match with any of the bean values. So if outer value is 4, the bean values are
            //8, 9, and 2. We then have to check if there exists an 8,9,2 in the array by going over the whole array hence
            // the inner loop and looking for these values. If we examine it, we can see that the array contains 9 and it's one of the bean
            //values of 4, therefore, the first element 4 has at least one bean value in the array
            for(int inner = 0; inner < array.length; inner++)
            {

                //We have to check if the element in the array matches to a bean value, if not, we will set the isbean to false to indicate that no
                //match has been found yet.
                if(twoN != array[inner] && twoNplusOne != array[inner] && nOverTwo  != array[inner])
                    isBean = false;
                //If there is already a bean value found within the array, we then break the inner loop because we only need to find at least one
                //bean value. We also set the variable to true to indicate that we have found a bean value and prevent the program from returning 0.
                //We then iterate through the next outer value and once again compute its bean values.
                else{
                    isBean = true;
                    break;
                }
            }
            //However, if after iterating through the whole array, no bean value matched to any element of the array, this would mean that the isBean variable
            //will be set to false and since we're done iterating through the whole array, we are sure that there is no match at all hence we return 0 and end the
            //program. It would be pointless to go over the other elements in the array if in the prior elements it's bean values have no match already.
            if(!isBean)
                return 0;
        }

        return 1;
    }
}