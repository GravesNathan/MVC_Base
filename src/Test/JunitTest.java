/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nathan
 */
public class JunitTest {
    
    JunitMain testData = new JunitMain();
    
    @Test
    public void testArrayPass(){
        int[] expected = {1,2,3};
        int[] actual = testData.getArray();
        assertArrayEquals(int[] expected, int[] actual);
    }
            
//    Sample:
//static void
//assertArrayEquals(int[] expecteds, int[] actuals) 
//          Asserts that two int arrays are equal.
//
//assertEquals
//Sample:
//
//static void
//assertEquals(double expected, double actual, double delta) 
//          Asserts that two doubles or floats are equal to within a positive delta.
//
//assertFalse
//static void
//assertFalse(boolean condition) 
//          Asserts that a condition is false.
//
//assertNotNull
//static void
//assertNotNull(java.lang.Object object) 
//          Asserts that an object isn't null.
//
//assertNotSame
//static void
//assertNotSame(java.lang.Object unexpected, java.lang.Object actual) 
//          Asserts that two objects do not refer to the same object.
//(a few of these have a message option...I wonder what it's for? ex. below)
//static void
//assertNotSame(java.lang.String message, java.lang.Object unexpected, java.lang.Object actual) 
//          Asserts that two objects do not refer to the same object.
//
//assertNull
//static void
//assertNull(java.lang.Object object) 
//          Asserts that an object is null.
//
//assertSame
//static void
//assertSame(java.lang.Object expected, java.lang.Object actual) 
//          Asserts that two objects refer to the same object.
//
//assertThat
//
//static
//<T> void
//
//
//assertThat(java.lang.String reason, T actual, org.hamcrest.Matcher<T> matcher) 
//          Asserts that actual satisfies the condition specified by matcher.
//static
//<T> void
//
//
//assertThat(T actual, org.hamcrest.Matcher<T> matcher) 
//          Asserts that actual satisfies the condition specified by matcher.
//
//assertTrue
//static void
//assertTrue(boolean condition) 
//          Asserts that a condition is true.
//static void
//assertTrue(java.lang.String message, boolean condition) 
//          Asserts that a condition is true.

    
}
