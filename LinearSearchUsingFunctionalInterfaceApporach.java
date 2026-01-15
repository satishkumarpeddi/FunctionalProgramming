 
@FunctionalInterface
interface LinearSearchInterface{
    Integer searchMethod(int arr[],int target);
}
public class LinearSearchUsingFunctionalInterfaceApporach {
    protected class LinearSearchUtilClass{
        public static Integer searchMethodUtil(int arr[],int target){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==target)
                    return i;
            }
            return -1;
        }
    }
    public static void main(String[] args){
        int arr[] = new int[]{5,21,3,9,10,12,3,4,5};
        LinearSearchInterface operation = LinearSearchUtilClass::searchMethodUtil;
        System.out.println("The target element is found at index : "+operation.searchMethod(arr, 9));
    }
}
