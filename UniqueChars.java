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
        // create new string
        String lowcase = "";

        // switch letters for low case charcters
        for (int i = 0; i <= s.length()-1; i++) {
        char ch = s.charAt(i);
            if (ch <= 90 && ch >= 65) {
                char charlowcase = (char) (ch + 32);
                lowcase = lowcase + charlowcase;
            } else {
                lowcase = lowcase + ch;
            }
            }
    
        return lowcase;}
    }
