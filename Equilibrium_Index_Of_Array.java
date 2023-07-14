
import java.util.*;
import java.util.Scanner;

public class Equilibrium_Index_Of_Array {
    public static int [] prefixSum(int arr[]){
        int prefix_array[]=new int[arr.length];
        prefix_array[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            prefix_array[i]=prefix_array[i-1]+arr[i];
        }
        return prefix_array;
    }
    public static int function(int []arr){
        int cou=0;
        int min= Integer.MAX_VALUE;
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]==arr[arr.length-1]-arr[i]){
                cou=cou+1;
                if(min>i){
                    min=i;
                }
            }

        }
        if(cou==0){
            return -1;
        }
        return min;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int pref_array[]=prefixSum(arr);
        int val=function(pref_array);
        System.out.println(val);


    }
}