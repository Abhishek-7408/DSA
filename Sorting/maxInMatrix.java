public class maxInMatrix {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        for(int i=0;i<maxtx.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]>max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
