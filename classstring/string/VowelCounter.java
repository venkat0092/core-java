package string;

public class VowelCounter {
    public static void main(String[] args) {

        String inputString = "find a vowel";

        inputString = inputString.toLowerCase();
        int vowelCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            if (currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
