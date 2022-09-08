package wps.srohter.bank.startings;

import wps.srohter.bank.startings.funds.Deposit;
import wps.srohter.bank.startings.funds.Withdraw;

public class SortSelection {
    public int selection;

    public SortSelection(int selection) {
        this.selection = selection;
    }
    public void sort(){
        if(selection == 1){
            Deposit deposit = new Deposit();
        }
        else if(selection == 2){
            Withdraw withdraw = new Withdraw();
        }
        else if(selection == 3){
            //Settings
        }
        else if(selection == 4){
            //Quit
        }
        else{
            //Fallback
        }
    }
}
