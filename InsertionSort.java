

public class InsertionSort{



	public static int[] sortingMethod(int[] arrayToSort){
		for(int i = 1; i < arrayToSort.length; i++){
			numberInQuestion = arrayToSort[i];
			int j = i;

			while( i > 0 ){
				if( arrayToSort[j - 1] > numberInQuestion){
					arrayToSort[j] = arrayToSort[j - 1 ];
					j = j - 1;
				}else{
					break;
				}
			}
			arrayToSort[j] = numberInQuestion

		}

	}

	public static void main(String[] args){

	}




}