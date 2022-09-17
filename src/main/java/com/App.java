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
       
        RoleBean r = new RoleBean();
        UserBean userBean = new UserBean(r);
        
     context.registerShutdownHook();   
    }
}
