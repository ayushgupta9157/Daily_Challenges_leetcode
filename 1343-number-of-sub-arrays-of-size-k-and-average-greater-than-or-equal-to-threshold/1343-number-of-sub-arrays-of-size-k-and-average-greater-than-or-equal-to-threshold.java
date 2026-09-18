class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int c = k*threshold;
        int sum=0;
        int count=0;
        for(int i=0;i<k;i++){
            sum =sum+arr[i];
        }
        if(sum>=c){
            count++;
        }
        int j=1;
        for(int i=k;i<arr.length;i++){
            sum=sum+arr[i];
            sum=sum-arr[i-k];
            if(sum>=c){
            count++;
        }
            j++;  
        }
        return count;
    }
}