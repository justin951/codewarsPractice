public class Order {
    public static String reOrder(String words) {
        if (words == null || words.length() < 1) {
            return "";
        }
        String[] wordsArr = words.split(" ");
        String[] result = new String[wordsArr.length];

        for (String word : wordsArr) {
            for (char c : word.toCharArray()) {
                if (Character.isDigit(c)) {
                    int index = Character.getNumericValue(c) - 1;
                    result[index] = word;
                }
            }
        }
        return String.join(" ", result);
    }

    public static void main(String[] args) {
        System.out.println(reOrder("4of Fo1r pe6ople g3ood th5e the2"));
    }
}
