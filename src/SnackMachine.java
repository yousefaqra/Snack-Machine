
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SnackMachine {
    
    SnackSlot snackSlot ;
    
    
    public Snack selectSnack(Integer snackNumber) {
		Snack snacks = snackSlot.getSpecificSnack(snackNumber);
		if (snacks.getQuantity() == 0) {
			return null;
		} else {
			return snacks;
		}
	}
    
    public void fillMachine() {
		Snack snack;
		
		List<Snack> snackList = new ArrayList<>();
		int quantity =  20;
		for (int i = 0; i < 25; i++) {
			snack = new Snack("Snack" + i, 50,quantity>0? quantity--:quantity);
			snackList.add(snack);
		}
		snackSlot = new SnackSlot(snackList);
	}
}
