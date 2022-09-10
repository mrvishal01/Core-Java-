import java.util.*;
public class Sum {
       public static void main (String[]args)
       {
           int size;
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter Your Loop Size:- ");
        size =sc.nextInt();
        for (int i = 0; i< size;i++)
        {
            System.out.print("Enter the A Number :- ");
            int a = sc.nextInt();
            System.out.print("Enter the B Number :- ");
            int b = sc.nextInt();
            int ans = a+b;
            System.out.println("Total Number Of Sum:- "+ans);
        }
    }
}
