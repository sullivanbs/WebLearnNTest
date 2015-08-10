/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cangjie.lnt.service;

import com.cangjie.lnt.model.TestBean;
import com.cangjie.lnt.model.TestBeanSub;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Component;

/**
 *
 * @author lenovo
 */
@Component
public class TestBeanDAO {
    @Resource
    private HibernateTemplate ht;
    
    public void queryAll(String clazz){
        String hql = "from " + clazz ;
        List beanlist = ht.find(hql);
        for (Iterator it = beanlist.iterator(); it.hasNext();) {
            Object bean = it.next();
            if(bean instanceof TestBeanSub)
                System.out.println(((TestBeanSub) bean).getTest());
            else
                System.out.println("this is not a bean of TestBeanSub:" + ((TestBean) bean).getId());
        }
    }
}
