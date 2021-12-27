
//Q1 : Write a lambda expression that accepts two integers arguments and returns max of them.

package assgn1;
import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        MaxInterface result= (i, j) -> Math.max(i, j);
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter first numbers: ");
        int a= sc.nextInt();
        System.out.println("Enter second numbers: ");
        int b=sc.nextInt();
        System.out.println("Maximum from two numbers is: "+result.max(a,b));
    }
}
