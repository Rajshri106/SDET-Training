package MediumDificultyAssignment;

public class MixString {
    public void calculateMixString(String firstString, String secondString) {
        int firstStringLen = firstString.length();
        int secondStringLen = secondString.length();
        int max = firstStringLen + secondStringLen;
        String word = "";
        for (int i = 0; i < max; i++) {
            if (i <= firstStringLen - 1)
                word += firstString.substring(i, i + 1);
            if (i <= secondStringLen - 1) {
                word += secondString.substring(i, i + 1);
            }
        }
        System.out.println(word);
    }

    public static void main(String[] args) {
        MixString mixString = new MixString();
        String firstString = "abc";
        String secondString = "xyz";
        mixString.calculateMixString(firstString, secondString);
    }
}