/**
 * 
 */
package dimigo.org.oop;

/**
 * <pre>
 * dimigo.org.oop
 *    |_BookTest
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @AUTHOR : USER
 * @VERSION : 1.0
 */
public class BookTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Book book=new Book();
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPage());
		
		book.setTitle("너의 이름은");
		book.setAuthor("신카이 마코토");
		book.setPage(700);
		System.out.println(book.getTitle());
		System.out.println(book.getAuthor());
		System.out.println(book.getPage());
	}

}
