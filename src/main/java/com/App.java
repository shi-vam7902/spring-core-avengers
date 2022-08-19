package com;


import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.RoleBean;
import com.bean.UserBean;
import com.dao.UserDao;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Welcome!" );
        
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
       
        UserDao userDao1 =  context.getBean("userdao",UserDao.class);
        UserDao userDao2 =  context.getBean("userdao",UserDao.class);
        UserDao userDao3 =  context.getBean("userdao",UserDao.class);
        
        System.out.println(userDao1);
        System.out.println(userDao2);
        System.out.println(userDao3);
        
        RoleBean roleBean = context.getBean("rolebean",RoleBean.class);
        UserBean userBean= context.getBean("userbean",UserBean.class);
       
       System.out.println(userBean.getRoleName());
        
       System.out.println(roleBean.getClass());
        
        System.out.println(userDao1.getdBname());
        
        
        
    }
}
