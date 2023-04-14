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
        StringBuilder word = new StringBuilder();
        String extraString = "";
        int index = 0;
        while (index < maxLen + 1) {
            word.append(firstString.charAt(index));
            word.append(secondString.charAt(index));
            index++;
            if (index == firstStringLen) {
                break;
            } else {
                extraString += secondString.substring(index + 1, secondStringLen);
            }
        }
        System.out.println("Same Length Mix String is: " + word);
        System.out.println("Extra String is: " + extraString);
        System.out.println("Mixstring is: " + word + extraString);
    }

    public static void main(String[] args) {
        MixString mixString = new MixString();
        String firstString = "Hi";
        String secondString = "There";
        mixString.findMixString(firstString, secondString);
    }
}
/*output
Same Length Mix String is: HTih
Extra String is: ere
Mixstring is: HTihere
 */