package in.prec.logocalprograms.pyramids;

public class SecondPyramid {

	
int level;
	
	public SecondPyramid() {}
    public SecondPyramid(int level) {
    	
    	this.level=level;
    	
    }	
    
    public void setLevel(int level) {
    	this.level=level;
    	
    }
    
    public int getLevel() {
    	return level;
    	
    }
    
//    public void printPyramidStructure1() {
//
//    		System.out.println("/n");
//    	}
    
    public void printPyramidStructure2() {
    	
    	int num=1;
    	for(int row=1;row<=level;row++) {
    		for(int space=1;space<=level-row;space++)
    			System.out.print("\t");
    		for(int col=1;col<=(row*2-1);col++)
    			System.out.print(num++ + "\t");
    		System.out.println("\n");
    	}
    	
    }
    public void printPyramidStucture3() {
    	int num=0;
    	char charVar='A';
    	for (int row=1;row<=level;row++) {
    		for(int space=1;space<=level-row;space++)
    			System.out.print("\t");
    		for(int col=1;col<=(row*2)-1;col++) {
    			if(row%2==0) 
    				if(col%2==0)
    					System.out.print(num++ + "\t");
    				else
    					System.out.print(charVar++ + "\t");
    			else
    				if(col%2==0)
    					System.out.print(charVar++ + "\t");
    				else
                        System.out.print(num++ + "\t");
    			
    					
    		}
    		System.out.println();
    	}
    }
    
}
