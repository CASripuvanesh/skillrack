import java.util.*;
public class Hello (
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String Name = sc.nextLine();
char a = sc.next().charAt(0);
char b = sc.next().charAt(0);
int count = 0;
for(int i = 0; i<Name.length();i++){
if(Name.charAt(i)==a && Name.charAt(i+1)=b){
count++;
}
}
System.out.print(count + "1");
}
}
