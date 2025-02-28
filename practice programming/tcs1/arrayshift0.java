// input of Array [1,0,2,0,3]
// output of Array [1,2,3,0,0]   QUESTION

import java.util.*;
class arrayshift0{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] array = new int[size];
    for(int i = 0 ;i<size;i++){
      array[i] = sc.nextInt();
    }
    int count = 0 ;
    for(int i = 0;i<size;i++){
      if(array[i]!=0){
        array[count++] = array[i];
      }
    }
    while(count < size){
      array[count++] = 0;
    }
    System.out.print(Arrays.toString(array));
  }
}
