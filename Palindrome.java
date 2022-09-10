import java.util.*;

public class Palindrome {
    public static void main(String[]args){
        int r,temp,a=0;

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number:- ");
        int n = sc.nextInt();
        temp=n;

        while(temp!=0){
            r=temp%10;
            a=(a*10)+r;
            temp=temp/10;
        }
        if(n==a){
            System.out.println("Number is palidrome");
        }
        else{
            System.out.println("Number is not palidrome");
        }
    }
}
