/**
 * @Classname HeapSort
 * @Description TODO
 * @Date 2020/7/27 22:26
 * @Created by mmz
 */
public class HeapSort {

    static void heap(int[] arr){
        for(int i = (arr.length-1)/2;i>=0;--i){
            adjust(arr,i,arr.length);
        }

        for(int i = arr.length-1;i>0;--i){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            adjust(arr,0,i);
        }
    }
    static void adjust(int[] arr,int parent,int length){
        int temp = arr[parent];
        int childleft = parent*2+1;
        while(childleft < length){
            int childright = childleft+1;

            if(childright < length && arr[childleft] < arr[childright]){
                childleft++;
            }

            if(temp >= arr[childleft]){
                break;
            }

            arr[parent] = arr[childleft];
            parent = childleft;
            childleft = childleft*2+1;
        }
        arr[parent] = temp;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,5,3,6,9,1,8};
        heap(arr);
        for(int i :arr){
            System.out.println(i);
        }
    }
}
