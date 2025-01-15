package in.prec.logicalPrograms;

public class ArmstrongNum {
	int num;
	public ArmstrongNum() {}
	public ArmstrongNum(int num) {
		this.num=num;
	}
	public void setNum(int num) {
		this.num=num;
	}
	public int getNum() {
		return num;
	}
    public int calculateNoOfDigit() {
    	int temp=num;
    	int i =0;
    	while(temp!=0) {
    		temp/=10;
    		i++;
    	}
    	
    	return i;
    }
    public int calculatePower(int base,int exp) {
     int power=1;
    	for (int i=0;i<exp;i++)
    		power*=base;
    	
    	return power;
    }
    
    public boolean isArmstrongNum() {
    	int temp=num;
    	int result=0;
    	int noOfDigit=calculateNoOfDigit();
//    	int noOfDigit=num+"".lenght();
    	while(temp!=0) {
    		result+=calculatePower(temp%10,noOfDigit );
    		temp/=10;
    	}
    	
    	return result==num;
    }

}
