/**
 * @Classname BubbleSort
 * @Description TODO
 * @Date 2020/7/27 22:12
 * @Created by mmz
 */
public class BubbleSort {

    static void Bubble(int[] arr){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = 0;j<arr.length-1-i;j++){
                if(arr[j] >arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4,2,5,3,6,9,1,8};
        Bubble(arr);
        for(int i :arr){
            System.out.println(i);
        }
    }
}
