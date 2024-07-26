package helloworld;

public class TypeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           float floatVal = 1.0f;
           double doubleVal = 4.0d;
           byte byteVal = 7;
           short shortVal =7;
           long longVal = 5;
           
//           short result1 = byteVal;
           short result1 = (short)longVal ;
           
           System.out.println("success");
	}

}
