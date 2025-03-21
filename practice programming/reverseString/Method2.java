import java.util.Scanner;

public class Method2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String S = "";
        for(int i=Str.length()-1;i>=0;i--){
            S += Str.charAt(i);
        }
        System.out.println(S);
    }
}
