@FunctionalInterface
interface BubbleSort{
    void bubbleSortUtilMethod(int arr[]);
}
public class BubbleSortUsingFunctionalInterfaceApporachUsingArray{
    protected class BubbleSortUtilClass{
        public static void bubbleSortUtilClassMethod(int arr[]){
            for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length-i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1]= temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[] = new int[]{3,4,5,6,1,8,9,10};
        BubbleSort operation = BubbleSortUtilClass::bubbleSortUtilClassMethod;
        operation.bubbleSortUtilMethod(arr);
        for(int num : arr)
            System.out.print(num+" ");
    }
}