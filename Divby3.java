package Divisibleby3;
import java.util.Scanner;

public class Divby3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int[] arr = new int[len];
        int count=0;
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();
            if(arr[i]!=0 && arr[i]%3==0){
                count++;
            }
        }

        if(count>0) {
        	System.out.println("1");
        }
        else {
        	System.out.println("0");
        }
    }
}