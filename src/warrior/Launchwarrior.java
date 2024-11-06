package warrior;

class warrior extends Thread{
	String res1 = "Brahmastra";
	String res2 = "pashupatastra";
	String res3 = "nandiastra";
	@Override
	
	public void run() {
		if(Thread.currentThread().getName().equalsIgnoreCase("Arjuna")) {
			arjunaAcq();
		}
		else {
			KarnaAcq();
			
		}
		
	}
	


private void KarnaAcq() {
	try {
		synchronized (res1) {
			System.out.println("Karna Has acquired : "+res1);
			Thread.sleep(3000);
			synchronized (res2) {
				System.out.println("Karna Has acquired : "+res2);
				Thread.sleep(3000);
				synchronized (res3) {
					System.out.println("Karna Has acquired : "+res3);
					Thread.sleep(3000);
				}
			}
		}
	}



catch (Exception  e) {
	e.printStackTrace();
	
}
}

private void arjunaAcq() {
	try {
		synchronized (res1) {
			System.out.println("Arjuna Has acquired : "+res1);
			Thread.sleep(3000);
			synchronized (res2) {
				System.out.println("Arjuna Has acquired : "+res2);
				Thread.sleep(3000);
				synchronized (res3) {
					System.out.println("Arjuna Has acquired : "+res3);
					Thread.sleep(3000);
				}
			}
		}
	}
	catch (Exception  e) {
		e.printStackTrace();
	}
}
}

	




public class Launchwarrior {
	public static void main(String[] args) {
		warrior w1 = new warrior();
		w1.setName("arjuna");
		warrior w2 = new warrior();
		w2.setName("Karna");
		
		w1.start();
		w2.start();
		
	}

}
