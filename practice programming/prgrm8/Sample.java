public class Sample{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int V = sc.nextInt();
    int W = sc.nextInt();
    if(W%2!=0 || W< V*2 || W > 4*V){
      System.out.print("Invalid");
    }
    int TW  = (2* v - W/2);
    int FW = V-TW;
    System.out.print(TW + " " + FW);
  }
}
