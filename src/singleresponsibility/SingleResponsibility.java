package singleresponsibility;

import singleresponsibility.correct.Print;

public class SingleResponsibility {

	public SingleResponsibility() {
		doIncorrectImplementation();
		doCorrectImplementation();
	}
	
	public void doIncorrectImplementation() {
		//singleresponsibility.incorrect.Book book = new singleresponsibility.incorrect.Book("Clean Architecture", "Robert Martin", "Science");
		
		//book.printAuthorName();
	}
	
	public void doCorrectImplementation() {
		singleresponsibility.correct.Book book = new singleresponsibility.correct.Book("Clean Architecture", "Robert Martin", "Science");
		
		singleresponsibility.correct.Print print = new singleresponsibility.correct.Print();
		print.printAuthorName(book);
	}
	
	public static void main(String[] args) {
		
		SingleResponsibility sr = new SingleResponsibility();
		
	}

}
