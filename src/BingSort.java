/**
 * @Classname BingSort
 * @Description TODO
 * @Date 2020/7/27 22:35
 * @Created by mmz
 */
public class BingSort {

    static void Bing(int[] arr,int start,int end){
        int mid = (start+end)/2;
        if(start<end){
            Bing(arr,start,mid);
            Bing(arr,mid+1,end);
            Merge(arr,start,end,mid);
        }
    }

    static void Merge(int[] arr,int start,int end,int mid){
        int left = start;
        int i = 0;
        int j = mid+1;

        int[] temp = new int[end-start+1];
        while(left<=mid && j<=end){
            if(arr[left] < arr[j]){
                temp[i++] = arr[left++];
            }else{
                temp[i++] = arr[j++];
            }
        }
        while(left<=mid){
            temp[i++] = arr[left++];
        }
        while(j<=end){
            temp[i++] = arr[j++];
        }
        for(int k = 0 ;k<temp.length;++k){
            arr[k+start] = temp[k];
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[]{4,2,5,3,6,9,1,8};
        Bing(arr,0,arr.length-1);
        for(int i :arr){
            System.out.println(i);
        }
    }
}
