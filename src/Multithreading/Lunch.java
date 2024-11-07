package Multithreading;

class producer extends Thread{
	Queue a;
	producer(Queue q){
		a= q;
	}
		@Override
		public void run() {
			int i=1;
			while(true) {
				a.put(i);
				i++;
			}
		}
	}
	
	class consumer extends Thread{
		Queue b;
		consumer(Queue q){
			b=q;
			
		}
		@	Override
		public void run() {
			while(true) {
				b.get();
			}
		}
	
	
	}
	class Queue{
		int x;
		public void put(int i) {
			x=i;
			System.out.println("The producer has producer the value "+i+" into x");
			
		}
		public void get() {
			System.out.println("The producer has producer the value "+x+" into x");
			
		}
	}
	
	


public class Lunch {
public static void main(String[] args) {
	Queue q = new Queue();
	producer p = new producer(q);
	consumer c = new consumer(q);
	
	p.start();
	c.start();
}
}
