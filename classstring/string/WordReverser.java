package string;

    public class WordReverser {
        public static void main(String[] args) {
            String inputSentence = "Java J2EE Reverse Me";
            String reversedSentence = reverseWords(inputSentence);

            System.out.println("Input Sentence: " + inputSentence);
            System.out.println("Reversed Sentence: " + reversedSentence);
        }

        private static String reverseWords(String sentence) {
            // Split the sentence into words
            String[] words = sentence.split(" ");

            // Reverse each word
            StringBuilder reversedSentence = new StringBuilder();
            for (String word : words) {
                String reversedWord = reverseWord(word);
                reversedSentence.append(reversedWord).append(" ");
            }

            // Remove the trailing space and return the result
            return reversedSentence.toString().trim();
        }

        private static String reverseWord(String word) {
            // Reverse the word using StringBuilder
            return new StringBuilder(word).reverse().toString();
        }
    }


