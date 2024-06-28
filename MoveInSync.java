package in.interview;

public class MoveInSync {
	// Method that returns the count of the given 
    // character in the string 
    public static long count(String s, char ch) 
    { 
  
        return s.chars() 
            .filter(c -> c == ch) 
            .count(); 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        String str = "geeksforgeeks"; 
        char c = 'e'; 
        System.out.println(count(str, c)); 
    } 
} 
/*
public class MoveInSync {
    // Method that returns the count of the given 
    // character in the string 
    public static long count(String s, char ch) {
        long count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                count++;
            }
        }
        return count;
    }

    // Driver method 
    public static void main(String args[]) {
        String str = " public static void main(String args[]) ";
        char c = '[';
        System.out.println(count(str, c));
    }
}*/
