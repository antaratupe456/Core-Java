package in.prec.logicalPrograms;

public class PerfectNum {
	int num;
	public PerfectNum() {}
    public PerfectNum(int num) {
    	this.num=num;
    }
	public void setNum(int num) {
		this.num=num;
	}
	public int getNum() {
		return num;
	}
	public boolean isPerfectNum() {
		int sum=0;
		for(int i=1;i<=num/2;i++) {
			if(num%1==0)
				sum+=i;
			
//		return (sum==num);
		}return (sum==num);
	}

}
