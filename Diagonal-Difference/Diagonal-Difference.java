class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        int columnCount = arr.get(0).size(); // getting matrix's row and column size
        int primaryDiognal = 0; 
        int secondaryDiognal = 0;
        int counterForPrimary = 0;
        int counterForSecondary = columnCount-1; // because it ends in (size-1)th index.
        for(int i=0; i<columnCount; i++){ 
            primaryDiognal += arr.get(i).get(counterForPrimary);
            counterForPrimary++;
            secondaryDiognal += arr.get(i).get(counterForSecondary);
            counterForSecondary--;
        }
        int difference = primaryDiognal - secondaryDiognal;
        
        return Math.abs(difference); // getting abs

    }

}