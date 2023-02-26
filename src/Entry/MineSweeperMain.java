package Entry;

import java.util.Scanner;

public class MineSweeperMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Minesweeper\n"+"Please Write Size of the Board!");
        System.out.println("Row Number");
        int row = input.nextInt();
        System.out.println("Column Number");
        int col = input.nextInt();

        MineSweeper mine = new MineSweeper(row,col);
        mine.run();
    }
}
