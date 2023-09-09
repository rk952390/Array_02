import java.util.Scanner;
public class array_27 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number=");
            int num = sc.nextInt();

            int marks [] = new int[num]; 

            for(int i=0;i<num;i++)
            {
                marks [i] = sc.nextInt();
             
            }
            //  for the print

            for(int i=0;i<num;i++)
            {
                System.out.println(marks[i]);
            }
        }

    }
}
