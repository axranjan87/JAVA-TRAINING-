import java.util.Scanner;
public class Question09 {
    public static void main(String[]args){
        double fees;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the college fees : ");
        fees = sc.nextDouble();
        double discountpercentage ;
        System.out.println("Enter the discountpercentage : ");
        discountpercentage = sc.nextDouble();
        double discount = (fees * discountpercentage) / 100;
        double finalfees = fees - discount;
        System.out.println("The discount amount is INR  : " + discount + " " + "The final discount fee is INR : " + finalfees );


    }
    
}
