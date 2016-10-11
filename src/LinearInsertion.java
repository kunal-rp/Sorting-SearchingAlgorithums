
public class LinearInsertion {

	int[] numbers;
	
	public LinearInsertion(int[] numbers){
		this.numbers = numbers;
	}
	
	
	public void sort(){
		int numberOfOperations = 0;
		for(int i = 0; i < numbers.length-1; i++){
			int temp = numbers[i+1];
			int j = i;
			while(j >=0 && numbers[j]>temp){
				numbers[j+1] = numbers[j];
				j = j-1;
				numberOfOperations++;
			}
			numbers[j+1] = temp;
			numberOfOperations++;
			
		}
		System.out.println("Number Of Operations: "+numberOfOperations);
	}
	
	public void print(){
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i]+ " ");
		}
		System.out.println();
	}
	
}
