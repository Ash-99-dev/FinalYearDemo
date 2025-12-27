package mainSignature;

public class mainSignatureAllowed {

	public static void main(String[] args) {
		mainSignatureAllowed.main();
		System.out.println("String main allowed argument");
	}
	
	public static void main(int[] args) {
		System.out.println("integer allowed argument");
	}
	
	public static void main(char args) {
		int []arr = {1,2,3};
		mainSignatureAllowed.main(arr);
		System.out.println("character allowed argument");
	}
	
	public static void main() {
		mainSignatureAllowed.main('a');
		System.out.println("No parameter allowed argument");
	}

}
