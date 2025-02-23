public class sampl{
  public static void main(String[] args){
    Scanner sc =  new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int Length = sc.nextInt();
    int diff = B-A;
    int Nthformula  = A+(Length-1)*diff;
    System.out.print(Nthformula);
  }
}
