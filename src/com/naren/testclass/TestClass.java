/**
 * 
 */
package com.naren.testclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.naren.component.Person;

/**
 * @author narender
 *
 */
public class TestClass {

	/**
	 * 
	 */
	public TestClass() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext apppContext=new ClassPathXmlApplicationContext("spring-aop-log.xml");
		Person person=(Person) apppContext.getBean("personproxy");
		person.printJob("Your are ");
		System.out.println("--------------------------");
		person.printName("Hello ! ");
		//to create error
		//person.printName(null);
		System.out.println("--------------------------");
	}
}
