package in.prec.recursion;

public class RecursionDemo {

	public void print(int no) {
		
		//Base Condition 
		if(no>1)
		  print(no-1);
//		else
		System.out.println(no+10);
		
//	System.out.println("hi");	
	}
	
	
	
	/// factorial of the no. using recursion method
	
	public int print1(int no) {
//		if(no<=0)
//			return 1;
//		else 
//			return no*print1(no-1);
		
		return (no<=0) ? 1: no*print1(no-1);
	}
}
