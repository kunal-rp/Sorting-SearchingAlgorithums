
public class BinarySearch {

	int[] numbers;
	
	public BinarySearch(int[] numbers){
		this.numbers = numbers;
	}
	
	public int search(int startIndex, int endIndex, int numberWanted){
		
		int center =( endIndex+startIndex  )/ 2;
		if(numbers[center] == numberWanted){
			return center;
		}
		else if(startIndex != endIndex){
			
			if(numbers[center] < numberWanted){
				return search(center+1, endIndex, numberWanted);
			}
			else if(numbers[center] > numberWanted){
				return search(startIndex, center-1, numberWanted);
			}
		}
		
			return -1;
		
	}
	
}
