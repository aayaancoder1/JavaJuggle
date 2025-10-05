// Program to check a number is Armstrong or not
// sum of digits raised to the power of number of digits
import java.util.Scanner;
public class armstrong {
    //int x;

    int digit(int x){
        int digit, sum = 0;
        while (x != 0){
            digit = x % 10;
            x = x / 10;
            sum++;
        }
        return sum;
    }

    void armstrong(int x){
        int power = digit(x);
        int num = 1, temp = x, sum = 0;
        while(temp != 0){
            int digit = temp % 10;
            for (int i = 0; i < power; i++){    // calculating digit^power
                num = num * digit;
            }
            sum += num;
            num = 1;
            temp = temp / 10;
        }

        if (sum == x){
            System.out.println(x + " is an Armstrong number");
        }
        else{
            System.out.println(x + " is not an Armstrong number");
        }
    }

    public static void main (String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = sc.nextInt();

        armstrong a = new armstrong();
        a.armstrong(x);
    }
}