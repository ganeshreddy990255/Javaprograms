

import java.util.Scanner;

class Bubble{
	int size;
	int[] arr;
	Scanner sc = new Scanner(System.in);

	public void CreateArray() {
		arr = new int[size];
		System.out.println("Array is created......");
		System.out.println("=========================");
	}

	public void addElements() {
     System.out.println("Adding elements into the Array: ");
     for(int i=0;i<size;i++) {
    	 arr[i] = sc.nextInt();
     }
	}
	void display() {
		System.out.println("The elements inside the array are: ");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public void sort( ) {
		System.out.println("Sorting process is initiated........");
		int temp=0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}


}
public class BubbleSort {
	public static void main(String[] args) {
		Bubble bs = new Bubble();
		bs.CreateArray();
		bs.addElements();
		bs.sort();
		bs.display();
	}
}










