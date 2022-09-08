package wps.srohter.bank.startings;

/**
 * @author skylarrohter
 */
public class Screen {
    public boolean createScreen(){
        boolean returnable = false;
        startScreen();
        selection();
        end();
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
