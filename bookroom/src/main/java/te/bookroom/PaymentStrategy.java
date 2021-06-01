/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package te.bookroom;

/**
 *
 * @author ROG

/**
 * Define the payment strategy interface, all the payment should implement this
 * interface.
 * 
 * @author troyyang
 *
 */
public interface PaymentStrategy {
	public void pay(int amount);
}