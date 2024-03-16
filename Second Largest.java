//User function Template for Java

class Solution {
    int print2largest(int arr[], int n) {
        // code here
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]>largest){
                second = largest;
                largest = arr[i];
            }
            else if(arr[i]>second && arr[i]!=largest){
                second = arr[i];
            }
        }
        if(second == Integer.MIN_VALUE){
            return -1;
        }
        
        return second;
    }
}
