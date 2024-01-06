/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    public static String uniqueChars(String s) {  
        String newStr = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (newStr.indexOf(c) == -1)  {
                newStr += c;       
            } else if (c == ' ') {
                newStr += c; 
            }
        }

        return newStr;
    }
}

