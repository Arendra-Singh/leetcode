class Solution {
    public int searchInsert(int[] arr, int find) {
       int start = 0;
       int end = arr.length-1;

        while (start <= end) {
            int mid = (start+end)/2;
            System.err.println("start= "+ start +", end= " + end + ", mid = "+ mid);
            if(  arr[mid] == find){
                return mid;
            }
            else if(arr[mid] < find){
                start = mid +1;
            }
            else{
                end =mid - 1;
            }
        }
        return start;
     
    }
}