import java.util.ArrayList;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // foo, bar as two arrays
        // if foo < bar, add arraylist to foo, or bar
        //   foo ++
        // for the arraylist, find the median
        ArrayList<Integer> l = new ArrayList<Integer>();
        int foo = 0, bar = 0;
        while (true) {
            if (foo >= nums1.length) {
                if (bar >= nums2.length) {
                    break;
                } else {
                    for (int i = bar; i < nums2.length; i++) {
                        l.add(nums2[i]);
                    }
                    break;
                }
            }
            if (bar >= nums2.length) {
                if (foo >= nums1.length) {
                    break;
                } else {
                    for (int i = foo; i < nums1.length; i++) {
                        l.add(nums1[i]);
                    }
                    break;
                }
            }

            if (nums1[foo] <= nums2[bar]) {
                l.add(nums1[foo]);
                foo++;
            } else {
                l.add(nums2[bar]);
                bar++;
            }
        }

        int size = l.size();
        if (size == 0) {
            return 0.0;
        } else if ((size % 2) == 1) {
            return l.get((size-1)/2);
        } else {
            return (l.get(size/2)+l.get(size/2-1))/2.0;
        }
    }

    /*public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(s.findMedianSortedArrays(nums1, nums2));
    }*/
}