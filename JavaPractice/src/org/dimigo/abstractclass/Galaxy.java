/**
 * 
 */
package org.dimigo.abstractclass;

import org.dimigo.abstractclass.SmartPhone;

/**
 * <pre>
 * abstractclass
 *    |_Galaxy
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 * 
 * @AUTHOR : USER
 * @VERSION : 1.0
 */
public class Galaxy extends SmartPhone{
	public Galaxy(){
	}
	public Galaxy(String model, String company, int price){
		super(model, company, price);
	}
	public void pay(){
		System.out.println("삼성페이로 결제합니다.");
	}
	public void useWrielessCharging(){
		System.out.println("useWrielessCharging 기능을 사용합니다.");
	}
}
