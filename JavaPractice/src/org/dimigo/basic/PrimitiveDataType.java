/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * org.dimigo.basic
 *    |_PrimitiveDataType
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 9.
 * </pre>
 * 
 * @AUTHOR : USER
 * @VERSION : 1.0
 */
public class PrimitiveDataType {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String name="아이유";
		boolean isMale=false;
		int age=25;
		double height=161.8;
		float weight=44.3f;
		char bloodType='A';
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : "+name);
		System.out.println(isMale?"성별 : 남자":"성별 : 여자");
		System.out.println("나이 : "+age+"세");
		System.out.println("키 : "+height+"cm");
		System.out.println("몸무게 : "+weight+"kg");
		System.out.println("혈액형 : "+bloodType+"형");
	}

}
