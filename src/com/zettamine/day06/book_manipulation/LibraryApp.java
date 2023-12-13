package com.zettamine.day06.book_manipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Library lb = new Library();
		
		int opt=0,bNo=0;
		String bName,bAuthor;
		while(opt!=5) {
			System.out.println("1.Add Book\n2.Display all Book Details\n3."
					 + "Search Book by Author\n4.Count Number of books - by book name\n5.Exit");
			System.out.print("Enter your choice: ");
			opt=scan.nextInt();
			switch(opt) {
			case 1:
				System.out.print("Enter the isbn no: ");
				bNo = scan.nextInt();
				scan.nextLine();
				System.out.print("Enter the book name:");
				bName=scan.nextLine();
				System.out.print("Enter the author name: ");
				bAuthor=scan.nextLine();
				lb.addBook(new Book(bNo, bName, bAuthor));
				System.out.println("Book added successfully");
				break;
			case 2:
				for(Book book:lb.getBookList())
					System.out.println(book);
				break;
			case 3:
				scan.nextLine();
				System.out.print("Enter the author name: ");
                bAuthor = scan.nextLine();
               ArrayList<Book> bArr= lb.viewBooksByAuthor(bAuthor);
               for(Book book:bArr)
					System.out.println(book);
               break;
			case 4:
				scan.nextLine();
				System.out.print("Enter book name: ");
				bName =scan.nextLine();
				System.out.println("No. of books = "+lb.countNoOfBooks(bName));
				break;
			case 5:
				return;
			default:
				System.out.println("Inavlid option -- Try Again");
				
			
			
			}
			
		}
		scan.close();

	}

}
