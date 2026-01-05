import java.util.Scanner;
public class Question11 {
    public static void main(String[]args){
        Scanner sc  = new Scanner (System.in);
        System.out.print("Enter your first Number : ");
        float num1 = sc.nextFloat();
        System.out.print("Enter your second Number :");
        float num2 = sc.nextFloat();
        float sum = num1 + num2;
        float diffrence =  num1 - num2;
        float product =  num1 * num2;
        float divide = num1 / num2;
        System.out.println("The sum of two no is : " + sum);
        System.out.println("The diffrence of two no is : " + diffrence);
        System.out.println("The product of two no is : " + product);
        System.out.println("The division of two no is : " + divide);

        sc.close();



    }
}
