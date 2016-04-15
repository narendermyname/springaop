/**
 * 
 */
package com.naren.component;

/**
 * @author narender
 *
 */
public class Person {

	/**
	 * 
	 */
	private String name;
	private String job;
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @param job the job to set
	 */
	public void setJob(String job) {
		this.job = job;
	}
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public void printName(String message){
		System.out.println(message.toString()+name);
	}
	
	public void printJob(String message){
		System.out.println(message+job);
	}
}
