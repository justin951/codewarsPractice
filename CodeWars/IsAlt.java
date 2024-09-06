

public class IsAlt {

    public static boolean isAlt(String word) {
        if (word == null || word.length() < 2) {
            return false;
        }
        for (int i = 1; i < word.length(); i++) {
            boolean isCurrentVowel = isVowel(word.charAt(i));
            boolean isPreviousVowel = isVowel(word.charAt(i-1));

            if (isCurrentVowel == isPreviousVowel) {
                return false;
            }
        }
        return true;
    }

    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static void main(String[] args) {
        System.out.println(isAlt("super"));
        System.out.println(isAlt("ssuper"));
    }
}