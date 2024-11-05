package Multithreading;
class MicrosoftOffice2 extends Thread {
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if (Thread.currentThread().getName().equals("spellCheck")) {
			spellCheck();
		}else
		save();
		}
	//primary operation
	
		
		
	
	
	
private void typing() {
	try {
		for(int i=0;i<5;i++) {
			System.out.println("typing");
		Thread.sleep(4000);
	}
}
catch (Exception e) {
	e.printStackTrace();
}
}
//secondary operation
private void spellCheck() {
	try {
		for(; ;) {
			System.out.println("spellCheck");
			Thread.sleep(4000);
		}
	}
	catch (Exception e) {
		e.printStackTrace();
	}
}
private void save() {
	try {
		for(; ;) {
		System.out.println("save");
		Thread.sleep(4000);
}
	}
catch (Exception e) {
	e.printStackTrace();
}
}
}

public class Thread5 {
	public static void main(String[] args) throws InterruptedException{
		MicrosoftOffice2 ms1 = new MicrosoftOffice2();
		MicrosoftOffice2 ms2 = new MicrosoftOffice2();
		MicrosoftOffice2 ms3= new MicrosoftOffice2();
		
		ms1.setName("typing");
		ms2.setName("spellCheck");
		ms3.setName("save");
		
		ms2.setDaemon(true);//activate daemon
		ms3.setDaemon(true);//activate daemon
		
		ms2.setPriority(8);//set priority more than 7 for secondary Threads
		ms3.setPriority(9);//set priority more than 7 for secondary Threads
		
		ms1.start();
		ms2.start();
		ms3.start();
		
		
	}

}
