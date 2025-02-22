import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] times = sc.nextLine().split(" ");
        sc.close();
        int count = 0;

        for (String time : times) {
            String[] parts = time.split(":");
            int hours = Integer.parseInt(parts[0]);
            int minutes = Integer.parseInt(parts[1]);
            if (hours > 10 || (hours == 10 && minutes > 0)) {
                count++;
            }
        }

        System.out.println(count);
    }
}
