package com.zettamine.day06.book_manipulation;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> bookList = new ArrayList<>();

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}
	
	void addBook(Book obj) {
		this.bookList.add(obj);
	}

	boolean isEmpty() {
		if(this.bookList.size()==0)
			return false;
		return true;
	}
	ArrayList<Book> viewBooksByAuthor(String author){
		ArrayList<Book> bookArr= new ArrayList<Book>(this.bookList);
		bookArr.removeIf(obj->!obj.getBookAuthor().equalsIgnoreCase(author));
		return bookArr;
	}
	
	int countNoOfBooks(String bname) {
		int count =0;
		for (Book book : this.bookList) {
			if(book.getBookTitle().equalsIgnoreCase(bname))
				count++;
		}
		return count;
	}
}
