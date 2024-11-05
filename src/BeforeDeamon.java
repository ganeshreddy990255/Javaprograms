
class MicrosoftOffice extends Thread {
	public void run() {
		if(Thread.currentThread().getName().equals("typing")) {
			typing();
		}
		else if (Thread.currentThread().getName().equals("spellCheck")) {
			spellCheck();
		}else
		save();
		}
	
		
		
	
	
	
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
private void spellCheck() {
	try {
		for(int i=0;i<5;i++) {
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
		System.out.println("save");
		Thread.sleep(4000);
}
catch (Exception e) {
	e.printStackTrace();
}
}
}
public class BeforeDeamon {
	public static void main(String[] args) throws InterruptedException {
		MicrosoftOffice ms1 = new MicrosoftOffice();
		MicrosoftOffice ms2 = new MicrosoftOffice();
		MicrosoftOffice ms3= new MicrosoftOffice();
		
		ms1.setName("typing");
		ms2.setName("spellCheck");
		ms3.setName("save");
		
		ms1.start();
		ms2.start();
		ms3.start();
}
}
