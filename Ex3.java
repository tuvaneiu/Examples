package code;

public class Ex3 {

	public static void main(String[] args) {
		int inputNum = 1634;
		
		//split input number into array
		String[] splitArr = String.valueOf(inputNum).split("");
		
		int lengthOfInputNum = splitArr.length;
		int sum = 0;
		
		//loop through splitArr
		for (int i = 0; i < lengthOfInputNum; i++) {
			//sum of single number power length
			sum += (int) Math.pow(Double.parseDouble(splitArr[i]), lengthOfInputNum);
		}
		
		//check sum is equal with inputNum or not
		if(sum == inputNum) {
			System.out.println("This is an Armstrong number!");
		}else {
			System.out.println("This is not an Armstrong number!");
		}
	}

}
