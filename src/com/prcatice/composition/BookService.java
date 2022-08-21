package com.prcatice.composition;

public class BookService {

	public static void main(String[] args) {
		Book book = new Book();
		book.setName("Death");
		book.setPrice(499);
		Author author = new Author();
		author.setFirstName("Sadguru");
		author.setLastName("jaggi");
		author.setAge(67);
		book.setAuthor(author);
//		System.out.println("Details of the book are" + " " + book.getName() + " " + book.getPrice() + " "
//				+ book.getAuthor().getFirstName() + " " + book.getAuthor().getLastName() + " "
//				+ book.getAuthor().getAge());
System.out.println(book);

	}

}
