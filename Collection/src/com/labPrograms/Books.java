package com.labPrograms;

import java.util.Comparator;

	public class Books implements Comparable<Books>{

		private int bookid;
		private String name;
		private int price;
		
		public Books(int bookid, String name,int price) {
			super();
			this.bookid = bookid;
			this.name = name;
			this.price = price;
		}

		public int getBookid() {
			return bookid;
		}
		
		public void setBookid(int bookid) {
			this.bookid = bookid;
		}

		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return "Books : [bookid=" + bookid + ", name=" + name + "]";
		}

		
		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public int compareTo(Books o) {
			
			return this.getName().compareTo(o.getName());
		}
	}

	class BooksBookidComparator implements Comparator<Books>
	{
		@Override
		public int compare(Books o1, Books o2) {
			
			return o1.getBookid() - o2.getBookid();
		}
		
	}

	class BooksBookNameComparator implements Comparator<Books>
	{
		@Override
		public int compare(Books o3, Books o4) {
			
			return o3.getName().compareTo(o4.getName());
		}
		
	}

	class BooksPriceComparator implements Comparator<Books>
	{

		@Override
		public int compare(Books o1, Books o2) {
			if(o1.getPrice() == o2.getPrice())
			{
				return o1.getPrice() - o2.getPrice();
			}
			return 0;
		}
		
	}