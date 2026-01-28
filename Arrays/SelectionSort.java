import java.util.Arrays;

public class SelectionSort{

    public int[] selectionSort(int[] nums){
        int n=nums.length;
        int si;
        for(int i=0;i<n-1;i++){
            si=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[si]){
                    si=j;
                }
            }

            int temp=nums[si];
            nums[si]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }
    public static void main(String[] args){
        SelectionSort obj = new SelectionSort();
        int[] nums={1,5,3,77,5,4,3};

        int[] sorted = obj.selectionSort(nums);
        System.out.println(Arrays.toString(sorted));

    }
}