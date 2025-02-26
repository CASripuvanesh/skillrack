import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String Str = sc.nextLine();
        String[] Arr = Str.split(" ");
        int dis = 0,time = 0;
        for(String word : Arr){
            String[] res = word.split("@");
            dis = Integer.parseInt(res[0]);
            time = Integer.parseInt(res[1]);
        }
        double output = dis/(double) time ;
        System.out.print(String.format("%.2f", output) + " kmph");
    }
}
