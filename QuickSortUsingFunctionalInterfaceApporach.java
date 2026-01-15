@FunctionalInterface
interface QuickSortInterface{
    void sortingMethodUitl(int arr[],int low,int high);
}
@FunctionalInterface
interface PivotPointInterface{
    int pivotPointMethodUtil(int arr[],int low,int high);
}
public class QuickSortUsingFunctionalInterfaceApporach {
    protected class PivotPointUtilClass{
        public static int pivotPointMethod(int arr[],int low,int high){
            int pivot = arr[high];
            int i = low-1;
            for(int j=low;j<high;j++){
                if(arr[j]<=pivot){
                    i++;
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            int temp = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = temp;
            return i+1;
        }
    }
    protected class QuickSortingUtilClass{
        public static void quickSortingMethodUtil(int arr[],int low,int high){
            if(low<high){
                PivotPointInterface operation = PivotPointUtilClass::pivotPointMethod;
                int pi = operation.pivotPointMethodUtil(arr, low,high);
                quickSortingMethodUtil(arr, low, pi-1);
                quickSortingMethodUtil(arr, pi+1, high);
            }
        }
    }
    public static void main(String[] args){
        QuickSortInterface operation = QuickSortingUtilClass::quickSortingMethodUtil;
        int arr[] = new int[]{1,8,92,1,99,98,12,342,54,87,99,10};
        operation.sortingMethodUitl(arr, 0, arr.length-1);
        for(int number:arr){
            System.out.print(number+" ");
        }
    }
}
