package in.interview;

public class Occurance {
	public static void main(String[] args) {

		String st = "program";
		int[] freq = new int[st.length()];
		int i;
		int j;
		char array[] = st.toCharArray();

		for (i = 0; i < st.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < st.length(); j++) {
				if (array[i] == array[j]) {

					freq[i]++;

					array[j] = '0';
				}
			}
		}
		for (i = 0; i < freq.length; i++) {
			if (array[i] != ' ' && array[i] != '0') {
				System.out.println(array[i] + " " + freq[i]);
			}
		}
	}

}
