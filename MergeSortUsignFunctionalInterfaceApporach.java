@FunctionalInterface
interface MergeSortInterface{
    void sortingLogicOfMerge(int[] arr,int low,int high);
}
@FunctionalInterface
interface MergingInterface{
    void mergingMethod(int[] arr,int low,int mid,int high);
}
public class MergeSortUsignFunctionalInterfaceApporach {
    protected class MergingLogicOfMergeSortingLogicUtil{
        public static void mergingMethodUtil(int[] arr,int low,int mid,int high){
            int leftLength = mid-low+1;
            int rightLength = high-mid;
            int[] left = new int[leftLength];
            int[] right = new int[rightLength];
            for(int i=0;i<leftLength;i++){
                left[i] = arr[low+i];
            }
            for(int j=0;j<rightLength;j++){
                right[j] = arr[mid+1+j];
            }
            int i,j,k;
            i=j=0;
            k=low;
            while(i<leftLength&&j<rightLength){
                if(left[i]<=right[j]){
                    arr[k] = left[i];
                    i++;
                }else{
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            while(i<leftLength)
                arr[k++] = left[i++];
            while(j<rightLength)
                arr[k++] = right[j++];
        }
    }
    protected class MergeSortingLogicUtilClass{
        public static void mergeUtilMethod(int[] arr,int low,int high){
            if(low<high){
                int mid = low+(high-low)/2;
                mergeUtilMethod(arr, low, mid);
                mergeUtilMethod(arr, mid+1, high);
                MergingInterface  operation = MergingLogicOfMergeSortingLogicUtil::mergingMethodUtil;
                operation.mergingMethod(arr, low, mid, high);
            }
        }
    }
    public static void main(String[] args){
        MergeSortInterface operation = MergeSortingLogicUtilClass::mergeUtilMethod;
        int arr[] = new int[]{1,8,92,1,99,98,12,342,54,87,99,10};
        operation.sortingLogicOfMerge(arr, 0, arr.length-1);
        for(int number:arr){
            System.out.print(number+" ");
        }
    }
}
