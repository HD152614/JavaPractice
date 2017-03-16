/**
 * 
 */
package org.dimigo.basic;
import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * org.dimigo.basic
 *    |_Loop
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 16.
 * </pre>
 * 
 * @AUTHOR : USER
 * @VERSION : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int choice;
		int atk=100;
		boolean out=false;
		String[] job={"마법사","영주", "기사", "농민"};
		for(int i=0;;i++){
			System.out.println("---------------------");
			System.out.println("<<게임 메뉴>>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("---------------------");
			System.out.printf("메뉴 입력 => ");
			choice=scanner.nextInt();
			switch(choice){
			case 1:
				atk=atk+10;
				System.out.println("공격력이 증가되었습니다.  현재 공격력 : "+atk);
				break;
			case 2:
				atk=atk-10;
				System.out.println("공격력이 감소되었습니다.  현재 공격력 : "+atk);
				break;
			case 3:
				int num=new Random().nextInt(4);
				System.out.println(job[num]+"으로 설정되었습니다.");
				break;
			case 9:
				out=true;
				break;
			default:
			}
			if(out==true){
				System.out.println("이제 공부하세요!");
				break;
			}
		}
	}

}
