public class Sample{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int decimal = sc.nextInt();
    String binary = Integer.toBinaryString(decimal);
    String rev = new StringBuilder(binary).reverse().toString();
    int decimal1 = Integer.parseInt(rev,2);
    System.out.print(decimal1);
  }
}
     
