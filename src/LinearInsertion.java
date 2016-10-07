
public class LinearInsertion {

	int[] numbers;
	
	public LinearInsertion(int[] numbers){
		this.numbers = numbers;
	}
	
	
	public void sort(){
		
		for(int i = 0; i < numbers.length-1; i++){
			int temp = numbers[i+1];
			int j = i;
			while(j >=0 && numbers[j]>temp){
				numbers[j+1] = numbers[j];
				j = j-1;
			}
			numbers[j+1] = temp;
			
		}
	}
	
	public void print(){
		for(int i = 0; i < numbers.length; i++){
			System.out.print(numbers[i]+ " ");
		}
		System.out.println();
	}
	
}
