public class N_StringsAndStringBuilder {
    public static void main(String[] args) {
        System.out.println("STRINGS AND STRINGBUILDER");
        System.out.println("========================");

        // 1. Creating and joining strings
        String firstName = "Abdul";
        String lastName = "Ahad";
        String fullName = firstName + " " + lastName;
        System.out.println("\n1. Joining strings");
        System.out.println("Full name: " + fullName);

        // 2. Useful String properties and methods
        String message = "  Java is powerful  ";
        System.out.println("\n2. String properties and methods");
        System.out.println("Original: [" + message + "]");
        System.out.println("Length: " + message.length());
        System.out.println("Trimmed: [" + message.trim() + "]");
        System.out.println("Uppercase: " + message.toUpperCase());
        System.out.println("Lowercase: " + message.toLowerCase());

        // 3. Comparing strings by content
        String languageOne = new String("Java");
        String languageTwo = "Java";
        System.out.println("\n3. Comparing strings");
        System.out.println("Using equals(): " + languageOne.equals(languageTwo));
        System.out.println("Ignoring case: " + languageOne.equalsIgnoreCase("java"));

        // 4. Accessing characters and extracting part of a string
        String sentence = "Learning Java";
        System.out.println("\n4. Characters and substring");
        System.out.println("First character: " + sentence.charAt(0));
        System.out.println("Last character: "
                + sentence.charAt(sentence.length() - 1));
        System.out.println("Substring: " + sentence.substring(9));
        System.out.println("Contains Java: " + sentence.contains("Java"));

        // 5. Replacing text and splitting words
        String announcement = "Java is easy to learn";
        System.out.println("\n5. Replace and split");
        System.out.println(announcement.replace("easy", "interesting"));
        String[] words = announcement.split(" ");
        System.out.println("Number of words: " + words.length);
        for (String word : words) {
            System.out.println(word);
        }

        // 6. Count vowels using a loop and charAt()
        String word = "Programming";
        int vowelCount = 0;
        for (int index = 0; index < word.length(); index++) {
            char character = Character.toLowerCase(word.charAt(index));
            if (character == 'a' || character == 'e' || character == 'i'
                    || character == 'o' || character == 'u') {
                vowelCount++;
            }
        }
        System.out.println("\n6. Count vowels");
        System.out.println("Vowels in " + word + ": " + vowelCount);

        // 7. Reverse a string using StringBuilder
        String original = "Hello Java";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println("\n7. Reverse a string");
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // 8. Check whether a string is a palindrome
        String palindromeText = "level";
        String palindromeReverse = new StringBuilder(palindromeText)
                .reverse().toString();
        System.out.println("\n8. Palindrome check");
        System.out.println(palindromeText + " is palindrome: "
                + palindromeText.equals(palindromeReverse));

        // 9. Build text efficiently with append()
        StringBuilder builder = new StringBuilder();
        builder.append("Name: ").append(firstName);
        builder.append(", Course: Java");
        builder.append(", Level: Beginner");
        System.out.println("\n9. StringBuilder append()");
        System.out.println(builder);

        // 10. Modify mutable text with insert(), delete(), and replace()
        StringBuilder editable = new StringBuilder("I Java");
        editable.insert(2, "love ");
        editable.replace(7, 11, "coding");
        editable.delete(0, 2);
        System.out.println("\n10. StringBuilder modification");
        System.out.println(editable);

        // 11. Remove spaces from a sentence with StringBuilder
        String textWithSpaces = "Java makes programming fun";
        StringBuilder withoutSpaces = new StringBuilder();
        for (int index = 0; index < textWithSpaces.length(); index++) {
            char character = textWithSpaces.charAt(index);
            if (character != ' ') {
                withoutSpaces.append(character);
            }
        }
        System.out.println("\n11. Remove spaces");
        System.out.println(withoutSpaces);

        // 12. Count the occurrences of a character
        String searchText = "banana";
        char target = 'a';
        int occurrences = 0;
        for (int index = 0; index < searchText.length(); index++) {
            if (searchText.charAt(index) == target) {
                occurrences++;
            }
        }
        System.out.println("\n12. Character search");
        System.out.println("'" + target + "' appears " + occurrences
                + " times in " + searchText);
    }
}
