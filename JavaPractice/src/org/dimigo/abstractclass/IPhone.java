/**
 * 
 */
package org.dimigo.abstractclass;

import org.dimigo.abstractclass.SmartPhone;

/**
 * <pre>
 * abstractclass
 *    |_IPhone
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 5. 16.
 * </pre>
 * 
 * @AUTHOR : USER
 * @VERSION : 1.0
 */
public class IPhone extends SmartPhone{
	public IPhone(){
	}
	public IPhone(String model, String company, int price){
		super(model, company, price);
	}
	public void pay(){
		System.out.println("애플페이로 결제합니다.");
	}
	public void useAirDrop(){
		System.out.println("AirDrop 기능을 사용합니다.");
	}
}
