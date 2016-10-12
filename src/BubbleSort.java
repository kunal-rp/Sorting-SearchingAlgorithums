
public class BubbleSort {
	
	
	public int[] sort(int[] numbers){
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
		return numbers;
		
	}
	
	
	
	
	
	
}
