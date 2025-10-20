import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.*;

/*
 * These are the tests cases for Part 2.1.
 * 
 * You should NOT modify these tests.
 */

class ListifierTest {

	@Test
	void testFourDistinctInts() {
		List<Integer> out = Listifier.listify(5, 6, 7, 8);
		assertEquals(List.of(5, 6, 7, 8), out);
	}
	
	@Test
	void testSevenDistinctInts() {
		List<Integer> out = Listifier.listify(5, 6, 7, 8, 1, 2, 3);
		assertEquals(List.of(5, 6, 7, 8, 1, 2, 3), out);
	}
	
	@Test
	void testFourNonDistinctInts() {
		List<Integer> out = Listifier.listify(5, 6, 5, 8);
		assertEquals(List.of(5, 6, 8), out);		
	}
	
	@Test
	void testThreeDistinctDoubles() {
		List<Double> out = Listifier.listify(22.5, 18.2, 26.2);
		assertEquals(List.of(22.5, 18.2, 26.2), out);		
	}
	
	@Test
	void testFiveNonDistinctDoubles() {
		List<Double> out = Listifier.listify(22.5, 26.2, 22.5, 26.2, 26.2);
		assertEquals(List.of(22.5, 26.2), out);		
	}
	
	@Test
	void testFourDistinctStrings() {
		List<String> out = Listifier.listify("dog", "cat", "apple", "peach");
		assertEquals(List.of("dog", "cat", "apple", "peach"), out);		
	}
	
	@Test
	void testFiveNonDistinctStrings() {
		List<String> out = Listifier.listify("dog", "cat", "cat", "peach", "bear");
		assertEquals(List.of("dog", "cat", "peach", "bear"), out);		
	}
 	
	
}
