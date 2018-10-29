
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
public class PaymentHandler {
    
    static MoneySlot moneySlot = new MoneySlot();
    
    
    public static int handlePayment( int userInput, int itemPrice , int value) {
        
		
		  
    
                  int totalMoney = 0;
              
		
		
			if (userInput == 1) { // coins 
				//System.out.println("Enter the value of the coin in cents: ");
			
				if (moneySlot.isValid(MoneyType.COINS, value)) {
					 totalMoney += value;
				} else {
					//"Hey, that coin is invalid
                                        return 0;
				}
			} else if (userInput == 2) {
			
				
				if ( moneySlot.isValid(MoneyType.NOTES,value)) {
					 totalMoney += value*100;
				} else {
					//"Hey, that note is invalid";
                                        return 0;
				}
			}else if (userInput == 3)  {
				
				
				if ( moneySlot.isValid(MoneyType.CARD, String.valueOf(value))) {
					
					//"Pick up your item , thank you for purchesing";
                                        return 1;
				}
                                else
                                {
                                    //"Sorry, you card is invalid. Try using another card"
                                    return 0;
                                }
			}	

                        return totalMoney;
	}
    
       public static int purchase (int itemPrice, int totalMoney){
        
        if(isValidPaymentAmount(itemPrice, totalMoney)) {
				int change = getChange(itemPrice, totalMoney);
				//System.out.println("change is :"+change);
				//System.out.println("Pick up your snack , Have a nice day!");
                                return change;
				
			}else {
			
                                return 0;
			}
    }
    
    private static int getChange(int itemPrice , int paymentAmount) {
        
		return paymentAmount - itemPrice;
	}
	
    private static boolean isValidPaymentAmount(int itemPrice, int paymentAmount) {
        
		int change = getChange(itemPrice, paymentAmount);
		if (change >= 0) {
			return true;
		}
		return false;
	}
    
    
}
