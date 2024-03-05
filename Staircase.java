public class Staircase {
    
    public static void main(String[] args) {
        int n = 5;

        Staircase staircase = new Staircase();

        int result = staircase.arrangeCoins(n);
        System.out.println(result);
    }

    public int arrangeCoins(int n) {
        int i = 1;
        while(n>=i){
            n -= i;
            i++;
        }
        return i-1;
    }
}
