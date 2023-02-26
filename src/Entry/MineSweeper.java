package Entry;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber, colNumber,size;
    int [][] map;
    int [][] board;
    boolean game= true;

    Random rand = new Random();
    Scanner input = new Scanner(System.in);

    MineSweeper(int rowNumber, int colNumber){
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new int[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.size = rowNumber*colNumber;
    }
    public void run (){
        int row,col,success=0;
        prepareGame();
        print(map);
        System.out.println("Game Started!");

        while (game){
            print(board);
            System.out.print("Row: ");
            row = input.nextInt();
            System.out.print("Column: ");
            col = input.nextInt();

            if (row<=0 || row>rowNumber ){
                System.out.println("Wrong row number");
                continue;
            }
            if (col<=0 || col>colNumber ){
                System.out.println("Wrong col number");
                continue;
            }
            if (map[row][col]!= -1){
                checkMine(row,col);
                success++;
                if (success==(size-(size/4))){
                    System.out.println("WINNNNN!");
                    break;
                }
            }else{
                game=false;
                System.out.println("Game Over!" +
                        "");
            }

        }
    }
    public void checkMine(int r,int c){
       if(map[r][c]==0){
           if ((r>0) && (c>0) && (map[r-1][c-1]== -1)){
               board[r][c] ++;
           }
           if ((r>0) && (map[r-1][c]== -1)){ //OK
               board[r][c] ++;
           }
           if ((r>0) &&  (c<colNumber-1) && (map[r-1][c+1]== -1)){ // OK
               board[r][c] ++;
           }
           if ((c>0) && (map[r][c-1]== -1)){ //OK
               board[r][c] ++; //4
           }
           if ((c<colNumber-1) && (map[r][c+1] == -1)){ //OK
               board[r][c] ++;
           }
           if ((r<rowNumber-1) && (c>0) && (map[r+1][c-1]== -1)){ //OK
               board[r][c] ++;
           }
           if ((r<rowNumber-1) && (map[r+1][c]== -1)){ //OK
               board[r][c] ++;
           }
           if ((r<rowNumber-1) && (c<colNumber-1) &&  (map[r+1][c+1]== -1)){ //OK
               board[r][c] ++;
           }
           if(board[r][c]==0){
               board[r][c]=-2;
           }
       }
    }
    public void prepareGame(){
        int randRow,randCol,count =0;
        while(count != (size/4)){

            randRow = rand.nextInt(rowNumber);
            randCol = rand.nextInt(colNumber);
            if (map[randRow][randCol] != -1){
                map[randRow][randCol] = -1;
                count++;
            }
        }
    }
    public void print (int [][] arr){
        for (int i = 0; i<arr.length;i++){
            for (int j = 0; j<arr[0].length;j++){
                if (arr[i][j]>=0)
                    System.out.print(" ");
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}