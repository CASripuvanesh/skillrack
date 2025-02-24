public class Answer{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String[] Arr = S.split(" ");
    StringBuilder result = new StringBuilder();
    for(String first:Arr){
      StringBuilder modify =new StringBuilder();
      for(int i = 0;i< first.length();i++){
        if(i%2==0){
          modify.append(Character.toUpperCase(first.chatAt(i)));
        }else{
          modify.append(Character.toLowerCase(first.charAt(i)));
    }
  } return.append(modify.append(" "));
    } System.out.print(result.toString);
  }
}
