class Solution {
    private void reverse(int[] arr, int left, int right)
    {
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
    public void nextPermutation(int[] arr) {
        int n = arr.length;
        int pivot = -1;

        //Find pivot
        for(int i=n-2;i>=0;i--)
        {
            if(arr[i] < arr[i+1])
            {
                pivot = i;
                break;
            }
        }

        //Edge case: last to first
        if(pivot == -1)
        {
            reverse(arr,0,n-1);
            return;
        }

        //Next smallest element
        for(int i=n-1;i>pivot;i--)
        {
            if(arr[i] > arr[pivot])
            {
                int temp = arr[i];
                arr[i] = arr[pivot];
                arr[pivot] = temp;
                break;
            }
        }

        //Reverse piv+1 to n-1
        reverse(arr,pivot+1,n-1);
    }
}