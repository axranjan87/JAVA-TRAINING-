import java.util.Scanner;
public class Question02 {
    public static void main(String[] args) {
        System.out.println("Enter the input from the user");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first no : ");
        int a = sc.nextInt();
        System.out.print("Enter Second no : ");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.print("Add two no : ");
        System.out.println(sum);
        sc.close();

    }
}
