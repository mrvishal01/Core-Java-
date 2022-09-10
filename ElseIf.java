import java.util.*;

public class ElseIf {
    public static void main(String []args){
        int age;

        System.out.println("Enter the Age:-");
        Scanner sc = new Scanner (System.in);
         age = sc.nextInt();
        if  (age >= 60){
            System.out.println("You are Seniour Cityzen");
        } else if (age >25) {
            System.out.println("You are Matuare Person");
        } else if (age>18) {
            System.out.println("You are Youngest Person");
        }else {
            System.out.println("You are Baby");
    }
    }
}
