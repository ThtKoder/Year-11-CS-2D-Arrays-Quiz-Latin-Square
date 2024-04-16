public class LatinSquare {

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the sum of consecutive integers 1 + 2 + ... + N
     */
    public static int targetCheckSum1(int rowSize) {
        int sum = 0;
        for(int i = 1; i<rowSize+1;i++){
            sum+=i;
        }
        return sum;
    }

    /**
     *
     * @param rowSize
     * @return given the rowSize N (corresponding to an array of size N x N),
     *         calculate and return the product of consecutive integers 1 * 2 * ... * N
     */
    public static int targetCheckSum2(int rowSize) {
        int prod=1;
        for(int i = 1; i<rowSize+1;i++){
            prod*=i;
        }
        return prod;
    }


    /**
     *
     * @param array2d
     * @param checkSum1
     * @param checkSum2
     * @return whether or not every row's sum in array2d is equal to checkSum1,
     *         AND that every row's product in array2d is equal to checkSum2
     */
    public static boolean isLatinRows(int[][] array2d, int checkSum1, int checkSum2) {
        for(int j = 0; j<array2d.length; j++) {
            //creates values that should be for latin square, then compares with them of the method
            int rowsSum = 0;
            for(int i = 1; i<array2d[0].length;i++){
                rowsSum += array2d[i][j];
            }

            int rowsProd = 1;
            for(int i = 1; i<array2d[0].length;i++){
                rowsProd*=array2d[i][j];
            }

            if (checkSum1 == rowsSum && checkSum2 == rowsProd) {
                j++;
            }
            if(j == array2d.length-1){
                return true;
            }
        }
        return false;
    }

    /**
     *
     * @param array2d
     * @param checkSum1
     * @param checkSum2
     * @return whether or not every column's sum in array2d is equal to checkSum1,
     *         AND that every column's product in array2d is equal to checkSum2
     */
    public static boolean isLatinColumns(int[][] array2d, int checkSum1, int checkSum2) {
        for(int j = 0; j<array2d.length; j++) {
            //creates values that should be for latin square, then compares with them of the method
            int colsSum = 0;
            for(int i = 1; i<array2d[0].length;i++){
                colsSum+= array2d[j][i];
            }

            int colsProd = 1;
            for(int i = 1; i<array2d[0].length;i++){
                colsProd*= array2d[j][i];
            }

            if (checkSum1 == colsSum && checkSum2 == colsProd) {
                j++;
            }
            if(j == array2d.length-1){
                return true;
            }
        }
        return false;
    }


    /**
     *
     * @param array2d
     * @return whether array2d is a Latin square or not.
     *         Hint: make use of isLatinRows and isLatinColumns
     */
    public static boolean isLatinSquare(int[][] array2d) {
        if(isLatinRows(array2d, array2d.length, array2d.length) && isLatinColumns(array2d,array2d[0].length,array2d[0].length)){
            return true;
        }
        return false;
    }

    /** OPTIONAL (only do if you have time)
     *
     * @param array2d
     * @return whether or not array2d is a latin square
     *         as well as whether the sum and product of each of the two main diagonals is equal
     *         to the checkSums or not.
     *
     * NOTE: not all Latin squares are diagonal; for example, diagonal Latin squares do not exist for 2x2 or 3x3
     */
    public static boolean isDiagonalLatinSquare(int[][] array2d) {
        return false;
    }

}
