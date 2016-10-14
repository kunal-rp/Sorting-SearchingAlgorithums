
public class LinearInsertion {


	public int[] sort(int[] numbers){
		int numberOfOperations = 0;
		for(int i = 0; i < numbers.length-1; i++){
			numberOfOperations++;
			int temp = numbers[i+1];
			int j = i;
			while(j >=0 && numbers[j]>temp){
				numberOfOperations++;
				numbers[j+1] = numbers[j];
				j = j-1;
				numberOfOperations++;
			}
			numbers[j+1] = temp;
			numberOfOperations++;
			
		}
		System.out.println("Number Of Operations: "+numberOfOperations);
		return numbers;
	}
	
	
	
}
