/**
 * 
 */
package org.dimigo.inheritance;

/**
 * <pre>
 * org.dimigo.inheritance
 *    |_SmartPhoneTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 * 
 * @AUTHOR : USER
 * @VERSION : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		IPhone iPhone=new IPhone("iPhone 7", "애플", 900000);
		Galaxy galaxy=new Galaxy("갤럭시 S8", "삼성", 800000);
		
		System.out.println(iPhone);
		iPhone.turnOn();
		iPhone.pay();
		iPhone.useSpecialFunction(iPhone);
		iPhone.turnOff();
		
		System.out.println(galaxy);
		galaxy.turnOn();
		galaxy.pay();
		galaxy.useSpecialFunction(galaxy);
		galaxy.turnOff();
	}

}
