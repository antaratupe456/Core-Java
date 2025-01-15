package in.prec.logicalPrograms;



public class MainPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNum Prime=new PrimeNum();
		int Variable=32;
		Prime.setNum(Variable);
		if(Prime.isPrimeNum())
			System.out.println(Variable + " is a Prime num.");
		else
			System.out.print(Variable + " is not  a Prime num.");

	}

}
