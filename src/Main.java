import java.util.Scanner;
import java.util.Random;


public class Main {

	public static void main(String[] args) {
		int size ;
		int[] numbers;
		Scanner in = new Scanner(System.in);
		
		Random rand = new Random();
		
		int[] origional = new int[rand.nextInt(1000)];
		for(int i = 0; i < origional.length; i++){
			origional[i] = (int) rand.nextInt(10000);
		}
		
		
		BubbleSort bs = new BubbleSort();
		LinearInsertion li = new LinearInsertion();
		
		
		System.out.println("------------Bubble Sort--------------");
		print(origional);
		print(bs.sort(origional));
		
		for(int i = 0; i < origional.length; i++){
			origional[i] = (int) rand.nextInt(300);
		}
		
		System.out.println("------------Linear Insertion Sort--------------");		
		print(origional);
		print(li.sort(origional));
		
		
		System.out.println("------------Binary search--------------");
		BinarySearch bin_search = new BinarySearch();
		System.out.print("Number to search:");
		System.out.println(bin_search.search(origional,0, origional.length-1, in.nextInt()));

	}
	
	public static void print(int[] numbers){
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i]+ " ");
		}
		System.out.println();
	}

}
