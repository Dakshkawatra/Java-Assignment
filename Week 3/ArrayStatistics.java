import java.util.*;
public class ArrayStatistics{
    public static void main(String[] args){
        System.out.println("tell me how many no. of elemets you want to enter : ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
// assigning the array with its values 
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the element for the "+i+" th index: ");
            int g=s.nextInt();
            arr[i]=g;
        }
        System.out.println("the value of thr sum is : "+sum(arr));
        System.out.println("the value of thr average is : "+average(arr));
        System.out.println("the value of thr minimun is : "+minimum(arr));
        System.out.println("the value of thr maximum is : "+maximum(arr));
        System.out.println("the value of thr count even number is : "+countEven(arr));
        printSignCounts(arr);
    }
    static int sum(int[]values){
        int sum=0;
        for(int i=0;i<values.length;i++){
            sum+=values[i];}
            return sum;
        
    }
    static double average(int[]values){
        int sum=0;
        for(int i=0;i<values.length;i++){
            sum+=values[i];}
        return (double)sum/values.length;
    }
    static int minimum(int[] values){
        int min=Arrays.stream(values).min().getAsInt();
        return min;
    }
    static int maximum(int[] values){
        int max=Arrays.stream(values).max().getAsInt();
        return max;
    }
    static int countEven(int[] values){
        int count_e=0;
        for(int i=0;i<values.length;i++){
            if(values[i]%2==0){ count_e++;} 
        }
        return count_e;
    }
    static void printSignCounts(int[] values){
        int count_p=0;
        int count_n=0;
        int count_z=0;
        for(int i=0;i<values.length;i++){
            if(values[i]==0){ count_z++;} 
            else if(values[i]<0) count_n++;
            else count_p++;
        }
        System.out.println("the positive number in array is :"+count_p);
        System.out.println("the negative number in array is :"+count_n);
        System.out.println("the zero number in array is :"+count_z);
    }
}