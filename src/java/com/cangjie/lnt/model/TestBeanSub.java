/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cangjie.lnt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author lenovo
 */
@Entity
@Table(name="test_bean_sub")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TestBeanSub extends TestBean{
    @Column(name="test")
    private String test;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }
    
}
