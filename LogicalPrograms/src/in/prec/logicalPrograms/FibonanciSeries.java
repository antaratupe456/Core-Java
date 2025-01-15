package in.prec.logicalPrograms;
import java.util.*;

public class FibonanciSeries {
	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int sum=0;
		int limit;
		System.out.print("Enter limit of Fibonanci Series ");
		Scanner sc=new Scanner(System.in);
		limit=sc.nextInt();
		System.out.print("0 \t1\t");
		for(int i=0;i<limit-2;i++) {
			sum=num1+num2;
			System.out.print(sum + "\t ");
			num1=num2;
			num2=sum;
	}
sc.close();
	}
}
