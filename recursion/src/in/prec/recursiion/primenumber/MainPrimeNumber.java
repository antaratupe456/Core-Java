package in.prec.recursiion.primenumber;

public class MainPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber obj =new PrimeNumber();
//		demo.isPrime(30,2);
//		boolean result=obj.isPrime(5, 2);
		int primeNum=5;
		if(obj.isPrime(primeNum,2))
			System.out.println(primeNum +" is a Prime Num.");
		else
			System.out.println(primeNum + " is not a Prime Num");

	}

}
