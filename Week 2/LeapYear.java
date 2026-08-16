import java.util.*;
public class LeapYear {
    public static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int a= sc.nextInt();
        System.out.println(isLeapYear(a));
    }
    static boolean isLeapYear(int year){
        // for a leap year 
        if((year%4==0 && year%100 !=0 ) || year%400==0) return true;
        return false;
    }
}
