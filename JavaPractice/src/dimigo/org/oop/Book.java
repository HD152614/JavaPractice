/**
 * 
 */
package dimigo.org.oop;

/**
 * <pre>
 * dimigo.org.oop
 *    |_Book
 * 
 * 1. 개요 : 
 * 2. 작성일 : 2017. 3. 23.
 * </pre>
 * 
 * @AUTHOR : USER
 * @VERSION : 1.0
 */
public class Book {
	private String title="미생";
	private String author="윤태호";
	private int page=1000;
	
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public int getPage(){
		return page;
	}
	
	public void setTitle(String newTitle){
		title=newTitle;
	}
	public void setAuthor(String newAuthor){
		author=newAuthor;
	}
	public void setPage(int newPage){
		page=newPage;
	}
}
