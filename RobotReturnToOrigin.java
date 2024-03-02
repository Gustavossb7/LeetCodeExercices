public class RobotReturnToOrigin {
    public static void main(String[] args) {
        String moves = "LL";
        boolean result = judgeCircle(moves);
        System.out.println(result);
    
    }

    public static boolean judgeCircle(String moves) {
        int[] coordinates = {0,0};
        for(int i = 0; i<moves.length();i++){
            if(moves.charAt(i) == 'U'){
            coordinates[1] += 1;
        }
            if(moves.charAt(i) == 'D'){
            coordinates[1] -= 1;
        }
            if(moves.charAt(i) == 'R'){
            coordinates[0] += 1;
        }
            if(moves.charAt(i) == 'L'){
            coordinates[0] -= 1;
        }}

        if(coordinates[0] == 0 && coordinates[1] == 0){
            return true;
        }
        else{
            return false;
        }
    }

}
