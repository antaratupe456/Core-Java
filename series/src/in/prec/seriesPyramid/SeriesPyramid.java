package in.prec.seriesPyramid;

public class SeriesPyramid {
	public static void main(String[] args) {
		
		int i=1;
		int level=3;
    	for (int row=1;row<=level;row++) {
    		for(int space=1;space<=level-row;space++) {
    			System.out.print("    ");
    		}
    			for(int col=1;col<=row;col++) {
    				if(row%2==0) {
    					System.out.print(i*i + "      ");
    				}
    				else
    					System.out.print(i*i*i + "    ");
    				i++;
    			
    		    }
    		System.out.println();
    	}
    }

}
	

