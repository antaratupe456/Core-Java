package scannerDemo;
import java.util.Scanner;
public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("enter a integer no.");
     int Var=sc.nextInt();
     System.out.println(Var);
//     sc.nextLine();
//     String add=sc.nextLine();
//     System.out.println(add);
     System.out.println("enter a character");
     char chharVar=sc.next().charAt(0);
     System.out.println(chharVar);
     sc.close();
     
	}

}
