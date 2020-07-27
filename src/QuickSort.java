/**
 * @Classname QuickSort
 * @Description TODO
 * @Date 2020/7/27 22:17
 * @Created by mmz
 */
public class QuickSort {
    static void quick(int[] arr,int start,int end){
        if(start>end){
            return;
        }
        int index = arr[start];
        int i = start;
        int j = end;
        while(i<j){
            while(i<j && arr[j] >= index){
                j--;
            }
            while(i<j && arr[i] <= index){
                i++;
            }
            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
            }
        }
        arr[start] = arr[i];
        arr[i] = index;

        quick(arr,start,i-1);
        quick(arr,i+1,end);
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,5,3,6,9,1,8};
        quick(arr,0,arr.length-1);
        for(int i :arr){
            System.out.println(i);
        }
    }
}
