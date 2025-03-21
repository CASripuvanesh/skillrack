// print the first repeating char
// input : abcdexyzdrwqpoolj
// output : d

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    for(int i=0;i<S.length();i++){
      for(int j=i+1;j<S.length();j++){
        if(S.charAt(i)==S.charAt(j)){
          System.out.print(S.charAt(i));
          return;
        }
      }
    }
  }
}
