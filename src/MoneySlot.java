
import enums.Money;
import enums.MoneyType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class MoneySlot {
    
    //Vlaidate Coins and Notes
    public boolean isValid(MoneyType mt, int m) {
		boolean isValid = false;
		if (mt == MoneyType.CARD) {
			return false;
		} else if (mt == MoneyType.COINS) {
			if (m == Money._10C.getValue() || m == Money._20C.getValue() || m == Money._50C.getValue() || m == Money._$1.getValue())
				isValid = true;
		} else if (mt == MoneyType.NOTES) {
			m*=100;
			if (m  == Money._$20.getValue() || m == Money._$50.getValue())
				isValid = true;
			}

		return isValid;
	}
    
    //Vlidate Cards
    	public boolean isValid(MoneyType mt, String m) {
		boolean isValid = false;
		if (mt == MoneyType.CARD) {
			if(m!=null && m.length()==9) {
				try {
					long l = Long.valueOf(m);
					isValid = true;
				}catch(Exception exc) {}
			}
		}
		return isValid;
	}
    
}
