public class E2 {
 public static void main(String[] args) {
 if (args.length == 0)
 {
 System.out.println("Provide valid arguments");
 return;
 }
 if (args[0].matches("\\d+") && args[1].matches("\\d+")) {
 double num1 = Double.parseDouble(args[0]);
 double num2 = Double.parseDouble(args[1]);
 double sum = num1 + num2;
 System.out.println("Sum of two numbers is: " + sum);
 }

 else
 {
 System.out.println("Concated strings is: "+(args[0]+" " +args[1]));
}
}
}