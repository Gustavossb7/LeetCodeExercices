package Arrays;
import java.util.Arrays;
public class ArrayPartition {
    

    public static void main(String[] args) {
        int[] lista = {5,2,1,3};
        int result = arrayPairSum(lista);
        System.out.println(result);
    }

    public static int arrayPairSum(int[] nums){
        Arrays.sort(nums);
        int pairSum = 0;
        for(int i = 0; i < nums.length; i += 2){
            pairSum += nums[i];
        }
        return pairSum;
    }
}
