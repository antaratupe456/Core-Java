package in.prec.series;

import java.util.Scanner;

public class Series2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	 	0  3  25  15  124  35  342
			int limit;
			System.out.println("Enter Limit of Series ");
			Scanner sc = new Scanner(System.in);
			limit=sc.nextInt();
			for(int i=1;i<limit;i++) {
				if(i%2==0) {
					System.out.print((i*i)-1 + " ");
				}
				else
					System.out.print((i*i*i)-1 + " ");
			}
			sc.close();

	}

}
