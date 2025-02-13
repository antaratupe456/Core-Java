package in.prec.typecasting;

public class TypeCastingProg {
   public void typeCasteFromIntToFloat() {
	   int intVar = 100;
	   float floatVar = 1098.98F;
	   floatVar=intVar;
	   System.out.println(floatVar);
	   
   }
   public void typeCasteFromFloatToInt() {
	   int intVar = 100;
	   float floatVar=1000.2F;
	   intVar=(int)floatVar;
	   System.out.print(intVar);
   }
}
