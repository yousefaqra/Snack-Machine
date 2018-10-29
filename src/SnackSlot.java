
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
public class SnackSlot {
    
    private Snack[][] snacks;
    
    
      public SnackSlot(List<Snack> snackList) {
    	snacks= new Snack[][]{
                {snackList.get(0), snackList.get(1), snackList.get(2), snackList.get(3), snackList.get(4)},
                {snackList.get(5), snackList.get(6), snackList.get(7), snackList.get(8), snackList.get(9)},
                {snackList.get(10), snackList.get(11), snackList.get(12), snackList.get(13), snackList.get(14)},
                {snackList.get(15), snackList.get(16), snackList.get(17), snackList.get(18), snackList.get(19)},
                {snackList.get(20), snackList.get(21), snackList.get(22), snackList.get(23), snackList.get(24)},
       
        };
    }

	public Snack[][] getSnacks() {
		return snacks;
	}

	public void setSnacks(Snack[][] snacks) {
		this.snacks = snacks;
	}

	public Snack getSpecificSnack(Integer snackNumber) {
		double snackRow = Math.floor(snackNumber / 5);
		int snackColumn = (snackNumber % 5) == 0 ? 4 : (snackNumber % 5) - 1;

		return snacks[(int) snackRow][snackColumn];
	}
}
