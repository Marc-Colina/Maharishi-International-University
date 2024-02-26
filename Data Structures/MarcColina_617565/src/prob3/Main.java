package prob3;
import java.util.*;
public class Main {

	@SuppressWarnings("serial")
	public static void main(String[] args) {
		List<List<String>> lists = new ArrayList<List<String>>() {
			{	
				add(Arrays.asList(new String[] {"Java", "Python"}));
				add(Arrays.asList(new String[] {"Java", "C#", "Python", "Scala", "C", "JavaScript"}));
				
				add(Arrays.asList(new String[] {"Cooking", "Gardening"}));
				add(Arrays.asList(new String[] {"Cooking", "Travel", "Gardening", "Vacationing"}));
				
				add(Arrays.asList(new String[] {"Martial Arts", "Kungfu", "Aikido"}));
				add(Arrays.asList(new String[] {"Weightlifting", "MaritalArts", "Aikido", "Kungfu"}));
				
				add(Arrays.asList(new String[] {"Parenting", "Being a Kid"}));
				add(Arrays.asList(new String[] {"Training Your Hamster", "Training Your Cat", "Training Your Dog", 
						                        "Parenting", "Being a Kid"}));
				
				add(Arrays.asList(new String[] {"Food on the Road", "Quick Recipes"}));
				add(Arrays.asList(new String[] {"Cooking Tips", "Spices for a Tasty Meal", "Food on the Road", 
						                        "Dog Food", "Quick Recipes"}));
						
				add(Arrays.asList(new String[] {"Communicating with Americans", "English Idioms"}));
				add(Arrays.asList(new String[] {"Student Life in the US", "Communicating with Americans", "English Idioms", 
						                        "Things You Should Never Say in America"}));
				
				add(Arrays.asList(new String[] {"Mathematics for Computer Science", "Fun Problems in Fourier Analysis"}));
				add(Arrays.asList(new String[] {"Algorithm Analysis for the Beginner", "Mathematics for Computer Science", 
						                        "Algebraic Varieties for Dummies", "Fun Problems in Fourier Analysis"}));
				
				add(Arrays.asList(new String[] {"The Career Path for a Librarian"}));
				add(Arrays.asList(new String[] {"How to Shelve Books", "Good Deals on Used Books", "Librarians I Have Known", "The Career Path for a Librarian"}));
				
			}
		};
		CheckoutRecord[] records = {new CheckoutRecord(lists.get(0), lists.get(1)), new CheckoutRecord(lists.get(2), lists.get(3)),
				new CheckoutRecord(lists.get(4), lists.get(5)), new CheckoutRecord(lists.get(6), lists.get(7))};
		
	
		List<Faculty> faculty = new ArrayList<Faculty>() {
			{
				add(new Faculty("Joe", "12B", records[0]));
				add(new Faculty("Rick", "8C", records[1]));
				
			}
		};
		List<Student> students = new ArrayList<Student>() {
			{
				add(new Student("Enkhevold", "8174", records[2]));
				add(new Student("Prince II", "2222", records[3]));
			}
		};
		
		List<LibraryMember> combinedList = Admin.combineLists(faculty, students);
		int totalOverdue = Admin.countNumOverdueBooks(combinedList);
		//Expected number of overdue books: 9
		System.out.println("Total number of overdue books: "+ totalOverdue);
	}
}



