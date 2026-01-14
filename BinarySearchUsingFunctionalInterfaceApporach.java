import java.util.function.Function;
import java.util.*; 
public class BinarySearchUsingFunctionalInterfaceApporach {
    protected class BinarySearchClass{
        public static Integer binarySearchMethod(List<Integer> arr){
            int target  = 5;
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
        Function<List<Integer>,Integer>  operation = BinarySearchClass::binarySearchMethod;
        Integer[] arr = new Integer[]{1,3,4,5,6,7};
        List<Integer>  list = Arrays.asList(arr);
        System.out.println("The element found at index : "+operation.apply(list));
    }

}
