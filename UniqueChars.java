/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // create a new string
        String lowcase = "";
    
        // switch letters for lowercase characters
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch)) {
                char charLowcase = (char) (ch + 32);
                lowcase += charLowcase;
            } else {
                lowcase += ch;
            }
        }
    
        return lowcase;
    }
}