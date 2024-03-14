// User function Template for Java

class Solution {
    int missingNumber(int array[], int n) {
        // Your Code Here
        int sum = n*(n+1)/2;
        int sums=0;
        for(int x: array){
            sums = sums + x;
        }
        
        return sum-sums;
    }
}
