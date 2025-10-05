// Read the marks of a student in 4 subjects and find grade
import java.util.Scanner;
public class student_marks {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks of 4 subjects: ");
        int marks[] = new int[4];
        for(int i=0; i<4; i++){
            marks[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < 4 ; i++){
            sum += marks[i];
        }
        System.out.println("Total Marks are: " +sum);

        int avg = sum / 4;

        if (avg >= 90){
            System.out.println("Grade A");
        }
        else if (avg >= 80){
            System.out.println("Grade B");
        }
        else if (avg >= 70){
            System.out.println("Grade C");
        }
        else if (avg >= 60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
    }
}