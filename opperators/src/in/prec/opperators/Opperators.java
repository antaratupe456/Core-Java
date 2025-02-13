package in.prec.opperators;

public class Opperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a = 10;
//		a= a+10.23F;  // Not Possible implicitly
//     	a+=10.23F;  // possible implicitle without need of explicitly Type caste
//		System.out.print(a);

		
		//logical bitwise operator
		
//		int b = 10;
//		System.out.print(Integer.toBinaryString(b));
//		b>>=2;
//		System.out.println(Integer.toBinaryString(b));
//		int C= 20;
//		System.out.println(Integer.toBinaryString(C));
//		int Result =~C;
//		System.out.println(Integer.toBinaryString(Result));
		int D = 30;
		int Result = (D>>2 ^ 5);
		System.out.println(Result);

	}

}
