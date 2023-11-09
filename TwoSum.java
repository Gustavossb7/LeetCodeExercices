import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String args[]){
        int[] lista = {1,2,3,4,5};
        int alvo = 5;
        int[] result = twoSum(lista, alvo);
        System.out.println("Indices dos elementos cuja soma é igual a " + alvo + ": " + result[1] + ", " + result[0]);
    }


    public static int[] twoSum(int[] nums, int target){
        int[] indices =  new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                indices[0] = nums[i];
                indices[1] = complement;
                return indices;
            }
            map.put(nums[i], i);
        }
        return new int[2];
    }
}