public class MatchesTournament {
    public static void main(String[] args) {
        int nTimes = 7;
        int nPartidas = numberOfMatches(nTimes);
        System.out.println(nPartidas);
    }


    public static int numberOfMatches(int n) {
        int matches = 0;
        int times = 0;
        while(n!=1){
        if(n%2 == 0){
            n = n/2;
            matches += n;
        }
    
        if(n%2 == 1){
            matches += (n-1)/2;
            n = (n+1)/2;
        }
     }
     return matches;
    }
}
