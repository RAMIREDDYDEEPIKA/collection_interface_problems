package mapInterface;

import java.util.*;

public class ArrayIntersection
{
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        findIntersection(nums1,nums2);
    }

    public static void findIntersection(int[] nums1, int[] nums2)
    {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> intersection = new ArrayList<>();

        for (int num : nums1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int num : nums2) {
            if (map.getOrDefault(num, 0) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1);
            }
        }

        int[] result = new int[intersection.size()];
        for (int i = 0; i < intersection.size(); i++)
        {
            result[i] = intersection.get(i);
            System.out.println("Intersection of arrays: "+result[i]);
            break;
        }
    }
}