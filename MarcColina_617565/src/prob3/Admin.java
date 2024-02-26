package prob3;
import java.util.*;
public class Admin {
	public static List<LibraryMember> combineLists(List<Faculty> faculty, List<Student> students) {
		//implement
		//Declare Array of LibraryMember since both faculty and students now extend LibraryMember class
		List<LibraryMember> libraryMembers = new ArrayList<>();
		libraryMembers.addAll(faculty);
		libraryMembers.addAll(students);

		return libraryMembers;
	}
	public static int countNumOverdueBooks(List<LibraryMember> allMembers) {
		int total = 0;
		
		for(LibraryMember member : allMembers)
		{
			CheckoutRecord record = member.getRecord();
			//Only get the size because we only need the total number of overdue books
			total += record.getOverdueBooks().size();
		}
		return total;
	}
}
