package CollectionPack;

import java.util.ArrayList;
import java.util.TreeSet;

public class BookTree {

	public static void main(String[] args) {

		 ArrayList<Book> list1=new ArrayList<Book>();
		 Book bt1=new Book(101,"java ","Manisha Aggarwal");
		 Book bt2=new Book(102,"python","Ashok");
		 Book bt3=new Book(103,"c#","Deepak");
	     
		 list1.add(bt1);
		 list1.add(bt2);
		 list1.add(bt3);
		 
		 ArrayList<Book> list2=new ArrayList<Book>();
		 Book bt4=new Book(104,"Skill","Sushi goel");
		 Book bt5=new Book(105,"IOT ","Nagarjun");
		 Book bt6=new Book(106,"SoftComputing","E-balaguru");
		 
		 list2.add(bt4);
		 list2.add(bt5);
		 list2.add(bt6);
		 
		 TreeSet<Book> ts=new TreeSet<Book>();
		 
		 ts.addAll(list1);
		 ts.addAll(list2);
		 for(Book bt:ts)
		 {
			 System.out.println(bt);
		 }
		}
}
