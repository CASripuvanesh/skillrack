public class Main{
  public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    String Str = sc.nextLine();
    int index = Str.indexOf('_');
    if(index == -1){
      System.out.print(new StringBuilder(Str).reverse().toString());
    }else{
      StringBuilder rev = new StringBuilder(Str.substring(0,index)).reverse().toString();
      String Bal = Str.substring(index+1);
      System.out.print(rev + "_"+ Bal);
    }
  }
}
