import java.util.Arrays;

public class InsertionSort{


	public static void sortingMethod(int[] arrayToSort){
		for(int i = 1; i < arrayToSort.length; i++){
			int numberInQuestion = arrayToSort[i];
			int j = i;

			while( i > 0 ){
				if( arrayToSort[j - 1] > numberInQuestion){
					arrayToSort[j] = arrayToSort[j - 1 ];
					j = j - 1;
				}else{
					break;
				}
			}
			arrayToSort[j] = numberInQuestion;

		}
	}

	public static void main(String[] args){

		int testArray[] = {1,4,2,5,7,3,53,4};
		System.out.println(Arrays.toString(testArray));
		sortingMethod(testArray);
		System.out.println(Arrays.toString(testArray));


	}

}