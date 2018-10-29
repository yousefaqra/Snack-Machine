/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author User
 */
public enum Money {
    
    	_10C("10C", 10),
	_20C("20C", 20),
	_50C("50C", 50),
	_$1("$1", 100),
	_$20("$20", 2000),
	_$50("$50", 5000),
	USD("USD",-1);
	
	private String name;
	private int value;
	Money(String name, int value) {
		this.name = name;
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
