public class Test4 {
   /* 4. 寻找两个正序数组的中位数

    给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。

    算法的时间复杂度应该为 O(log (m+n)) 。



    示例 1：

    输入：nums1 = [1,3], nums2 = [2]
    输出：2.00000
    解释：合并数组 = [1,2,3] ，中位数 2

    示例 2：

    输入：nums1 = [1,2], nums2 = [3,4]
    输出：2.50000
    解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5*/

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2=nums2.length;
        //123 456
        mid=(l1+l2)/2;
        double method(int[] s1, int[] s2){

            return mid;
        }

        //123 234789

    }

    private int getNo(int[]nums1,int start1,int end1,int[]nums2,int start2,int end2,int k){
        int len1=end1-start1+1;//数组长度
        int len2=end2-start2+1;

    }
}
