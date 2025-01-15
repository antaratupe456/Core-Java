package in.prec.logicalPrograms;



public class MainPerfectNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PerfectNum num= new PerfectNum();
		int var=16;
		
		num.setNum(var);
		if(num.isPerfectNum())
			System.out.println(var + " is a Perfect Num");
		else
			System.out.println(var + " is not a Perfect Num");

	}

}
