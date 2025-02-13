
package in.prec.logicalPrograms;

public class CharacterCount {

	String data;

	public CharacterCount(String data) {
		this.data = data;
	}

	public CharacterCount() {
		// TODO Auto-generated constructor stub
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	public void countVowelsFromString() {
		int countA=0;
		int countE=0;
		int countI=0;
		int countO=0;
		int countU=0;
		int countCons=0;
		for(int i=0;i<data.length();i++) {
			switch(data.charAt(i)) {
			case 'a'-> countA++;
			case 'e'-> countE++;
			case 'i'-> countI++;
			case 'o'-> countO++;
			case 'u'-> countU++;
			default -> countCons++;
			
			}
		}
//		System.out.print( "A :"+countA );
//		System.out.print( "E :"+countE );
//		System.out.print( "I :"+countI );
//		System.out.print( "O :"+countO );
//		System.out.print( "U :"+countU );	
	
		
		
	
		System.out.print((char) (countA + 64));
		System.out.print( (char) (countE + 64));
		System.out.print( (char) (countI + 64));
		System.out.print( (char) (countO + 64));
		System.out.print( (char) (countU + 64));
		System.out.print( (char) (countCons + 64));
		
	}
	
}
