// binary Search program to find the target number
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int flag = 0;
        int left = 0; int right = arr.length-1;
        while(left<=right){
            int mid = ((left+right)/2);
         if(arr[mid]==target){
             System.out.println(arr[mid] + " Target found");
             flag = 1;
             break;
         }else if(arr[mid]<target) {
             left = mid+1;
         } else if (arr[mid]>target) {
             right =mid-1;
         }
        }
        if(flag == 0){
            System.out.println("not found");
        }
    }
}
