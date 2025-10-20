import static org.junit.jupiter.api.Assertions.*;
import java.awt.*;

import org.junit.jupiter.api.Test;

/*
 * These are the test cases for Part 1.1.
 * 
 * You should NOT modify these tests, aside from uncommenting the testShapeOnly()
 * method, which should *not* compile.
 */

class ShapeContainerTest {

	@Test
	void testGetShape() {
		ShapeContainer<Rectangle> s1 = new ShapeContainer<>(new Rectangle());
		Rectangle r = s1.getShape();
		
		ShapeContainer<Polygon> s2 = new ShapeContainer<>(new Polygon());
		Polygon p = s2.getShape();
		
		// not really checking anything here, just want to make sure this all compiles
		
	}
	
	@Test
	void testEquals() {
		Rectangle r1 = new Rectangle(100, 200);
		ShapeContainer<Rectangle> s1 = new ShapeContainer<>(r1);
		ShapeContainer<Rectangle> s2 = new ShapeContainer<>(r1);
		// these should be equal because they have the same underlying Rectangle
		assertTrue(s1.equals(s2));
		
		Rectangle r2 = new Rectangle(200, 300);
		ShapeContainer<Rectangle> s3 = new ShapeContainer<>(r2);
		// these should not be equal because their underlying Rectangles are different 
		assertFalse(s1.equals(s3));
		
		Polygon p = new Polygon();
		ShapeContainer<Polygon> s4 = new ShapeContainer<>(p);
		// these should not be equal because they have different underlying Shapes 
		assertFalse(s1.equals(s4));
	}
	
	/*
	@Test
	void testShapeOnly() {
		
		// the following line of code should not compile! 
		// if it does, you have not correctly implemented the ShapeContainer class
		
		ShapeContainer<String> s = new ShapeContainer<>();
		
	}
	*/
	
}
