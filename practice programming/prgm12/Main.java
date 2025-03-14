// Rotate the String
//   input = cricket ,2
//   output = etcrick
import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int N = sc.nextInt();
        String rotated = str.substring(str.length()-N) + str.substring(0, str.length()-N);
        System.out.println(rotated);
        sc.close();
    }
}
