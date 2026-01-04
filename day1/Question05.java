import java.util.Scanner;
public class Question05 {
    public static void main (String[] args){
        System.out.println("Calculate the volume of cylinder");
        Scanner sc = new Scanner (System.in);
        System.out.print("Take radius as input from user : ");
        double r = sc.nextDouble();
        System.out.print("Take height as input from user : ");
        double h = sc.nextDouble();
        double volume = 3.14 * r * r * h;
        System.out.println("volume of cylinder is : " + volume);
        sc.close();

    }
}
