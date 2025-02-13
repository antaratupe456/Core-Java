package in.prec.recursion.base_expo;

public class BaseExponatial {
	
	public int baseExpo(int base, int exp) {
		
		if (exp<=1)
			return base;
		else
		return base*baseExpo(base,exp-1);
		
		// return (exp<=1)? base:base*baseExpo(base,exp-1);
		
		
	}

}
