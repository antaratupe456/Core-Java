package in.prec.logicalPrograms;

public class PrimeNum {
	int num;
	public PrimeNum() {}
	public PrimeNum(int Num) {
		this.num=num;
	}
	public void setNum(int Num) {
		this.num=num;
	}
	public int getNum() {
		return num;
	}
	public boolean isPrimeNum() {
		boolean isPrime=true;
		for(int i=2;i*i<=num-1;i++) {
			if(num%i==0) {
//				isPrime=false;
//				break;
				return false;
		
			}
			return true;
//			if(isPrime)
//				return true;
//			else
////				return false;
//        	return isPrime;
		}
		return isPrime;
	}

}
