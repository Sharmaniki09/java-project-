package java_programs;

import java.util.Scanner;

public class TablePrint {
	void display()
	{
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter your NO for table : ");
		int table = s.nextInt();
		 
		for(int i = 1; i<=10;i++ )
		{
			System.out.println(table*i);
		}
		
	}

	public static void main(String[] args) {
		TablePrint obj= new TablePrint ();
		obj.display();
	}


	}


