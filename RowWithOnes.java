public class RowWithOnes {
 public static void main(String[] args) {
    int[][] matrix = {{0,0,0},{0,1,1}};
    int[][] matrix2 = {{0,1},{1,0}};
    int[][] matrix3 = {{0,0,},{1,1},{0,0}};
    int[] vector = rowAndMaximumOnes(matrix3);
    System.out.println("["+vector[0]+","+ vector[1]+"]");
 }  
 
public static int[] rowAndMaximumOnes(int[][] mat) {
        int rowMax = 0;
        int numbersOne = 0;
        int maxNumbersOne = 0;
        int[] result = {0,0};
        for(int i = 0; i<mat.length; i++){
            numbersOne = 0;
            for(int j = 0; j<mat[i].length; j++){
                if(mat[i][j]==1){
                    numbersOne += 1;
                    
                } 
                
            }
            if(numbersOne > maxNumbersOne){
                maxNumbersOne=numbersOne;
                rowMax = i;
            }
            
        }
        result[0] = rowMax;
        result[1] = maxNumbersOne;
        return result;
 }
}
