import java.util.Scanner;
public class add{
    public static void main (String []args){
        int a ,b ,sum;
        // int a = 3;
        // int b = 4;
        // int sum = a + b;
        // int mult = a * b;
        // System.out.println(sum);
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter your name:");
        // String name = scanner.nextLine();
        // System.out.println("Your name is "+name);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        a = sc.nextInt();
        System.out.println("Enter second number:");
        b = sc.nextInt();
        sc.close();
        sum = a + b;
        System.out.println("Sum of two number:"+sum);
    }
}