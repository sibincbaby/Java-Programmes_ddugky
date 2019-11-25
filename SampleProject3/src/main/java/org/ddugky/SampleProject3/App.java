package org.ddugky.SampleProject3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext beanFactory = new ClassPathXmlApplicationContext("resources/Hello.xml");
		HelloWorld myBean = (HelloWorld) beanFactory.getBean("SpringJava");
		myBean.printHello();
    }
}
