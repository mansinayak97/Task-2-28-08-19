/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atm;

import static java.lang.System.out;

/**
 *
 * @author mansi
 */
public class HdfcCard implements AtmCards{

    @Override
    public void ChangePin() {
        out.println("pin changed :HDFC card");
    }

    @Override
    public void BalanceEnquiry() {
        out.println("balance enquiry done :HDFC card");
    }

    @Override
    public void Withdraw() {
            out.println("Amount withdrawn :HDFC card");
    }
    
}
