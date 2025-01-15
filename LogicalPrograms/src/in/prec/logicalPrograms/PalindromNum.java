package in.prec.logicalPrograms;

public class PalindromNum {
	int num;

	public PalindromNum() {

	}

	public PalindromNum(int num) {
		this.num = num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getNum() {
		return num;
	}

	public int reverseNum() {
		int result = 0;
		int temp = num;
		while (temp != 0) {
			result = result * 10 + temp % 10;
			temp /= 10;

		}
		return result;
	}

	public boolean isPallindrome() {
		return (reverseNum() == num);

	}

}
