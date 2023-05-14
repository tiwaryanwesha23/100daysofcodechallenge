/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
       int low = 1;
       int high = n;
       while(high > low){
           int mid = (high - low)/2 + low;
           if(isBadVersion(mid)){
               high = mid;
           }else{
               low = mid + 1;
           }
       }
       return isBadVersion(low)?low:-1;
    }
}