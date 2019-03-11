package rocks.zipcode.io.quiz3.arrays;

import java.util.Arrays;
import java.util.Set;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board = new String[][]{};

    public TicTacToe(String[][] board) {

        this.board = board;
    }

    public TicTacToe() {

    }

    public String[] getRow(Integer value) {

         String[] arr = board[value];
         return arr;
    }

    public String[] getColumn(Integer value) {
        String[] column = new String[board.length]; // Here I assume a rectangular 2D array!
        for(int i=0; i<column.length; i++){
            column[i] = board[i][value];
        }
        return column;



    }

    public Boolean isRowHomogenous(Integer rowIndex) {
        boolean dup = false;
      String[] row=  getRow(rowIndex);

        for (int i=0;i<row.length;i++){
            for (int j=1;i<row.length-1;i++)

            if (row[i] == row[j]);
        }
        return true;


    }




    public Boolean isColumnHomogeneous(Integer columnIndex) {


        boolean dup = false;
        String[] row = getColumn(columnIndex);

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; i < row.length - 1; i++) {

                if (row[i] == row[j]) ;

                dup = true;


            }

        }
        return dup;
    }
    public String getWinner() {




        return null;
    }

    public String[][] getBoard() {
        return null;
    }
}
