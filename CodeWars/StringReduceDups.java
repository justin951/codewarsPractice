import java.util.Arrays;

public class StringReduceDups {
    public static String[] dup(String[] arr) {
        String[] result = new String[arr.length];
        int index = 0;

        for (String eachString : arr) {
            char[] eachStringArray = eachString.toCharArray();
            String noDups = new String();

            StringBuilder noDupsSB = new StringBuilder();
            noDupsSB.append(eachStringArray[0]);
            for (int i = 1; i < eachStringArray.length; i++) {
                if (eachStringArray[i] != (eachStringArray[i - 1])) {
                    noDupsSB.append(eachStringArray[i]);
                }
                noDups = noDupsSB.toString();
            }
            result[index] = noDups;
            index++;
        }

        return result;
    }

    public static void main(String[] args) {
        String[] input = { "abracadabra", "allottee", "assessee" };
        System.out.println(Arrays.toString(dup(input)));
    }


    public static String[] alternateDup(String[] arr) {
        return Arrays.stream(arr).map( x -> x.replaceAll("(.)(?=\\1)","")).toArray(String[]::new);
    }
}
