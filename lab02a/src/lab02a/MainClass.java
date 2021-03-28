package lab02a;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] arr1 = {};
		System.out.println("Empty Array search result  : " + mySearch(arr1, 0));
		
		Integer[] arr2 = {5,6,9,8,7,4};
		System.out.println("8 in array is at index : " + mySearch(arr2, 5));
		

		Integer[] arr3 = {5,6,9,8,7,4};
		System.out.println("100 in array is at index : " + mySearch(arr3, 100));
		
		Character[] arr4 = {'5','a','z'};
		System.out.println("z in array is at index : " + mySearch(arr4, 'z'));
		
		
		String[] arr5 = {"Tom", "Jerry", "Clarke"};
		System.out.println("Jerry in array is at index : " + mySearch(arr5, "Jerry"));
		
		
	}

	public static <T> int mySearch(T[] inputArray, T n) {
		for (int i = 0; i < inputArray.length; i++) {
			if (inputArray[i] == n) {
				return i;
			}
		}
		return -1;
	}
}
