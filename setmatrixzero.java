class setmatrixzero {

  //1st problem by lonewolf, more to come

  public void setZeroes(int[][] matrix) {
    int[] row = new int[matrix.length];
    int[] column = new int[matrix[0].length];
    for (int i = 0; i < row.length; i++) {
      for (int j = 0; j < column.length; j++) if (matrix[i][j] == 0) {
        row[i] = -1;
        column[j] = -1;
      }
    }
    //System.out.println(Arrays.toString(row));
    //System.out.println(Arrays.toString(column));
    for (int i = 0; i < row.length; i++) {
      for (int j = 0; j < column.length; j++) {
        if (row[i] == -1 || column[j] == -1) matrix[i][j] = 0;
      }
    }
  }
}
