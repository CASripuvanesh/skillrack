// // rotate the String
// input = Cricket , 2
// output = etCrick

class Main1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int N = sc.nextInt();
        String S1="";
        String S2="";
        for(int i=0;i<str.length()-N;i++){
            S1+=str.charAt(i);
        }for(int i=str.length()-N;i<=str.length()-1;i++){
            S2+= str.charAt(i);
        }
        System.out.println(S2+S1);
    }
}
