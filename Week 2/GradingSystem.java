import java.util.*;
public class GradingSystem {
    public  static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Marks :"); 
        int a= sc.nextInt();
        System.out.println(classifyMark(a));
    }
    static String classifyMark(int marks){
        if(marks<0 && marks>100) return "Invalid marks";
        if(marks>=80) return "Distinction";
        if(marks>=70) return "Merit";
        if(marks>=50) return "Pass";
        return "Fail";
    }
}