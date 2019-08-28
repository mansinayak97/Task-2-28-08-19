/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

/**
 *
 * @author mansi
 */
public class ATM {
    
    AtmCards cards;
    
    public void insertCard(AtmCards cards)
    {
        this.cards=cards;
    }
    
    public void enquiryOperation()
    {
        cards.BalanceEnquiry();
    }
    
    public void pinOperation()
    {
        cards.ChangePin();
    }
    
    public void withdrawOperation()
    {
        cards.Withdraw();
    }
    
    public static void main(String[] args) {
        ATM atm=new ATM();
        atm.insertCard(new HdfcCard());
        //atm.insertCard(new IciciCard());
        atm.enquiryOperation();
        atm.pinOperation();
        atm.withdrawOperation();
    }
    
}
