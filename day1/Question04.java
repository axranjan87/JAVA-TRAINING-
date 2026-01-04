import java.util.Scanner;
public class Question04 {
    public static void main(String[] args){
        System.out.println("Take input for radius of circle");
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter radius from user : ");
        double r = sc.nextDouble();
        double area = 3.14 * r*r;
        System.out.println("Area of circle is : " + area);
        sc.close();

    }
    
}
