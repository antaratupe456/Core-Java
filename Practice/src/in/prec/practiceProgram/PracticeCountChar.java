package in.prec.practiceProgram;

public class PracticeCountChar {
	String name;

	public PracticeCountChar(String name) {
		this.name = name;
	}

	public PracticeCountChar() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void CountChar() {
		int countA=0;
		int countE=0;
		int countI=0;
		int countO=0;
		int countU=0;
		int countCons=0;
		for(int i=0;i<name.length();i++) {
			switch (name.charAt(i)) {
			case 'a' -> countA++;
			case 'e' -> countE++;
			case 'i' -> countI++;
			case 'o' -> countO++;
			case 'u' -> countU++;
			default -> countCons++;
			}
		}
//		System.out.println("A : "+ countA);
//		System.out.println("E : "+ countE);
//		System.out.println("I : "+ countI);
//		System.out.println("O : "+ countO);
//		System.out.println("u : "+ countU);
//		System.out.println("Other Character : "+ countCons);
		
		System.out.print((char) (countA + 64));
    	System.out.print((char) (countE + 64));
		System.out.print((char) (countI + 64));
		System.out.print((char) (countO + 64));
		System.out.print((char) (countU + 64));
	}
	

}
