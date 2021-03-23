package day_7;

class Odd{
	synchronized void display() 
	{ 
		for(int i=1;i<=20;i++) 
		{
			if(i%2!=0)
			System.out.print(" "+i);
				try {
					Thread.sleep(2000);
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
	}
}

class Even{
	synchronized void display() 
	{ 
		for(int j=1;j<=20;j++) 
		{
			if(j%2==0)
				System.out.println(" "+j);
			try {
				Thread.sleep(2000);
				}catch(Exception e) {
					e.printStackTrace();
				}
		}
	}
}

class Test1 extends Thread{
	Odd odd;
	public Test1(Odd odd) {
		this.odd = odd;
	} 
	public void run() {
		odd.display();
	}
}

class Test2 extends Thread{
	Even even;
	public Test2(Even even) {
		this.even = even;
	}
	public void run() {
		even.display();
	}
}

public class EvenOddNumberDisplayThread extends Thread{

	public static void main(String[] args) {
		Odd odd = new Odd();
		Even even  =  new Even();
		Test1 t1 = new Test1(odd);
		Test2 t2 = new Test2(even);
		t1.start(); t2.start();
	}
}
