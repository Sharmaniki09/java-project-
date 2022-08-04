public class ShapeMain {
	public void print_shape()
	{
		System.out.println("This is a shape");
	}
}
//Rectangle class is inheriting property of Shape class
 class Rectangle1 extends ShapeMain
{
	public void print_rec()
	{
		
		System.out.println("This is a rectangle");
	}
}
//Circle class is inheriting property of Shape class
 class Circle extends ShapeMain
 {
	 public void print_circle()
	 {
		 
	 }
 }
//Square class is inheriting property of Rectangle class
 class Square1 extends Rectangle1
{
	public void print_square()
	{
		
		System.out.println("Square is a rectangle");
	}
}