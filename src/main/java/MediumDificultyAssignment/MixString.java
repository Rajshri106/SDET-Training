package MediumDificultyAssignment;

/*Q4. Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"*/
public class MixString {
    public void findMixString(String firstString, String secondString) {
        int firstStringLen = firstString.length();
        int secondStringLen = secondString.length();
        int maxLen = firstStringLen + secondStringLen;
        String word = "";
        for (int varOne = 0; varOne < maxLen; varOne++) {
            if (varOne <= firstStringLen - 1)
                word += firstString.substring(varOne, varOne + 1);
            if (varOne <= secondStringLen - 1)
                word += secondString.substring(varOne, varOne + 1);
        }
        System.out.println("Mixstring is: " + word);
    }

    public static void main(String[] args) {
        MixString mixString = new MixString();
        String firstString = "abc";
        String secondString = "xyz";
        mixString.findMixString(firstString, secondString);
    }
}
/*output
Mixstring is: axbycz
*/