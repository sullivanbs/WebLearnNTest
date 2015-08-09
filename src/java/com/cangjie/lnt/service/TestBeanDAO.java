/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cangjie.lnt.service;

import com.cangjie.util.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author lenovo
 */
public class TestBeanDAO {
    
    public static void queryAll(String clazz){
        String hql = "from " + clazz ;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Query query = session.createQuery("select u.userName from TRegister u");
    }
}
