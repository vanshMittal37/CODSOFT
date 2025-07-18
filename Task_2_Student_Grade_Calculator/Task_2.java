import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******Student Grade Calculator******");
        System.out.print("Enter number of subjects : ");
        int number_of_subjects = sc.nextInt();
        int Total_marks = 100*number_of_subjects;
        System.out.printf("Enter the marks of %d Subjects\n" , number_of_subjects);
        int mark_obtained = 0;
        for(int i=1 ; i<=number_of_subjects ; i++){
            System.out.printf("\nEnter the marks of subject %d : " , i);
            int mark = sc.nextInt();
            mark_obtained += mark;
        }
        System.out.println(mark_obtained);
        System.out.println(Total_marks);
        System.out.println();
        double average_percentage = (double)((mark_obtained*100.00)/Total_marks);
        String Grade = "";
        if(average_percentage>=90){
            Grade = "'A+' (Outstanding)";
        }else if(average_percentage>=80){
            Grade = "'A' (Excellent)";
        }
        else if(average_percentage>=70){
            Grade = "'B' (very Good)";
        }
        else if(average_percentage>=60){
            Grade = "'C' (Good)";
        }else if(average_percentage>=50){
            Grade = "'D' (Average)";
        }
        else if(average_percentage>=40){
            Grade = "'E' (Pass but Poor)";
        }
        else if(average_percentage<40){
            Grade = "'F' (FAIL)";
        }

        System.out.printf("Total marks obtained by the Student : %d\n" , mark_obtained);
        System.out.printf("Average Percentage of the Student : %f\n" , average_percentage);
        System.out.println(average_percentage);
        System.out.printf("According to Percentage the student's get the %s Grade\n" , Grade);

        sc.close();
    }
}

