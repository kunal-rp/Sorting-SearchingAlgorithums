import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int size ;
		int[] numbers;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Size of array");
		size = in.nextInt();
		numbers = new int[size];
		
		for(int i = 0; i < size; i++){
			System.out.print("Enter number:");
			numbers[i] = in.nextInt();
		}
		
		/*
		System.out.println("------------Bubble Sort--------------");
		BubbleSort bs = new BubbleSort(numbers);
		bs.print();
		bs.sort();
		bs.print();
		*/
		
		System.out.println("------------Linear Insertion Sort--------------");
		LinearInsertion li = new LinearInsertion(numbers);
		li.print();
		li.sort();
		li.print();

	}

}
