package in.prec.logicalPrograms;

import java.util.Scanner;

public class MainReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Scanner sc = new Scanner(System.in);
//ReverseString rs=new ReverseString();
//System.out.println("Enter a Name to reverse : ");
//		String name=sc.next();
//		rs.setName(name);
//		System.out.println(rs.reverseString());
//		sc.close();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Statement to reverse : ");
		String name=sc.nextLine();
		ReverseString rs=new ReverseString();
		rs.setName(name);
//		rs.reverseStringLine();
		System.out.println(rs.reverseStringLine());
		sc.close();
	}

}
