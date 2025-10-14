public class E {
 public static void main(String[] args) {

 double age = Double.parseDouble(args[0]);
 if(age<13)
 {
 System.out.println("Children-serve water");
 }
 else if(age>=13&&age<19)
 {
 System.out.println("serve milk");
 }
 else
 {
 System.out.println("serve coke");
}
}
}