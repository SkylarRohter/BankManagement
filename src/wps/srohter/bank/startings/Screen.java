package wps.srohter.bank.startings;

import java.util.Scanner;

/**
 * @author skylarrohter
 */
public class Screen {
    public boolean createScreen(){
        Scanner input = new Scanner(System.in);
        boolean returnable = false;
        startScreen();
        selection();
        end();
        System.out.println();
        System.out.print("Your selection: ");
        int selection = input.nextInt();
        SortSelection sorter = new SortSelection(selection);
        sorter.sort();
        return returnable;
    }
    private void startScreen(){
        System.out.println("|--------------------------------|");
        System.out.println("|       Welcome to the Bank      |");
    }
    private void selection(){
        System.out.println("|--------------------------------|");
        System.out.println("|        Please Select One       |");
        System.out.println("|                                |");
        System.out.println("|       -=> Deposit (1) <=--     |");
        System.out.println("|       -=> Withdraw (2) <=--    |");
        System.out.println("|       -=> Settings (3) <=--    |");
        System.out.println("|        -=> Quit (4)<=--        |");
        System.out.println("|                                |");
        System.out.println("|--------------------------------|");
    }
    private void end(){
        System.out.println("|           BM Banking           |");
        System.out.println("|--------------------------------|");
    }
}
