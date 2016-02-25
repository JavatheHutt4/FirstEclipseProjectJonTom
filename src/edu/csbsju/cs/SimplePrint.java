/**
 * 
 */
package edu.csbsju.cs;

import java.awt.event.ActionListener;

/**
 * @author tdrichmond
 *
 */
public class SimplePrint implements ActionListener {

	/**
	 * 
	 */
	private String name;
	/**
	 * @param name
	 * @param age
	 */
	public SimplePrint(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	private int age;
	
	public SimplePrint() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tom Richmond");
		for(int i=0; i<args.length;i++){
			System.out.println("args[ " + i + " ] = " + args[i] );
			}

	}

}
