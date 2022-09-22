package demo.com;
class MyThread1 extends Thread{
	public void run()
	{
		int number=10;
	      for(int i= 1; i<= number; i++)
	      {
	         if(i % 2 == 0)
	         {
	            System.out.print(Thread.currentThread().getName()+" "+i + "\n");
	         }
	      }
	      for(int i = 1; i <= number; i++)
	      {
	         if(i % 2 == 1)
	         {
	            System.out.print(Thread.currentThread().getName()+" "+i + "\n");
	         }
	      }
	      

	}
}
public class MyThread {

	public static void main(String[] args) {
		MyThread1 th1=new MyThread1();
		  MyThread1 th2=new MyThread1();

		  th1.start();
		  th2.start();
	}


	}
