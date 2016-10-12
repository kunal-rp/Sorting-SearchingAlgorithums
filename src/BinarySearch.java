
public class BinarySearch {

	
	
	public int search(int[] numbers,int startIndex, int endIndex, int numberWanted){
		
		int center =( endIndex+startIndex  )/ 2;
		if(numbers[center] == numberWanted){
			return center;
		}
		else if(startIndex != endIndex){
			
			if(numbers[center] < numberWanted){
				return search(numbers,center+1, endIndex, numberWanted);
			}
			else if(numbers[center] > numberWanted){
				return search(numbers,startIndex, center-1, numberWanted);
			}
		}
		
			return -1;
		
	}
	
}
