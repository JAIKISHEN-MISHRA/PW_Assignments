import java.util.Arrays;

public class Q4SortAlphabet {
    public static void main(String[] args) {
        String sen="Jaikishen Mishra";
        sen=sen.toLowerCase();
        sen=sen.replace(" ", "");
        char[] sarr=sen.toCharArray();
        Arrays.sort(sarr);
        System.out.println(sarr);
    }
}
