import java.util.Scanner;
public class array_28 {
    public static void main(String args[])
    {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter the number for pritn the array=");
            int num = sc.nextInt();

            int marks [] = new int[num]; 

            for(int i=0;i<num;i++)
            {
                marks[i] = sc.nextInt();

            }

            System.out.println("enter the number for the search:");
            int x = sc.nextInt(); 

            for(int i=0; i<num; i++)
            {
                if(marks[i]==x)
                {
                    System.out.println(" it is the index number where number is available="+i);

                }
            }
        }
        

        
    }
}
