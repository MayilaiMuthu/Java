package dsa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MajorityVote {
	
	public static void main(String[] args) {
		int[] arr = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
		System.out.println(findMajority(arr));
	}
	
    public static List<Integer> findMajority(int[] nums) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        int k = nums.length/3;
        if(k<=0){
            for(int i=0; i<nums.length; i++){
                b.add(nums[i]);
            }
            return b;
        }
        for(int i=0; i<nums.length; i++){
            a.add(nums[i]);
        }
        Collections.sort(a);
        int count = 0;
        for(int i=0; i<nums.length-1; i++){
            if(a.get(i)==a.get(i+1)){
                count++;
            }else{
                count=0;
            }
            if(count==k){
                b.add(a.get(i));
            }
        }
        return b;
    }
}
