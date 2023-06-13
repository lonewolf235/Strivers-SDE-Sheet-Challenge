import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class majority2 {
    public List<Integer> majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        int n=nums.length;
        List<Integer> ls=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1])
            count++;
            else{
                if(count>=(int)Math.floor(n/3))
                ls.add(nums[i-1]);
                count=0;
            }
        }
        if(count>=(int)Math.floor(n/3))
        ls.add(nums[n-1]);
        return ls;
    }
}
