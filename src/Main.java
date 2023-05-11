import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int number;

        do{
            System.out.println("input number array");
             number=input.nextInt();
        }while(number<1);
        int[] arr=new int[number];
        for(int i=0;i<number;i++){
            System.out.println("Input arr index " + i);
            arr[i]=input.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("min or array = " +min);
    }
}