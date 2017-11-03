/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import control.MemberControl;
import static org.hamcrest.CoreMatchers.instanceOf;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author NathanG
 */
public class JunitMainTest {
    
    public JunitMainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

//    JunitMain testData = new JunitMain();
//    
//    @Test
//    public void testArrayPass(){
//        int[] expected = {1,2,3};
//        int[] actual = testData.getArray();
//        assertArrayEquals(expected, actual);
//    }
//    
    /**
     * Test of getArray method, of class JunitMain.
     */
    @Test
    public void testGetArray() {
        System.out.println("getArray");
        JunitMain instance = new JunitMain();
        int[] expResult = {1,2,3};
        int[] result = instance.getArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDouble method, of class JunitMain.
     */
    @Test
    public void testGetDouble() {
        System.out.println("getDouble");
        JunitMain instance = new JunitMain();
        Double expResult = 3.14;
        Double result = instance.getDouble();
        assertEquals(expResult, result, .00);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getFalse method, of class JunitMain.
     */
    @Test
    public void testGetFalse() {
        System.out.println("getFalse");
        JunitMain instance = new JunitMain();
        Boolean result = instance.getFalse();
        assertFalse(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTrue method, of class JunitMain.
     */
    @Test
    public void testGetTrue() {
        System.out.println("getTrue");
        JunitMain instance = new JunitMain();
        Boolean result = instance.getTrue();
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTempMember method, of class JunitMain.
     */
    @Test
    public void testGetTempMember() {
        System.out.println("getTempMember");
        JunitMain instance = new JunitMain();
        //MemberControl expResult = null;
        MemberControl result = instance.getTempMember();
        assertNotNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEmptyMember method, of class JunitMain.
     */
    @Test
    public void testGetEmptyMember() {
        System.out.println("getEmptyMember");
        JunitMain instance = new JunitMain();
        //MemberControl expResult = null;
        MemberControl result = instance.getEmptyMember();
        assertNull(result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    @Test
    public void testNotSame(){
        System.out.println("testNotSame");
        JunitMain instance = new JunitMain();
        Double expNotResult = 3.15;
        Double result = instance.getDouble();
        assertNotSame(expNotResult, result);
    }
    
    @Test
    public void testSame(){
        System.out.println("testSame");
        JunitMain instance = new JunitMain();
        MemberControl member1 = instance.getTempMember();
        MemberControl member2 = instance.getTempMember2();
        assertSame(member1, member2);
    }
    
    @Test
    public void testThat(){
        System.out.println("testThat");
        JunitMain instance = new JunitMain();
        MemberControl member = instance.getTempMember();
        assertThat(member, instanceOf(MemberControl.class));
    }
}
