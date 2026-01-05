public class Question05 {
    public static void main(String[]args){
        int totalPens = 14;
        int students = 3;
        int Pensperstudent = totalPens / students;
        int Pensremaining = totalPens % students;
        System.out.println("The pens per student is : " + Pensperstudent + " and the remaining pens is : " + Pensremaining  );

    }
    
}
