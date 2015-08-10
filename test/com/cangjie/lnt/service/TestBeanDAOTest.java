/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cangjie.lnt.service;

import javax.annotation.Resource;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 *
 * @author lenovo
 */
@RunWith(SpringJUnit4ClassRunner.class)  
@ContextConfiguration(locations = "classpath:applicationContext.xml") 
public class TestBeanDAOTest {
    @Resource
    private TestBeanDAO tbDAO;
    
    public TestBeanDAOTest() {
    }
    
    /**
     * Test of queryAll method, of class TestBeanDAO.
     */
    @Test
    public void testQueryAll() {
        System.out.println("queryAll");
        String clazz = "TestBeanSub";
        tbDAO.queryAll(clazz);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
