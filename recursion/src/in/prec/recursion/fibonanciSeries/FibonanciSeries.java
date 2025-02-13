package in.prec.recursion.fibonanciSeries;

public class FibonanciSeries {
	
	public int fibonanciNo(int num) {
		if(num<=1)
			return num;
		return fibonanciNo(num-1)+fibonanciNo(num-2);
		
	}

}
