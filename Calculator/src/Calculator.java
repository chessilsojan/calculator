import java.util.Scanner;
public class Calculator
{

    static int op = 0;
    static Scanner scan=new Scanner(System.in);
    static double num1;
    static double num2;
    static double ans;
          
    public static void main(String[] args) {
    do{
    System.out.println("1 . Addition 2.Substraction 3.Multiplication 4.Division");
    op = scan.nextInt();
    }  while(op<1 && op>4);
    
    
  
         }
}