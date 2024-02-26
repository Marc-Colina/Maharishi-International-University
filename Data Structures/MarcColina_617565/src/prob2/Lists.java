package prob2;

import java.util.*;

public class Lists {
	/**
	 * Returns, in sorted order, the union of those lists L in the input list of lists 
	 * for which the following requirements are satisfied:
	 * (1) in L there are num1 or more occurrences of the String word1
	 * (2) in L there are fewer than num2 occurrences of the String word2
	 */
	public static List<String> extractList(List<List<String>> lists, String word1, int num1, String word2, int num2) {
		List<List<String>> listOfQualifiedLists = new ArrayList<>();
		
		for(List<String> list : lists)
		{
			//We first need to get a num1Count and num2Count of all the lists involved and after we do that
			//we can now check which of those lists qualified.
			int num1Count = 0;
			int num2Count = 0;
			
			for(String word : list)
			{
				if(word.equals(word1))
				{
					num1Count++;
				}
				else if(word.equals(word2))
				{
					num2Count++;
				}
			}
			
			if(num1Count >= num1 && num2Count < num2)
			{
				//If a specific list qualifies, they should be added ot the listOfQualfiedLists
				listOfQualifiedLists.add(list);
			}
		}
		
		//We now then have to combine all the words in the lists inside listOfQualifiedLists
		List<String> union = new ArrayList<>();
		
		for(List<String> list : listOfQualifiedLists)
		{
			for(String word : list)
			{
				
				union.add(word);
			}
		}
		
		//Once we have added all the words, we then sort before returning
		Collections.sort(union);
		
		return union;
	}
	

	public static void main(String[] args) {
		example1();
		example2();
		
	}
	//expected output:
	//[cat, cat, dog, mouse]
	static void example1() {
		String[][] strings = {{"cat", "dog", "mouse", "cat"},{"cat","cat", "horse", "cat", "bug"},
				{"caterpillar", "horse","dog", "fly"},{"gorilla", "tiger", "cat","bug","cat"}};
		List<List<String>> input = new ArrayList<>(4);
		for(int i = 0; i<strings.length; ++i) {
			input.add(Arrays.asList(strings[i]));
		}
		List<String> output = extractList(input, "cat", 2, "bug", 1);
		System.out.println(output);
	}
	
	//expected output:
	//[caterpillar, dog, dog, dog, fly, horse, horse, tree]
	static void example2() {
		String[][] strings = {{"cat", "dog", "mouse", "cat"},{"cat","cat", "horse", "cat", "bug"},
				{"caterpillar", "horse","dog", "fly"},{"gorilla", "tiger", "cat","bug","cat"},
				{"dog", "dog", "tree", "horse"}};
		List<List<String>> input = new ArrayList<>(4);
		for(int i = 0; i<strings.length; ++i) {
			input.add(Arrays.asList(strings[i]));
		}
		List<String> output = extractList(input, "dog", 1, "cat", 2);
		System.out.println(output);
	}
}
