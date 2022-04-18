package code;

public class Ex2 {

	public static void main(String[] args) {
		int[] arr = {1, 2, 1, 2, 3, 2, 2, 4, 5, 1, 3};
		int[] countArr = new int[10];
		
		//loop through arr
		for (int i = 0; i < arr.length; i++) {
			//set value of arr as key of countArr
			//count value of arr by increasing 1 at value of countArr
			countArr[arr[i]] += 1;
		}
		
		int countCouples = 0;
		
		//loop through countArr
		for (int i = 0; i < countArr.length; i++) {
			//sum of couples
			//devide by 2 to get exactly num of couples from count
			countCouples += countArr[i]/2;
		}
		
		System.out.println(countCouples);
	}

}
