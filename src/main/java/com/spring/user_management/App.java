package com.spring.user_management;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.user_management.repo.UserRepository;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext
    	bean = new ClassPathXmlApplicationContext("Spring.xml");
    	UserRepository ul = (UserRepository)bean.getBean(UserRepository.class,"u2");
    	ul.hbConfig();
    }
}
