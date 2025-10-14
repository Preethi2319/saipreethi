import java.util.Scanner;
public class M3 {
public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter the sentence : ");
 String s1 = scanner.nextLine();
 String[] s2=s1.split(" ");
for(String a:s2) //for each loop
{

StringBuffer sb = new StringBuffer(a);
 sb.reverse();
 String rs = sb.toString();
System.out.print(rs+" ");
}
}
}
