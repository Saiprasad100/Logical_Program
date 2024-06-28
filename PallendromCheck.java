package in.interview;


//Clarivate Company
//Date-27/06/2024
public class PallendromCheck {
	
	public static void main(String[] args) {
		// String original;

		// Scanner in= new Scanner(System.in);
		// System.out.println("Enter a String / Number");

		// original = in.nextLine();
		String reverse = "";
		String original = "Madam";

		int length = original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		if (original.equalsIgnoreCase(reverse)) {
			System.out.println(" Pallendrom");
		} else
			System.out.println("Not Pallendrom");

	}
}
	
	/*
	public static void main(String[] args) {

		int r;
		int sum = 0;
		int temp;

		int n = 121;
		temp = n;
		while (n > 0) {
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;

		}
		if (temp == sum) {
			System.out.println("palindrom");
		} else {
			System.out.println("Not palindrom");
		}
	}

}*/
