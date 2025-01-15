package in.prec.logicalPrograms;



public class MainArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstrongNum obj=new ArmstrongNum();
		int variable;
//		obj.setNum(variable);
		for(variable = 1; variable<=1000;variable++) {
			obj.setNum(variable);
		if(obj.isArmstrongNum())
			System.out.println(variable + " is a armstrong no");
//		else
//			System.out.print(variable + " is not a armstrong no");
		
		}
	}

}
