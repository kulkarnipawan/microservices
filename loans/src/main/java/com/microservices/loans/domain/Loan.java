/**
 * 
 */
package com.microservices.loans.domain;

/**
 * @author pawan
 *
 */
public class Loan {
	private int id;
	private double amount;
	private double tenure;
	
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the tenure
	 */
	public double getTenure() {
		return tenure;
	}
	/**
	 * @param tenure the tenure to set
	 */
	public void setTenure(double tenure) {
		this.tenure = tenure;
	}
	
	

}
