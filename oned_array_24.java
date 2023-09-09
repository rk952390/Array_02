public class oned_array_24 {
    public static void main(String args[])
    {
        int marks [] = new int[3];
        marks[0]=90;
        marks[1]=93;
        marks[2]=95;
        int sum=0;

        //System.out.println(marks[0]);
        //System.out.println(marks[1]);
        //System.out.println(marks[2]);

        for(int i=0;i<3;i++)
        {
            System.out.println(marks[i]);
            sum=sum+marks[i];

        }
        System.out.println("sum of all marks="+sum);
    }
}
