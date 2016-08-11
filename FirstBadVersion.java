/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left=1;
        int right=n;
        while (left<=right) {
            int mid = left +(right-left)/2;
            boolean flag = isBadVersion(mid);
            if (flag) {
                right=mid-1;
            } else
                left=mid+1;
        }
        if (isBadVersion(left)) return left;
        return right;
    }
}