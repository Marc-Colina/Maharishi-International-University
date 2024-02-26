package prob3;

import java.util.*;

/* Do not modify */
public class CheckoutRecord {
	private List<String> overdueBooks = new ArrayList<>();
	private List<String> allCheckedOutBooks = new ArrayList<>();

	public CheckoutRecord(List<String> overdueBooks, List<String> all) {
		this.overdueBooks = overdueBooks;
		this.allCheckedOutBooks = all;
	}

	public List<String> getOverdueBooks() {
		return overdueBooks;
	}

	public List<String> getAllCheckedOutBooks() {
		return allCheckedOutBooks;
	}
}
