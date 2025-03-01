// Input :
// 7  -> Value of N
// [1,0,2,0,1,0,2]-> Element of arr[0] to arr[N-1], while input each element is separated by new line.
// Output :
// 0 0 0 1 1 2 2  -> Element after sorting based on risk severity 

class Sample{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int size = sc.nextInt();
    int[] arr = new int[size];
    for(int i = 0;i < size;i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.print(Arrays.toString(arr));
  }
}
