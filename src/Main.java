public class Main{
    public static void main(String[] args){
        int[] arr={2,3,1,4,5};
        System.out.print("index "+arr[minValue(arr)]);
    }
    public static int minValue(int[] arr){
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<arr[index]){
                index=i;
            }
        }
        return index;
    }
}