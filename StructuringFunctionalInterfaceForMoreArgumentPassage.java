import java.util.*; 
@FunctionalInterface
interface BinarySearchOpertaion{
    Integer search(List<Integer>arr,Integer target);
}
public class StructuringFunctionalInterfaceForMoreArgumentPassage{
   protected class BinarySearchClass{
        public static Integer binarySearchMethod(List<Integer> arr,Integer target){
 
            int low = 0;
            int high = arr.size()-1;
            while(low<=high){
                int mid = low+(high-low)/2;
                if(arr.get(mid)==target){
                    return mid;
                }
                if(arr.get(mid)<target) {
                    low = mid + 1;
                }else{
                    high = mid-1;
                }
            }
            return -1;
        }
    }
    public static void main(String[] args){
        BinarySearchOpertaion operation = BinarySearchClass::binarySearchMethod;
        Integer[] arr = new Integer[]{1,3,4,5,6,7,8,9};
        List<Integer> list = Arrays.asList(arr);
        System.out.println("The target element is present in array at index : "+operation.search(list, 5));
    }
}