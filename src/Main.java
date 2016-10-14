import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		int size ;
		int[] numbers;
		Scanner in = new Scanner(System.in);
		
		Random rand = new Random();
		
		int[] origional1 = new int[rand.nextInt(1000)];
		int[] origional2 = new int[origional1.length];
		for(int i = 0; i < origional1.length; i++){
			origional1[i] = (int) rand.nextInt(10000);
			origional2[i] = origional1[i];
		}
		
		
		BubbleSort bs = new BubbleSort();
		LinearInsertion li = new LinearInsertion();
		
		
		System.out.println("------------Bubble Sort--------------");
		print(origional1);
		System.out.println("Size: "+ origional1.length);
		print(bs.sort(origional1));
		
		
		
		System.out.println("------------Linear Insertion Sort--------------");		
		print(origional2);
		System.out.println("Size: "+ origional2.length);
		print(li.sort(origional2));
		
		
		System.out.println("------------Binary search--------------");
		BinarySearch bin_search = new BinarySearch();
		System.out.print("Number to search:");
		System.out.println(bin_search.search(origional2,0, origional2.length-1, in.nextInt()));

	}
	
	public static void print(int[] numbers){
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i]+ " ");
		}
		System.out.println();
	}

}
