// reverse a given String

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String reverse = new StringBuilder(Str).reverse().toString();
        System.out.print(reverse);
    }
}
