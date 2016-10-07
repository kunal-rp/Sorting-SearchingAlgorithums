
public class BubbleSort {
	
	int[] numbers;
	
	public BubbleSort(int[] numbers){
		this.numbers = numbers;
	}
	
	public void sort(){
		int numberOfOperations = 0;
		for(int endIndex = numbers.length; endIndex >0; endIndex-- ){
			for(int startIndex = 0; startIndex <endIndex-1; startIndex++ ){
				if(numbers[startIndex]>numbers[startIndex+1]){
					int temp = numbers[startIndex+1];
					numbers[startIndex+1] = numbers[startIndex];
					numbers[startIndex] = temp;
					numberOfOperations++;
				}
				numberOfOperations++;
			}
			numberOfOperations++;
			
			
		}
		System.out.println("Number of Operations:"+ numberOfOperations);
		
	}
	
	public void print(){
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i]+ " ");
		}
		System.out.println();
	}
	
	
	
	
}
