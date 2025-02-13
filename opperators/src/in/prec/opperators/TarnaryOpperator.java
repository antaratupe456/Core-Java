package in.prec.opperators;

public class TarnaryOpperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//      int a = 10;
//      int b = 2;
//       String  result = (a>b)?"A is Greater": "B is Greater";
//       System.out.println(result);
        int a=20;int b=10;int c=5;
        int largest = (a>b)?(a>c)?a:c:(b>c)?b:c;
        System.out.println(largest);
	}

}
