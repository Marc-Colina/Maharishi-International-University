//Question 14
//        Write a function that will return the most occurring number in an array. If there is more than
//        one such number, the function may return any one of them.
//        If you are programming in Java or C#, the function signature is int answerTwo(int[] a)
//
//        Examples
//        -------------------------|----------|------------------------------------------------------------
//        | a                       | return   | Explanation                                                |
//        |-------------------------|----------|------------------------------------------------------------|
//        | {6,8,1,8,2}             | 8        | 8 occurs two times. No other number occurs 3 or more times |
//        |-------------------------|----------|------------------------------------------------------------|
//        | {6,8,1,8,6}             | 8 or 6   | 8, 6. The Function may return either 8 or 6                |
//        -------------------------|----------|------------------------------------------------------------
public class Main {
    public static void main(String[] args) {
        int [] array = {6,8,1,8,2};

        System.out.println(answerTwo(array));

    }
    public static int answerTwo(int [] array)
    {
        //We have to keep track of the count of the most occurring number so that we can compare it with others and at the same
        //time we also have to track which number has that occurrence count hence the two variables below.
        int mostOcurringCount = 0;
        int mostOcurringNum = 0;

        //We want to iterate through the array and check if a same number exists within it. Given the array above, we first check 6 and iterate through
        //the whole array and increment the count everytime it encounters the number 6.
        for(int outer = 0; outer < array.length; outer++)
        {
            int numOccurrences = 0;
            //We initialized the inner variable to the outer variable because we don't want to recheck the same values that have already been checked.
            //For sure, when there are numbers that have multiple occurrences, this will not be more than the occurrence checked in the previous runs
            //because we didn't include the checking the previous values in the array because again, we initialized the inner array to whatever the value of
            //the inner array was.
            for(int inner = outer; inner<array.length; inner++)
            {

                //Everytime the outer array and inner array is equal, we increment numOccurrences. This will always be true for the first element since
                //they will always be pointing to the same index since we initialized the inner counter to outer.
                if(array[outer] == array [inner])
                {
                    numOccurrences++;
                }
            }

            //After the inner loop finishes executing, it was able to count all the occurences of the value at index counter. It checks if the current number of occurences
            //is more than the mostOccuring count, if yes, it updates the mostOcurringCount and we also update the mostOccuringNum(the value that occurred the most).
            if(numOccurrences > mostOcurringCount)
            {
                mostOcurringCount = numOccurrences;
                mostOcurringNum = array[outer];
            }
        }

        return mostOcurringNum;
    }
}