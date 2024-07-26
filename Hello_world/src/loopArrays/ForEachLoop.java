package loopArrays;

public class ForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		float val[] = { 10.0f, 20.0f, 15.0f};
		float sum = 0.0f;
		for(float curr : val)
			sum += curr;
		System.out.println(sum);
	}

}
