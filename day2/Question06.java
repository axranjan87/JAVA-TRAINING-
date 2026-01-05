public class Question06 {
    public static void main(String[]args){
        int studentsfee = 125000;
        double discountpercentage = 10;
        double discount = (studentsfee * discountpercentage)/100;
        double finalfee = studentsfee - discount;
        System.out.println("The discount amount is INR : " + discount + " " +  "final discount fee is INR : " + finalfee);


    }
}
