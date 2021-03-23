package day_7;

import java.util.ArrayList;
import java.util.List;

class ProgrammimgLanguage{
	Thread t;
	public ProgrammimgLanguage(Thread t) {
		this.t = t;
	}

	void display() {
		List<String> l1 = new ArrayList<String>();
		l1.add("Java");
		l1.add("OOPS Language");
		l1.add("Oracle");
		l1.add("Model Layer");
		l1.add("Angular");
		l1.add("Prsentation Layer");
		l1.add("Spring Boot");
		l1.add("Backend Technology");
		
		for(int i=0;i<l1.size();i++) {
			
			if(i%2!=0)
			{	
				System.out.println("   "+l1.get(i));
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			else
			{	System.out.print("   "+l1.get(i));
			
				try {
					Thread.sleep(1000);
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
public class TechnologyNamesDisplayThread extends Thread{

	public static void main(String[] args) {
	
		Thread t = new Thread();
		t.start();
		ProgrammimgLanguage p = new ProgrammimgLanguage(t);
		p.display();
	}
}
