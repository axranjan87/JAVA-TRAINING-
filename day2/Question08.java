import java.util.Scanner;
public class Question08 {
    public static void main(String[]args){
        double km;
        Scanner Input = new Scanner(System.in);
        System.out.print("Enter the distance in km : ");
        km = Input.nextInt();
        double miles = km * 1.6;
        System.out.println("The total miles is : " + miles + " " + "Miles for the given km : " + km);


    }
    
}
