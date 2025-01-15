package in.prec.logicalPrograms;

public class PrimeNumOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		for (num=3;num<=40;num++) {
		for(int i=2;i<=num-1;i++) {
			if(num%i==0) {
				System.out.println(num + " is not Prime No.");
				break;
				}
			 else {
					if(num-1!=0) {
						System.out.println(num +  " is prime No.");
                        break;						
						
					}
			 }
		}
		}
	}

}
