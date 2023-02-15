package Entry;
import java.util.Arrays;
public class MatrixTranspose {
    public static void main(String[] args) {
        int [][] list = {{1, 2, 3},
                        {4, 5, 6}
                        };
        int [][] newList = new int [3][2];

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.print(list[i][j] + " ");
            }
            System.out.println();
        }


        for (int i=0; i<newList.length;i++){
            for (int j=0; j<newList[i].length;j++){
               newList[i][j] = list[j][i];
                System.out.print(newList[i][j]+" ");
            }
            System.out.println();
        }

    }
}
