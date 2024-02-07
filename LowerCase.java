/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
      // create a new string
      String lowcase = "";

      // switch letters for lowercase characters
      for (int i = 0; i <= s.length()-1; i++) {
          char ch = s.charAt(i);
          if (ch <= 90 && ch >= 65) {
              char charLowcase = (char) (ch + 32);
              lowcase += charLowcase;
          } else {
              lowcase += ch;
          }
      }
  
      return lowcase;
  }
}