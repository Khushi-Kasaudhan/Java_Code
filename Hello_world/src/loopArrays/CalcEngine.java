package loopArrays;

public class CalcEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		double[] leftVal = {100.0d, 25.0d, 225.0d, 11.0d};
//		double[] rightVal = {50.0d, 92.0d, 17.0d, 3.0d};
//		double[] opCode = {'d', 'a', 's', 'm'};
//		double[] result = new double[opCode.length];
//		for(int i=0; i<opCode.length; i++) {
//			if(opCode[i] == 'a')
//				result[i] = leftVal[i] + rightVal[i];
//			else if(opCode[i]=='s')
//				result[i] = leftVal[i] - rightVal[i];
//			else if(opCode[i]=='d')
//				result[i] = rightVal[i]!= 0.0d ? leftVal[i]/rightVal[i] : 0.0d;
//			else if(opCode[i] == 'm')
//				result[i] = leftVal[i] * rightVal[i];
//			else {
//				System.out.println("Error");
//			    result[i] = 0.0d;
//			}
//		}
//		for(double theRes : result) {
//			System.out.println(theRes);
//		}
		
		
		
		
		
		
		double[] leftVal = {100.0d, 25.0d, 225.0d, 11.0d};
		double[] rightVal = {50.0d, 92.0d, 17.0d, 3.0d};
		char[] opCode = {'d', 'a', 's', 'm'};
		double[] result = new double[opCode.length];
		for(int i=0; i<opCode.length; i++) {
		  switch(opCode[i]) {
			case 'a':
				result[i] = leftVal[i] + rightVal[i];
				break;
			case 's':
				result[i] = leftVal[i] - rightVal[i];
				break;
			case 'd' :
				result[i] = rightVal[i]!= 0.0d ? leftVal[i]/rightVal[i] : 0.0d;
				break;
			case 'm':
				result[i] = leftVal[i] * rightVal[i];
				break;
			default:
				System.out.println("Error");
			    result[i] = 0.0d;
			    break;
			
		  }
		}
		for(double theRes : result) {
			System.out.println(theRes);
		}
	}

}
