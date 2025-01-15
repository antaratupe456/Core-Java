package in.prec.logicalPrograms;



public class MainPalindromNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PalindromNum number = new PalindromNum();
		int num =432;
		number.setNum(432);
		int result;
		result=number.reverseNum();
		if(number.isPallindrome())
			System.out.print(num + "is a Palindrome");
		else
			System.out.print(num + "is not a Palindrome");
		
		}
	}


