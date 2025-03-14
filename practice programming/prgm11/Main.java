// find the prime number between given numbers 
// input : 1, 10
// output: 4

import java.util.Scanner;

class Main{
    public static boolean prime(int num){
        if(num<2) return false;
        for(int i=2;i<=num/2;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int end = sc.nextInt();
        int count=0;
        for(int i=st;i<=end;i++){
            if(prime(i)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
