package in.prec.recursiion.primenumber;

public class PrimeNumber {

	public boolean isPrime(int num,int div) {
		if(num==2)
			return true;
		if(num<2)
			return false;
		if(div*div>num) 
			return true;
		if(num%div==0)
			return false;
		
		return isPrime(num,div+1);
		
	}
}
