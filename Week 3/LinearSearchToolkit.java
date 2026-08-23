import java.util.*;
public class LinearSearchToolkit{
    static public void main(String[] args){
        // linear search programme
        System.out.println("tell me how many no. of elemets you want to enter : ");
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        System.out.println("Set a target value : ");
        int t=s.nextInt();
// assigning the array with its values 
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the element for the "+i+" th index: ");
            int g=s.nextInt();
            arr[i]=g;
        }
        System.out.println("does it contains that : "+contains(arr, t));
        System.out.println("the first index of occurance : "+firstIndexOf(arr, t));
        System.out.println("the last index of occrance : "+lastIndexOf(arr, t));
        System.out.println("the no of the occurance is : "+countOccurrences(arr, t));
    }
    static boolean contains(int[] values, int target){
        for(int in=0;in<values.length;in++){
            if(target==values[in])
                return true;
        }
        return false;
    }
    static int firstIndexOf(int[] values, int target){
        for(int in=0;in<values.length;in++){
            if(target==values[in])
                return in;
        }
        return 0;
    }
    static int lastIndexOf(int[] values, int target){
        for(int in=values.length -1;in>0;in--){
            if(target==values[in])
                return in;
        }
        return 0;
    }
    static int countOccurrences(int[] values, int target){
        int count_index=0;
        for(int in=0;in<values.length;in++){
            if(target==values[in])
                count_index++;
        }
        return count_index;
    }

    
}