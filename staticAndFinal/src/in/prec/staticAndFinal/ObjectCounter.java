package in.prec.staticAndFinal;

public class ObjectCounter {
	
	static int objectcounter;
	static{
		
	}
	int counter;
	public ObjectCounter() {
		objectcounter++;
		counter++;
	}
	public  static void Print1(int param) {
		System.out.println("Static Method " + param);
	}
	public void Print() {
		System.out.println(" Static Var :  "+objectcounter);
		System.out.println("Non Static Var : " + counter);
	}

}
