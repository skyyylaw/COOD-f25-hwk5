import java.util.*;

/*
 * This is the starter code for Part 4.1.
 * 
 * Modify it so that it uses an array instead of a List to hold the stocks,
 * then change the rest of the code accordingly so that the PortfolioTest 
 * test cases still pass.
 */
public class Portfolio implements Iterable<String> {
	
	private String[] stocks;

	public Portfolio(List<String> stocks) {
    this.stocks = stocks.toArray(new String[0]);
	}
	
	public Portfolio(String[] stocks) {
		this.stocks = stocks;
	}
	
	@Override
	public Iterator<String> iterator() {
		return new Iterator<>() {
			
			int count = 0;

			@Override
			public boolean hasNext() {
				return count < stocks.length;
			}

			@Override
			public String next() {
				return stocks[count++];
			}
		
		};
	}
	
	public static void main(String[] args) {
		String a = "A";
		String b = "B";
		String c = "C";
		//Portfolio p = new Portfolio(List.of(a, b, c));
		Portfolio p = new Portfolio(new String[] {a, b, c});
		
		// iterate using Iterator
		Iterator<String> it = p.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}

		// iterate using for-each loop
		for (String s : p) {
			System.out.println(s);
		}
	}
	

}

