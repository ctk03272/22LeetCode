/* The isBadVersion API is defined in the parent class VersionControl.
      fun isBadVersion(version: Int) : Boolean {} */

class Solution: VersionControl() {
    override fun firstBadVersion(n: Int): Int {
        var start = 1
        var end = n
        while (start < end) {
            var mid =start + (end-start) / 2
            println("${start} and ${end} ")
            if(!isBadVersion(mid)) {
                start=mid+1
            }else end=mid
        }
        return end
    }
}