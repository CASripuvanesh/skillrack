// TO print the next prime number of the input 
// input = 2
// output = 3

public class Main{
    public static boolean prime(int num){
        if(num<2) return false;
        for(int i =2;i<=num/2;i++){
            if(num%i==0) return false;
        } return true;
}
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int prime = N+1;
            while(! prime(prime)){
                prime++;
            }
            System.out.print(prime);
        }
    }
