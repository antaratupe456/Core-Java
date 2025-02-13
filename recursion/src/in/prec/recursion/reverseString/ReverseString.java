package in.prec.recursion.reverseString;

public class ReverseString {
	
	public void reverseString(char[] charArray, int i) {
		if (i<(charArray.length-1))
			reverseString(charArray,i+1);
		
		
			System.out.println(charArray[i]);
		
		
	}

	
}
