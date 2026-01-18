import java.util.*;
@FunctionalInterface 
interface BubbleSortInterfaceForArrayList{
    void bubbleSortMethodForArrayList(List<Integer> arr);
}
public class BubbleSortUsingFunctionalInterfaceApporachUsingArrayList {
    protected class BubbleSortUtilClass{
        public static void bubbleSortUtilClassMethod(List<Integer> arr){
            for(int i=0;i<arr.size();i++){
                for(int j=0;j<arr.size()-i-1;j++){
                    if(arr.get(j)>arr.get(j+1)){
                        int temp=arr.get(j);
                        arr.set(j,arr.get(j+1));
                        arr.set(j+1,temp);
                    }
                }
            }
        }
    }
    public static void main(String[] args){
        int arr[] = new int[]{1,32,4,3,2,5,61,92};
        List<Integer> arrList = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        BubbleSortInterfaceForArrayList operation = BubbleSortUtilClass::bubbleSortUtilClassMethod;
        operation.bubbleSortMethodForArrayList(arrList);
        System.out.println(arrList);
    }
}
