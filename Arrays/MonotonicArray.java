import java.util.Arrays;

public class MonotonicArray {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2};
        MonotonicArray array = new MonotonicArray();
        System.out.println(array.isMonotonic(nums));
    }

    public boolean isMonotonic(int[] nums) {
        // Crie uma cópia do array nums
        int[] nums2 = Arrays.copyOf(nums, nums.length);

        // Ordene o array nums
        Arrays.sort(nums);

        // Verifique se nums e nums2 são iguais
        if(Arrays.equals(nums2, nums)){
            return true;
        }

        // Inverta o array nums2
        for(int i = 0; i < nums2.length / 2; i++){
            int temp = nums2[i];
            nums2[i] = nums2[nums2.length - i - 1];
            nums2[nums2.length - i - 1] = temp;
        }

        // Verifique novamente se nums e nums2 são iguais
        if(Arrays.equals(nums2, nums)){
            return true;
        }
        return false;
    }
}
