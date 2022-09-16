package CollectionPack;

import java.util.ArrayList;
import java.util.Iterator;

public class BookList {

	public static void main(String[] args) {

		ContainsList();
	}	
	public static void ContainsList()
	{
       ArrayList list1=new ArrayList();		
		Book ob1=new Book(101,"java ","Manisha Aggarwal");
		Book ob2=new Book(102,"python","Ashok ");
		Book ob3=new Book(103,"c#","Deepak");
		
		ArrayList list2=new ArrayList();
		
		Book ob4=new Book(104,"Skill","Minakshi");
		Book ob5=new Book(105,"IOT ","Meenu");
		Book ob6=new Book(106,"SoftComputing","Renu");
		
		list1.add(ob1);
		list1.add(ob2);
		list1.add(ob3);
		
		list2.add(ob4);
		list2.add(ob5);
		list2.add(ob6);
		
		System.out.println("List1 conatining objects "+"\n");
		Iterator it=list1.iterator();
		while(it.hasNext())
		{
			System.out.println("Array list1 output: "+it.next());
		}
		System.out.println("\n");
		System.out.println("List2 conatining objects "+"\n");
		Iterator it2=list2.iterator();
		while(it2.hasNext())
		{
		System.out.println("Array list2 output: "+it2.next());
		}
	}
}
