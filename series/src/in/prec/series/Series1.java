package in.prec.series;
import java.util.*;

public class Series1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 	1  4  27  16  125  36  343
		int limit;
		System.out.println("Enter Limit of Series ");
		Scanner sc = new Scanner(System.in);
		limit=sc.nextInt();
		for(int i=1;i<limit;i++) {
			if(i%2==0) {
				System.out.print(i*i + " ");
			}
			else
				System.out.print(i*i*i + " ");
		}
		sc.close();
	}

}
