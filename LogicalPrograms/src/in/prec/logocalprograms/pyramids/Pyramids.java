package in.prec.logocalprograms.pyramids;

public class Pyramids {
    
	int level;
	
	public Pyramids() {}
    public Pyramids(int level) {
    	
    	this.level=level;
    	
    }	
    
    public void setLevel(int level) {
    	this.level=level;
    	
    }
    
    public int getLevel() {
    	return level;
    	
    }
    
    public void printPyramid() {
    	int i=1;
    	for (int row=1;row<=level;row++) {
    		for(int space=1;space<=level-row;space++) {
    			System.out.print(" ");
    		}
    			for(int col=1;col<=row;col++) {
    			System.out.print(i++ + " ");
    			
    		    }
    		System.out.println();
    	}
    }
    
    
}
