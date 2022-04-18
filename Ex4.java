package code;

import java.util.HashMap;

public class Ex4 {

	public static void main(String[] args) {
		String inputStr = "Hello World";
		HashMap<String, Integer> resMap = new HashMap<String, Integer>();
		
		//replace white space and split into array
		String[] splitArr = inputStr.replace(" ", "").split("");
		
		//loop through array
		for (int i = 0; i < splitArr.length; i++) {
			//set single letter as a key in map
			//check this key has value or not
			if(resMap.get(splitArr[i]) == null) {
				//set value by 1
				resMap.put(splitArr[i], 1);
			}else {
				//increase value by 1 and update map
				int tempValue = resMap.get(splitArr[i]) + 1;
				resMap.put(splitArr[i], tempValue);
			}
		}
		
		//loop through map and print result
		for(String key : resMap.keySet()) {
			System.out.println("There are " + resMap.get(key) + " letter(s) " + key + " in given string");
		}

	}

}
