package oops;

import java.util.*;

public class Author {
	private String name;
	private String email;
	private char gender;

	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
}

	class Book {
		private String name;
		private Author author;
		private double price;
		private int qytInstock;

		public Book(String name, Author author, double price, int qytInstock) {
			this.name = name;
			this.author = author;
			this.price = price;
			this.qytInstock = qytInstock;
		}

		public String getName() {
			return name;
		}

		public Author getAuthor() {
			return author;
		}

		public double getPrice() {
			return price;
		}

		public int getQytInstock() {
			return qytInstock;
		}
		
	}

	class Main {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			String authorName = sc.nextLine();
			String authorEmail = sc.nextLine();
			char authorGender = sc.next().charAt(0);
			sc.nextLine();
			Author author = new Author(authorName, authorEmail, authorGender);
			String bookName = sc.nextLine();
			double bookPrice = sc.nextDouble();
			int qytInstock = sc.nextInt();
			Book book = new Book(bookName, author, bookPrice, qytInstock);
			System.out.println("\n--- Book Details ---");
	        System.out.println("Book Name: " + book.getName());
	        System.out.println("Author Name: " + book.getAuthor().getName());
	        System.out.println("Author Email: " + book.getAuthor().getEmail());
	        System.out.println("Author Gender: " + book.getAuthor().getGender());
	        System.out.println("Price: " + book.getPrice());
	        System.out.println("Quantity in stock: " + book.getQytInstock());

		}

	}

