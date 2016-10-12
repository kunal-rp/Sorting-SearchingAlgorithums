import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		int size ;
		int[] numbers;
		Scanner in = new Scanner(System.in);
		
		Random rand = new Random();
		
		int[] origional = new int[rand.nextInt(10)];
		for(int i = 0; i < origional.length; i++){
			origional[i] = (int) rand.nextInt(300);
		}
		
		
		
		System.out.println("------------Bubble Sort--------------");
		BubbleSort bs = new BubbleSort(origional);
		bs.print();
		bs.sort();
		bs.print();
		
		for(int i = 0; i < origional.length; i++){
			origional[i] = origional.length-i;//(int) rand.nextInt(300);
		}
		
		System.out.println("------------Linear Insertion Sort--------------");
		LinearInsertion li = new LinearInsertion(origional);
		li.print();
		li.sort();
		li.print();
		
		
		System.out.println("------------Binary search--------------");
		BinarySearch bin_search = new BinarySearch(origional);
		System.out.print("Number to search:");
		System.out.println(bin_search.search(0, origional.length-1, in.nextInt()));

	}

}
