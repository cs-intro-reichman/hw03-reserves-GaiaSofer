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
        String newString = "" + s.charAt(0);
    
        // checks for duplicate characters
        for (int i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
    
            // check if ch is already in newString
            if (newString.indexOf(ch) == -1) {
                newString = newString + ch;
            }
        }
    
        return newString;
    }
}