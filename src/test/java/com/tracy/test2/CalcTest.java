/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tracy.test2;

import com.tracy.test2.service.CalcService;
import org.junit.Assert;
import org.junit.Ignore;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author student
 */
public class CalcTest {
    
    private static CalcService service;
    
    public CalcTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    
    //Ignoring a Test
    @Ignore
    public void failAssertion() {
        
        //Failing a Test
        Assert.fail(service.failMessage("Heyman"));
    }
    
    @Test
    public void arrayAssertion(){
        
        //Assert Arrays
        String[] actualNames = new String[] {"Tracy", "Megan", "Jonathan"};
        String[] varNames = new String[] {"Tracy", "Megan", "Jonathan"};
        Assert.assertArrayEquals("Two arrays are not equal", actualNames, varNames);
    }
    
    //Exception Assert
    @Test(expectedExceptions = NullPointerException.class )
    public void exceptionAssertion() throws Exception{  
        service.divide(3, 0);
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
}
