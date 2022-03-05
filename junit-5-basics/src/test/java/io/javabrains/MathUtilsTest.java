package io.javabrains;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class MathUtilsTest {
MathUtils mathutils;
@BeforeAll
static void beforeAllInit() {
	System.out.println("This needs to run before all");
}
@AfterAll
void finish() {
	System.out.println("Test complete");
}
@BeforeEach
void init(){
	 mathutils = new MathUtils();
}

@AfterEach
void cleanup() {
	System.out.println("Tested");
}
	@Test
	@DisplayName("Testing this method")
	void testAdd() {
		//fail("Not yet implemented");
	//System.out.println("This test ran");
		//int expected = 2;
	//int actual = mathutils.add(1,1);
	assertEquals(2,mathutils.add(1,1),"The add method is wrong");
	}

	@Test 
	void testMultiply() {
		assertAll(
				() -> assertEquals(0, mathutils.mul(1, 0)),
				() -> assertEquals(1, mathutils.mul(1, 1)),
				() -> assertEquals(6, mathutils.mul(2, 3))
				);
	}
	  @Test
	    void testDivide() {

	        assertThrows(ArithmeticException.class, () -> mathutils.div(1,0),
	                "Divide should throw ArithmeticException when denominator is zero");
	    }
//	@Test
//	void testDiv() {
//		boolean isSeverup = false;
//		assumeTrue(isSeverup);
//		assertThrows(ArithmeticException.class,()->mathutils.div(1, 0),"Divide by zero should throw ");
//	}
@Test
void testcomputeCircleRadius(){
    assertEquals(314.1592653589793,mathutils.computeCircleArea(10));
      }
@Test
@Disabled
@DisplayName("TDD method should not run")
void testDisable() {
	fail("This test should be disabled");
}
}
