package StacknQueue;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class NextGreaterEle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size1 = sc.nextInt();
        int size2 = sc.nextInt();

        int[] nums1 = new int[size1];
        int[] nums2 = new int[size2];

        for(int i = 0;i<size1;i++){
            nums1[i] = sc.nextInt();
        }

        for(int i = 0;i<size2;i++){
            nums2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
    }
//brute force
//    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        int[] ans = new int[nums1.length];
//        int ind = 0;
//        for(int i =  0 ;i<nums1.length;i++){
//            int element = nums1[i];
//            int nextGreat = -1;
//            boolean found = false;
//            for(int j = 0;j<nums2.length;j++){
//                if(found){
//                    if(nums2[j] > element){
//                        nextGreat = nums2[j];
//                        break;
//                    }
//                }
//                if(nums2[j] == element){
//                    found = true;
//                }
//            }
//            ans[i] = nextGreat;
//        }
//        return ans;
//    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2){
        Stack<Integer> st = new Stack<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = nums2.length-1;i>=0;i--){
            while (!st.isEmpty() && st.peek() <= nums2[i]){
                st.pop();
            }
            if (st.isEmpty()) {
                map.put(nums2[i], -1);
            } else {
                map.put(nums2[i], st.peek());
            }
            st.push(nums2[i]);
        }
        int[] ans = new int[nums1.length];

        for(int i=0; i<nums1.length; i++){
            ans[i] = map.get(nums1[i]);
        }
        return ans;
    }

}
