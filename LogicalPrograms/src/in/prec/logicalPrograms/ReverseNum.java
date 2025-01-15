package in.prec.logicalPrograms;

public class ReverseNum {
	int num;
    public ReverseNum() {
 	   
    }
    public ReverseNum(int num) {
 	   this.num=num;
    }
    public void setNum(int num) {
 	   this.num=num;
    }
    public int getNum() {
 	   return num;
    }
    
    public void reverseNum() {
 	   int digit=0;
 	   int result=0;
 	   while (num>0) {

 		   digit=num%10;
 		   result=(result*10)+digit;
 		   num=num/10;
 		
 	   }

	  System.out.println(result);
    }
}
