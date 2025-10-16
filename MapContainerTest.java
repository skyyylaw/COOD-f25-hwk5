import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.Test;

/*
 * These are the test cases for Part 1 Step 2.
 * 
 * You should NOT modify any of these tests.
 */

class MapContainerTest {

	@Test
	void testEmptyConstructor() {
		MapContainer<String, Integer> mc = new MapContainer<>();
		assertEquals(0, mc.size());
	}
	
	@Test
	void testMapConstructor() {
		
		Map<String, String> initMap = new HashMap<>();
		initMap.put("key1", "value1");
		
		MapContainer<String, String> mc = new MapContainer<>(initMap);
		assertEquals(1, mc.size());
		
	}
	
	@Test
	void testPutAndGetOneEntry() {
		MapContainer<String, Integer> mc = new MapContainer<>();
		
		mc.put("dog", 4);
		assertEquals(1, mc.size());

		int value = mc.get("dog");
		assertEquals(4, value);
	}

	
	@Test
	void testPutAndGetMultipleEntries() {
		Map<String, String> initMap = new HashMap<>();
		initMap.put("key1", "value1");
		
		MapContainer<String, String> mc = new MapContainer<>(initMap);

		String value = mc.get("key1");
		assertEquals("value1", value);
		
		mc.put("key2", "value2");
		assertEquals(2, mc.size());
		value = mc.get("key2");
		assertEquals("value2", value);
	}


	
	@Test
	void testPutListsSameSize() {
		
		List<Double> keysList = List.of(5.6, 7.8, 4.3);
		List<String> valuesList = List.of("dog", "cat", "aardvark");
		
		MapContainer<Double, String> mc = new MapContainer<>();
		
		assertTrue(mc.put(keysList, valuesList));
		
		assertEquals(3, mc.size());
		
		assertEquals("dog", mc.get(5.6));
		assertEquals("cat", mc.get(7.8));
		assertEquals("aardvark", mc.get(4.3));
		
	}
	
	@Test
	void testPutListsDifferentSizes() {
		List<Double> keysList = List.of(3.14159, 2.71828);
		List<Integer> valuesList = List.of(3, 3, 0);
		
		MapContainer<Double, Integer> mc = new MapContainer<>();
		
		assertFalse(mc.put(keysList, valuesList));
		
		assertEquals(0, mc.size());
		
	}
	
	
	

}
