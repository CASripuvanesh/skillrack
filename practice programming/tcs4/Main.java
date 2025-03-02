class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int rem = 1;
    while(N>0){
      rem = rem*(N%10);
      N=N/10;
    }
    System.out.print(rem);
  }
}
