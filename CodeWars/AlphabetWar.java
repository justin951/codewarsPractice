import java.util.HashMap;

public class AlphabetWar {
    public static String alphabetWar(String fight) {
        char[] fightArray = fight.toCharArray();

        String left = "wpbs";
        String right = "mqdz";

        int scoreLeft = 0;
        int scoreRight = 0;

        HashMap<Character, Integer> points = new HashMap<>();
        points.put('w', 4);
        points.put('p', 3);
        points.put('b', 2);
        points.put('s', 1);
        points.put('m', 4);
        points.put('q', 3);
        points.put('d', 2);
        points.put('z', 1);

        for (char letter : fightArray) {
            if (contains(letter, left)) {
                scoreLeft += points.get(letter);
            }
            if (contains(letter, right)) {
                scoreRight += points.get(letter);
            }
        }

        if (scoreLeft > scoreRight) {
            return "Left side wins!";
        }
        if (scoreRight > scoreLeft) {
            return "Right side wins!";
        }
        return "Let's fight again!";

    }

    public static boolean contains(char a, String myString) {
        char[] myArr = myString.toLowerCase().toCharArray();
        for (char each : myArr) {
            if (a == each) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(alphabetWar("z"));
        System.out.println(alphabetWar("zdqmwpbs"));
        System.out.println(alphabetWar("zzzzs"));
        System.out.println(alphabetWar("wwwwwwz"));
        System.out.println(alternateAlphabit("z"));
        System.out.println(alternateAlphabit("zdqmwpbs"));
        System.out.println(alternateAlphabit("zzzzs"));
        System.out.println(alternateAlphabit("wwwwwwz"));
    }

    public static String alternateAlphabit(String fight) {
        int right = 0, left = 0;
        for (char c : fight.toCharArray()) {
            switch (c) {
                case 'w' : left += 4; break;
                case 'p' : left += 3; break;
                case 'b' : left += 2; break;
                case 's' : left += 1; break;

                case 'm' : right += 4; break;
                case 'q' : right += 3; break;
                case 'd' : right += 2; break;
                case 'z' : right += 1; break;
            }
        }
        if (left == right) return "Let's fight again!";
        return (left > right? "Left" : "Right") + " side wins!";
    }
}
