// There is an integer array nums sorted in ascending order (with distinct values).
// Prior to being passed to your function, nums is possibly rotated at an unknown
// pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k],
// nums[k+ll
// nums[n-l], nums[0], nums[l],
// nums[k-l]] (0-indexed). For
// example, [0,1,2,4,5,6,7]
// be
// rotated
// index 3 and
// pivot
// at
// become [4,5,6,7,0,1,2].
// Given the array nums after the possible rotation and an integer target, return the
// index of target if it is in nums, or-1 if it is not in nums.
// You must write an algorithm with O(log n) runtime complexity.

public class QA2_EXERCISE{

    public static int check(int arr2[],int arr[],int k,int target){
        for(int i=0; i<arr.length; i++){
            if(i<k){
                arr2[i]=arr[i+k];
            }else if(i>=k){
                arr2[i]=arr[i-k];
            }
        }

        for(int i=0; i<arr2.length; i++){
            if(arr2[i]==target){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,4,5,6,7};
        int k=3;
        int tar=2;
        int arr2[] = new int[arr.length];
        System.out.println("Target found at index = "+check(arr2,arr,k,tar));
        
        for(int i=0; i<arr2.length; i++){
            System.out.println(arr2[i]);
        }
        
    }


}