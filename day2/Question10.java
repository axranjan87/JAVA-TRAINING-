import java .util.Scanner;
public class Question10 {
    public static void main(String[]args){
        double heightincm;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the height in cm : ");
        heightincm = sc.nextDouble();
        double totalinches = heightincm / 2.54;
        double feet =  totalinches / 12;
        double inches = totalinches %12;
        System.out.println("Your Height in cm is :" + heightincm + " " + "while in feet is : " + feet + " " + " and inches is : " + inches);





    }
    
}
