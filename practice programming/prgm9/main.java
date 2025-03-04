public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = str.length()-1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)!=str.charAt(n-i)){
                if(str.charAt(i+1)==str.charAt(n-1)){
                    System.out.print(str.charAt(i));
                    break;
                }else{
                    System.out.print(str.charAt(n-i));
                    break;
                }
            }
        }
    }
}
