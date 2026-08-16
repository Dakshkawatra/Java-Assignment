import java.util.*;
public class PrimeNumber {
    public static void main(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a =sc.nextInt();
        System.out.println(isPrime(a));

    }
    static boolean isPrime(int number){
        if(number>=2){
            for(int i=2;i<number;i++){
                if(number%i==0){
                    return false;
                }
            }
            return true;
        }
        return false;
}
}
