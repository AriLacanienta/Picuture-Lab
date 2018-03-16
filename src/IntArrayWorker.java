public class IntArrayWorker
{
  /** two dimensional matrix */
  private int[][] matrix = null;
  
  /** set the matrix to the passed one
    * @param theMatrix the one to use
    */
  public void setMatrix(int[][] theMatrix)
  {
    matrix = theMatrix;
  }
  
  /**
   * Method to return the total 
   * @return the total of the values in the array
   */
  public int getTotal()
  {
    int total = 0;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        total = total + matrix[row][col];
      }
    }
    return total;
  }
  
  /**
   * Method to return the total using a nested for-each loop
   * @return the total of the values in the array
   */
  public int getTotalNested()
  {
    int total = 0;
    for (int[] rowArray : matrix)
    {
      for (int item : rowArray)
      {
        total = total + item;
      }
    }
    return total;
  }
  
  /**
   * Method to fill with an increasing count
   */
  public void fillCount()
  {
    int numCols = matrix[0].length;
    int count = 1;
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < numCols; col++)
      {
        matrix[row][col] = count;
        count++;
      }
    }
  }
  
  /**
   * print the values in the array in rows and columns
   */
  public void print()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; col++)
      {
        System.out.print( matrix[row][col] + " " );
      }
      System.out.println();
    }
    System.out.println();
  }
  
  
  /** 
   * fill the array with a pattern
   */
  public void fillPattern1()
  {
    for (int row = 0; row < matrix.length; row++)
    {
      for (int col = 0; col < matrix[0].length; 
           col++)
      {
        if (row < col)
          matrix[row][col] = 1;
        else if (row == col)
          matrix[row][col] = 2;
        else
          matrix[row][col] = 3;
      }
    }
  }
   
  /**
   * count now many instances of an integer are in the matrix
   * @param find the integer to look for in the matrix
   * @return count of the number of times a passed integer value is found in the matrix
   */
  public int getCount(int find) {
	  int count = 0;
	  for(int[] i : matrix) {
		  for (int j: i) {
			  if(j == find)
				  count++;
		  }
	  }
	return count;
  }
  
  /**
   * find the largest value in a matrix
   * @return the largest value in the matrix
   */
  public int getLargest() {
	  int largest = 0;
	  for(int[] i : matrix) {
		  for (int j: i) {
			  if(j > largest)
				  largest = j;
		  }
	  }
	return largest;
  }
  
  /**
   * add all the numbers in a column together
   * @param column the index of the column to add
   * @return the total of all the numbers in the column
   */
  public int getColTotal(int column) {
	  int total = 0;
	  for(int i = 0; i < matrix.length; i++) {
		  total += matrix[i][column];
	  }
	return total;
  }
 
}