package singleresponsibility.correct;

public class Print {
	
	public void printAuthorName(Book book) {
		System.out.println("Nome do autor ->" + book.getAuthor());
	}
}
