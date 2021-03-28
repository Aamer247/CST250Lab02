package lab02b;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr2 = {5,6,9,8,7,4};
		
		mySort(arr2);
		
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]+" ");
		}
	}

	private static void mySort(int[] inputArray) {
		int arraySize = inputArray.length;
		for (int i = 0; i < arraySize - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arraySize; j++) {
				if (inputArray[j] < inputArray[index]) {
					index = j;
				}
			}
			int temp = inputArray[i];
			inputArray[i] = inputArray[index];
			inputArray[index] = temp;
		}
	}
}
