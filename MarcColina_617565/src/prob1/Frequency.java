package prob1;
import java.util.*;
public class Frequency {
	/**
	 * Returns a frequencyTable for the input list. Implementation must 
	 * be based on recursion.
	 */
	public HashMap<Integer, Integer> recurFreqTable(LinkedList<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		return recurFreqTableHelper(list,map,list.size()-1);
	}
	
	//We need another helper class to do the actual recursion because we need to constantly pass the HashMap and the size
	public HashMap<Integer,Integer> recurFreqTableHelper(LinkedList<Integer> list, HashMap<Integer, Integer> map, int size)
	{
		//Call the recursive function until we've accessed all the elements in the integer list and then return the frequency map
		if(size<0)
			return map;
		
		int num = list.get(size);
		if(map.containsKey(num))
		{
			//If we see that the number is already in the hashmap, we just get the value (which is the frequency count) and
			//add 1 and then put the key and updatedSize back in since it will just overwrite the existing value with the same key.
			int updatedSize = map.get(num);
			updatedSize++;
			map.put(num, updatedSize);
		}
		else
		{
			//This means the current number is unique so the count should just be 1
			map.put(num, 1);
		}
		
		size--;
		return recurFreqTableHelper(list,map,size);
	}
	
	//expected output:
	//{3=3, 4=1, 8=4, 9=1}
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(8);
		list.add(4);
		list.add(3);
		list.add(8);
		list.add(3);
		list.add(9);
		list.add(3);
		list.add(8);
		list.add(8);
		Frequency m = new Frequency();
		HashMap<Integer, Integer> h = m.recurFreqTable(list);
		System.out.println(h);
		

	}

}
